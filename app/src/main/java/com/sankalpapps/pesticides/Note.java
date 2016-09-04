package com.sankalpapps.pesticides;

/**
 * Created by Sankalp on 26-06-2016.
 */
public class Note {
    private String title, message;
    private long noteId, dateCreatedMilli;
    private Category category;

    public enum Category {APPLES, PEACHES, NECTARINES, STRAWBERRIES, GRAPES, CELERY, SPINACH,
        SWEET_BELL_PEPPERS, CUCUMBERS, CHERRY_TOMATOES, SNAP_PEAS, POTATOES, AVOCADOS, SWEET_CORN, PINEAPPLES, CABBAGE,
        SWEET_PEAS,ONIONS,ASPARAGUS,MANGOS,PAPAYAS,KIWI,EGGPLANT,GRAPEFRUIT,CANTALOUPE,CAULIFLOWER,SWEET_POTATOES
    }

    public Note(String title, String message, Category category) {
        this.title = title;
        this.message = message;
        this.noteId = 0;
        this.dateCreatedMilli = 0;
        this.category = category;
    }

    public Note(String title, String message, long noteId, long dateCreatedMilli, Category category) {
        this.title = title;
        this.message = message;
        this.noteId = noteId;
        this.dateCreatedMilli = dateCreatedMilli;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getNoteId() {
        return noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
    }

    public long getDateCreatedMilli() {
        return dateCreatedMilli;
    }

    public void setDateCreatedMilli(long dateCreatedMilli) {
        this.dateCreatedMilli = dateCreatedMilli;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", noteId=" + noteId +
                ", dateCreatedMilli=" + dateCreatedMilli +
                ", category=" + category +
                '}';
    }

    public int getAssociatedDrawable(){
        return categoryToDrawable(category);
    }


    public static int categoryToDrawable(Category noteCategory) {

        switch (noteCategory) {
            case SNAP_PEAS:
                return R.drawable.peas;
            case POTATOES:
                return R.drawable.potatoes;
            case AVOCADOS:
                return R.drawable.avocardo;
            case SWEET_CORN:
                return R.drawable.corn;
            case PINEAPPLES:
                return R.drawable.pineapple;
            case APPLES:
                return R.drawable.apple;
            case PEACHES:
                return R.drawable.peaches;
            case STRAWBERRIES:
                return R.drawable.strawberries;
            case NECTARINES:
                return R.drawable.nectarine;
            case GRAPES:
                return R.drawable.grapes;
            case CELERY:
                return R.drawable.celery;
            case SPINACH:
                return R.drawable.spinach;
            case SWEET_BELL_PEPPERS:
                return R.drawable.bellpapers;
            case CUCUMBERS:
                return R.drawable.cucumbers;
            case CHERRY_TOMATOES:
                return R.drawable.cherrytomatoes;
            case CABBAGE:
                return R.drawable.cabbage;
            case SWEET_PEAS:
                return R.drawable.sweetpeas;
            case ONIONS:
                return R.drawable.onions;
            case ASPARAGUS:
                return R.drawable.aspharagus;
            case PAPAYAS:
                return R.drawable.papaya;
            case MANGOS:
                return R.drawable.mangoes;
            case KIWI:
                return R.drawable.kiwi;
            case EGGPLANT:
                return R.drawable.eggplant;
            case GRAPEFRUIT:
                return R.drawable.frapefruit;
            case CANTALOUPE:
                return R.drawable.cantaloupe;
            case CAULIFLOWER:
                return R.drawable.cauliflower;
            case SWEET_POTATOES:
                return R.drawable.sweetpotatoes;




        }
        return R.drawable.p;
    }

}
