package com.sankalpapps.notebook;


import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityListFragment extends ListFragment {


    private  ArrayList<Note> noteList;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        noteList = new ArrayList<>();
        noteList.add(new Note("1. Massachusetts Institute of Technology (MIT)","Massachusetts Institute of Technology (MIT) is not only the top" +
                " university in the US, but it has also now been ranked first in the world for four years in a row. It has produced many notable" +
                " and successful alumni and is not only known for its courses in the technology-related fields of physical sciences" +
                " and engineering, but in recent times also for its biology, economics, linguistics and management courses. ", Note.Category.MIT));
        noteList.add(new Note("2. Harvard University","Ranked second in the world overall, Harvard University takes the top spot for life sciences and medicine, as" +
                " well as placing joint second with the University of Cambridge for arts and humanities. Harvard is the oldest institution of higher education" +
                " in the United States, having been established in 1636.", Note.Category.HARVARD));
        noteList.add(new Note("3. Stanford University","Ranked joint third in the world alongside the University of Cambridge, Stanford University is known for its" +
                " entrepreneurial character and business courses. It also comes second in the world for engineering and technology, after MIT. Its alumni and" +
                " faculty have founded many internationally successful companies, including Google, Yahoo!, Nike and Instagram.", Note.Category.STANFORD));
        noteList.add(new Note("4. California Institute Of Technology (Caltech)","Located in Pasadena, California, the California Institute of Technology" +
                " (Caltech) is ranked 5th in the world this year. With only around 2,200 students, it’s by far the smallest of these top US universities." +
                " It is highly respected for its research in science and engineering, and retains its place as the 8th best university in the field of" +
                " natural sciences this year.", Note.Category.CALTECH));
        noteList.add(new Note("5. University of Chicago","The University of Chicago is ranked 10th in the world, and is highly regarded for both arts" +
                " and sciences courses. The university’s press is the largest in the US and its alumni includes 89 Nobel Prize winners. Chicago's" +
                " physics department helped develop the world's first man-made, self-sustaining nuclear reaction underneath one of the university’s" +
                " football fields.", Note.Category.CHICAGO));
        noteList.add(new Note("6. Princeton University","Placed 11th in this year’s world rankings, Princeton was established" +
                " in 1746 and is particularly prestigious in the arts and humanities. The university offers generous financial aid" +
                " to ensure talented students from all walks of life are able to attend. Its alumni include US presidents Woodrow Wilson" +
                " and James Madison, amongst many other successful people.", Note.Category.PRINCETON));
        noteList.add(new Note("7. Yale University","Yale University is ranked 15th in the world this year and is one of the oldest US universities," +
                " having been founded in 1701. In 1861, Yale awarded the first PhD in the United States. It has produced many notable alumni," +
                " including five US presidents and 13 billionaires.", Note.Category.YALE));
        noteList.add(new Note("8. Johns Hopkins University","Ranked 16th in the world this year, Johns Hopkins University was named for its first benefactor" +
                " – the entrepreneur, abolitionist, and philanthropist Johns Hopkins. It was the first research university in the US and is viewed" +
                " particularly favorably for its courses in the faculty of life sciences and medicine.", Note.Category.HOPKINS));
        noteList.add(new Note("9. Cornell University","Ranked 17th in the world this year, Cornell University is an Ivy League member based in Ithaca, New York. Cornell" +
                " awarded the world's first degree in journalism and was the first among US universities to offer a major in American Studies. English actor" +
                " John Cleese is a visiting professor, while the school’s alumni community includes Bill Nye “the Science Guy”.", Note.Category.CORNELL));
        noteList.add(new Note("10. University of Pennsylvania","The University of Pennsylvania is ranked 18th in the world and was founded by one of" +
                " the US’s founding fathers, Benjamin Franklin. It is consistently highly ranked and highly regarded across the board, with a" +
                " particularly strong reputation in the life sciences and medicine.", Note.Category.PENNSYLVANIA));

        NoteAdapter noteAdapter = new NoteAdapter(getActivity(),noteList);
        setListAdapter(noteAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.black));
        getListView().setDividerHeight(3);

    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        launchNoteDetailActivity(position);

    }

    private void launchNoteDetailActivity(int position){
        Note note = (Note)getListAdapter().getItem(position);
        Intent intent = new Intent(getActivity(),NoteDetailActivity.class);
        intent.putExtra(MainActivity.NOTE_TITLE_EXTRA,note.getTitle());
        intent.putExtra(MainActivity.NOTE_MESSAGE_EXTRA,note.getMessage());
        intent.putExtra(MainActivity.NOTE_CATEGORY_EXTRA,note.getCategory());
        intent.putExtra(MainActivity.NOTE_ID_EXTRA,note.getNoteId());
        startActivity(intent);

    }


}
