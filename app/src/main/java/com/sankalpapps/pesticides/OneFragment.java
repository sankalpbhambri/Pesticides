package com.sankalpapps.pesticides;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;


public class OneFragment extends ListFragment {


    private ArrayList<Note> noteList;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        noteList = new ArrayList<>();
        noteList.add(new Note("1. Apples","", Note.Category.APPLES));
        noteList.add(new Note("2. Peaches","", Note.Category.PEACHES));
        noteList.add(new Note("3. Nectarines","", Note.Category.NECTARINES));
        noteList.add(new Note("4. Strawberries","", Note.Category.STRAWBERRIES));
        noteList.add(new Note("5. Grapes","", Note.Category.GRAPES));
        noteList.add(new Note("6. Celery","", Note.Category.CELERY));
        noteList.add(new Note("7. Spinach","", Note.Category.SPINACH));
        noteList.add(new Note("8. Sweet bell peppers","", Note.Category.SWEET_BELL_PEPPERS));
        noteList.add(new Note("9. Cucumbers", "", Note.Category.CUCUMBERS));
        noteList.add(new Note("10. Cherry tomatoes", "", Note.Category.CHERRY_TOMATOES));
        noteList.add(new Note("11. Snap peas", "", Note.Category.SNAP_PEAS));
        noteList.add(new Note("12. Potatoes", "", Note.Category.POTATOES));

        NoteAdapter noteAdapter = new NoteAdapter(getActivity(),noteList);
        setListAdapter(noteAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.black));
        getListView().setDividerHeight(3);

    }




}
