package com.eddyizm.tempus.subsonic.models;

import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class User {
    public static final int $stable = 8;
    private Date avatarLastChanged;
    private String email;
    private List<Integer> folders;
    private boolean isAdminRole;
    private boolean isCommentRole;
    private boolean isCoverArtRole;
    private boolean isDownloadRole;
    private boolean isJukeboxRole;
    private boolean isPlaylistRole;
    private boolean isPodcastRole;
    private boolean isScrobblingEnabled;
    private boolean isSettingsRole;
    private boolean isShareRole;
    private boolean isStreamRole;
    private boolean isUploadRole;
    private boolean isVideoConversionRole;
    private Integer maxBitRate;
    private String username;

    public User() {
    }

    public final Date getAvatarLastChanged() {
        return this.avatarLastChanged;
    }

    public final String getEmail() {
        return this.email;
    }

    public final List<Integer> getFolders() {
        return this.folders;
    }

    public final Integer getMaxBitRate() {
        return this.maxBitRate;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean isAdminRole() {
        return this.isAdminRole;
    }

    public final boolean isCommentRole() {
        return this.isCommentRole;
    }

    public final boolean isCoverArtRole() {
        return this.isCoverArtRole;
    }

    public final boolean isDownloadRole() {
        return this.isDownloadRole;
    }

    public final boolean isJukeboxRole() {
        return this.isJukeboxRole;
    }

    public final boolean isPlaylistRole() {
        return this.isPlaylistRole;
    }

    public final boolean isPodcastRole() {
        return this.isPodcastRole;
    }

    public final boolean isScrobblingEnabled() {
        return this.isScrobblingEnabled;
    }

    public final boolean isSettingsRole() {
        return this.isSettingsRole;
    }

    public final boolean isShareRole() {
        return this.isShareRole;
    }

    public final boolean isStreamRole() {
        return this.isStreamRole;
    }

    public final boolean isUploadRole() {
        return this.isUploadRole;
    }

    public final boolean isVideoConversionRole() {
        return this.isVideoConversionRole;
    }

    public final void setAdminRole(boolean r1) {
        this.isAdminRole = r1;
    }

    public final void setAvatarLastChanged(Date r1) {
        this.avatarLastChanged = r1;
    }

    public final void setCommentRole(boolean r1) {
        this.isCommentRole = r1;
    }

    public final void setCoverArtRole(boolean r1) {
        this.isCoverArtRole = r1;
    }

    public final void setDownloadRole(boolean r1) {
        this.isDownloadRole = r1;
    }

    public final void setEmail(String r1) {
        this.email = r1;
    }

    public final void setFolders(List<Integer> r1) {
        this.folders = r1;
    }

    public final void setJukeboxRole(boolean r1) {
        this.isJukeboxRole = r1;
    }

    public final void setMaxBitRate(Integer r1) {
        this.maxBitRate = r1;
    }

    public final void setPlaylistRole(boolean r1) {
        this.isPlaylistRole = r1;
    }

    public final void setPodcastRole(boolean r1) {
        this.isPodcastRole = r1;
    }

    public final void setScrobblingEnabled(boolean r1) {
        this.isScrobblingEnabled = r1;
    }

    public final void setSettingsRole(boolean r1) {
        this.isSettingsRole = r1;
    }

    public final void setShareRole(boolean r1) {
        this.isShareRole = r1;
    }

    public final void setStreamRole(boolean r1) {
        this.isStreamRole = r1;
    }

    public final void setUploadRole(boolean r1) {
        this.isUploadRole = r1;
    }

    public final void setUsername(String r1) {
        this.username = r1;
    }

    public final void setVideoConversionRole(boolean r1) {
        this.isVideoConversionRole = r1;
    }
}
