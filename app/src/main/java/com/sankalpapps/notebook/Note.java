package com.sankalpapps.notebook;

/**
 * Created by Sankalp on 26-06-2016.
 */
public class Note {
    private String title, message;
    private long noteId, dateCreatedMilli;
    private Category category;

    public enum Category {MIT, HARVARD, STANFORD, CALTECH, CHICAGO,PRINCETON,YALE,HOPKINS,CORNELL,PENNSYLVANIA}

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
            case MIT:
                return R.drawable.mit_university;
            case HARVARD:
                return R.drawable.harvard_university;
            case CALTECH:
                return R.drawable.caltech_university;
            case STANFORD:
                return R.drawable.stanford_university;
            case CHICAGO:
                return R.drawable.chicago_university;
            case PRINCETON:
                return R.drawable.princeton_university;
            case YALE:
                return R.drawable.yale_university;
            case HOPKINS:
                return R.drawable.hopkins_university;
            case CORNELL:
                return R.drawable.cornell_university;
            case PENNSYLVANIA:
                return R.drawable.pennsylvania_university;

        }
        return R.drawable.p;
    }

}
