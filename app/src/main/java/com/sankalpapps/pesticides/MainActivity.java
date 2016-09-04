package com.sankalpapps.pesticides;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    public static final String NOTE_ID_EXTRA = "com.sankalpapps.courses.Note Identifier";
    public static final String NOTE_TITLE_EXTRA = "com.sankalpapps.courses.Note Title";
    public static final String NOTE_MESSAGE_EXTRA = "com.sankalpapps.courses.Note Message";
    public static final String NOTE_CATEGORY_EXTRA = "com.sankalpapps.courses.Note Category";

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), getResources().getString(R.string.one));
        adapter.addFragment(new TwoFragment(),  getResources().getString(R.string.two));
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    public void submit(View button) {
        final EditText nameField = (EditText) findViewById(R.id.name);
        String name = nameField.getText().toString();

        final EditText emailField = (EditText) findViewById(R.id.email);
        String email = emailField.getText().toString();

        final EditText messageField = (EditText) findViewById(R.id.message);
        String message = messageField.getText().toString();

        final EditText phoneField = (EditText) findViewById(R.id.phone);
        String phone = phoneField.getText().toString();

        Intent mEmail = new Intent(Intent.ACTION_SEND);
        mEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{ "sankalp_bhambri@yahoo.co.in"});
        mEmail.putExtra(Intent.EXTRA_SUBJECT, "Enquiry");
        mEmail.putExtra(Intent.EXTRA_TEXT, message + " from " + name +" mail id " + email + " contact number " + phone);

        // prompts to choose email client
        mEmail.setType("message/rfc822");
        try {
            startActivity(Intent.createChooser(mEmail, "Choose an email client to send your feedback!"));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }


    }
}