package com.sample.messages;

import android.database.AbstractCursor;
import android.database.Cursor;

/**
 * @author Rahul Purohit 
 * created  Apr 15, 2015 on 5:19:54 PM 
 */
public class MessagesCursor extends AbstractCursor implements MessagesModel {
    public MessagesCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(MessagesColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code account} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getAccount() {
        String res = getStringOrNull(MessagesColumns.ACCOUNT);
        return res;
    }

    /**
     * Get the {@code user} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getUser() {
        String res = getStringOrNull(MessagesColumns.USER);
        return res;
    }

    /**
     * Get the {@code to_user} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getToUser() {
        String res = getStringOrNull(MessagesColumns.TO_USER);
        return res;
    }

    /**
     * Get the {@code resource} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getResource() {
        String res = getStringOrNull(MessagesColumns.RESOURCE);
        return res;
    }

    /**
     * Get the {@code text} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getText() {
        String res = getStringOrNull(MessagesColumns.TEXT);
        return res;
    }

    /**
     * Get the {@code action} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getAction() {
        String res = getStringOrNull(MessagesColumns.ACTION);
        return res;
    }

    /**
     * Get the {@code timestamp} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getTimestamp() {
        Integer res = getIntegerOrNull(MessagesColumns.TIMESTAMP);
        return res;
    }

    /**
     * Get the {@code incoming} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getIncoming() {
        Integer res = getIntegerOrNull(MessagesColumns.INCOMING);
        return res;
    }

    /**
     * Get the {@code read} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getRead() {
        Integer res = getIntegerOrNull(MessagesColumns.READ);
        return res;
    }

    /**
     * Get the {@code sent} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getSent() {
        Integer res = getIntegerOrNull(MessagesColumns.SENT);
        return res;
    }

    /**
     * Get the {@code error} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getError() {
        Integer res = getIntegerOrNull(MessagesColumns.ERROR);
        return res;
    }

    /**
     * Get the {@code tag} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getTag() {
        String res = getStringOrNull(MessagesColumns.TAG);
        return res;
    }
}
