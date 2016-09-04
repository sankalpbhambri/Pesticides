package com.sankalpapps.pesticides;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;



public class TwoFragment extends ListFragment {


    private ArrayList<Note> noteList;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

            noteList = new ArrayList<>();
            noteList.add(new Note("1. Avocados","", Note.Category.AVOCADOS));
            noteList.add(new Note("2. Sweet corn","", Note.Category.SWEET_CORN));
            noteList.add(new Note("3. Pineapples","", Note.Category.PINEAPPLES));
            noteList.add(new Note("4. Cabbage", "", Note.Category.CABBAGE));
            noteList.add(new Note("5. Sweet peas (frozen)","", Note.Category.SWEET_PEAS));
            noteList.add(new Note("6. Onions","", Note.Category.ONIONS));
            noteList.add(new Note("7. Asparagus","", Note.Category.ASPARAGUS));
            noteList.add(new Note("8. Mangos","", Note.Category.MANGOS));
            noteList.add(new Note("9. Papayas", "", Note.Category.PAPAYAS));
            noteList.add(new Note("10. Kiwi", "", Note.Category.KIWI));
            noteList.add(new Note("11. Eggplant", "", Note.Category.EGGPLANT));
            noteList.add(new Note("12. Grapefruit", "", Note.Category.GRAPEFRUIT));
            noteList.add(new Note("13. Cantaloupe", "", Note.Category.CANTALOUPE));
            noteList.add(new Note("14. Cauliflower", "", Note.Category.CAULIFLOWER));
            noteList.add(new Note("15. Sweet potatoes", "", Note.Category.SWEET_POTATOES));

            NoteAdapter noteAdapter = new NoteAdapter(getActivity(),noteList);
        setListAdapter(noteAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.black));
        getListView().setDividerHeight(3);

    }


}
