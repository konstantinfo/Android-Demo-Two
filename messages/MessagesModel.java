package com.sample.messages;

/**
 * @author Rahul Purohit 
 * created  Apr 15, 2015 on 7:19:54 PM 
 */
package com.sample.messages;


/**
 * Messages Class.
 */
public interface MessagesModel extends BaseModel {

    /**
     * Get the {@code account} value.
     * Can be {@code null}.
     */
    @Nullable
    String getAccount();

    /**
     * Get the {@code user} value.
     * Can be {@code null}.
     */
    @Nullable
    String getUser();

    /**
     * Get the {@code to_user} value.
     * Can be {@code null}.
     */
    @Nullable
    String getToUser();

    /**
     * Get the {@code resource} value.
     * Can be {@code null}.
     */
    @Nullable
    String getResource();

    /**
     * Get the {@code text} value.
     * Can be {@code null}.
     */
    @Nullable
    String getText();

    /**
     * Get the {@code action} value.
     * Can be {@code null}.
     */
    @Nullable
    String getAction();

    /**
     * Get the {@code timestamp} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getTimestamp();

    /**
     * Get the {@code incoming} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getIncoming();

    /**
     * Get the {@code read} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getRead();

    /**
     * Get the {@code sent} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getSent();

    /**
     * Get the {@code error} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getError();

    /**
     * Get the {@code tag} value.
     * Can be {@code null}.
     */
    @Nullable
    String getTag();
}