
package org.standardnotes.notes.comms.data;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * 
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Note {

    /**
     * 
     * <p>
     * 
     * 
     */
    @SerializedName("original")
    @Expose
    private EncryptedItem original;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("text")
    @Expose
    private String text;

    /**
     * 
     * <p>
     * 
     * 
     * @return
     *     The original
     */
    public EncryptedItem getOriginal() {
        return original;
    }

    /**
     * 
     * <p>
     * 
     * 
     * @param original
     *     The original
     */
    public void setOriginal(EncryptedItem original) {
        this.original = original;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

}
