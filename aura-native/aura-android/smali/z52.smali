.class public abstract Lz52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static a:Landroid/media/session/MediaSession;

.field public static b:Lx52;

.field public static final c:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lz52;->c:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method

.method public static final a(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lu52;->c()Lv52;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v0, v0, Lv52;->a:Z

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v2, 0x18

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v0, v2, :cond_2

    .line 22
    .line 23
    const/16 v2, 0x19

    .line 24
    .line 25
    if-eq v0, v2, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    const/4 v0, -0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move v0, v3

    .line 31
    :goto_0
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getAction()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_3

    .line 36
    .line 37
    sget-object p0, Lz52;->a:Landroid/media/session/MediaSession;

    .line 38
    .line 39
    if-eqz p0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/media/session/MediaSession;->getController()Landroid/media/session/MediaController;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v0, v3}, Landroid/media/session/MediaController;->adjustVolume(II)V

    .line 48
    .line 49
    .line 50
    :cond_3
    return v3
.end method

.method public static b()V
    .locals 2

    .line 1
    sget-object v0, Lz52;->a:Landroid/media/session/MediaSession;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/media/session/MediaSession;->setActive(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object v0, Lz52;->a:Landroid/media/session/MediaSession;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/media/session/MediaSession;->release()V

    .line 14
    .line 15
    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    sput-object v0, Lz52;->a:Landroid/media/session/MediaSession;

    .line 18
    .line 19
    sput-object v0, Lz52;->b:Lx52;

    .line 20
    .line 21
    return-void
.end method

.method public static c(Landroid/content/Context;Lv52;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lv52;->m:I

    .line 5
    .line 6
    iget v1, p1, Lv52;->n:I

    .line 7
    .line 8
    iget-boolean v2, p1, Lv52;->b:Z

    .line 9
    .line 10
    if-eqz v2, :cond_7

    .line 11
    .line 12
    if-gtz v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    sget-object v2, Lz52;->a:Landroid/media/session/MediaSession;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    new-instance v2, Landroid/media/session/MediaSession;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v4, "Tempus LAN"

    .line 28
    .line 29
    invoke-direct {v2, p0, v4}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance p0, Ly52;

    .line 33
    .line 34
    invoke-direct {p0, v3, v2}, Ly52;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v4, Lz52;->c:Landroid/os/Handler;

    .line 38
    .line 39
    invoke-virtual {v2, p0, v4}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;Landroid/os/Handler;)V

    .line 40
    .line 41
    .line 42
    sput-object v2, Lz52;->a:Landroid/media/session/MediaSession;

    .line 43
    .line 44
    :cond_1
    sget-object p0, Lz52;->b:Lx52;

    .line 45
    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/media/VolumeProvider;->getMaxVolume()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-ne p0, v1, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {v0, v3, v1}, Lgb;->m(III)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    new-instance v4, Lx52;

    .line 60
    .line 61
    invoke-direct {v4, v2, v1, p0}, Lx52;-><init>(Landroid/media/session/MediaSession;II)V

    .line 62
    .line 63
    .line 64
    sput-object v4, Lz52;->b:Lx52;

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Landroid/media/session/MediaSession;->setPlaybackToRemote(Landroid/media/VolumeProvider;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object p0, Lz52;->b:Lx52;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v3, v1}, Lgb;->m(III)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p0, v0}, Landroid/media/VolumeProvider;->setCurrentVolume(I)V

    .line 79
    .line 80
    .line 81
    new-instance p0, Landroid/media/MediaMetadata$Builder;

    .line 82
    .line 83
    invoke-direct {p0}, Landroid/media/MediaMetadata$Builder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v0, "android.media.metadata.TITLE"

    .line 87
    .line 88
    iget-object v1, p1, Lv52;->d:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p0, v0, v1}, Landroid/media/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/media/MediaMetadata$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const-string v0, "android.media.metadata.ARTIST"

    .line 95
    .line 96
    iget-object v1, p1, Lv52;->e:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p0, v0, v1}, Landroid/media/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/media/MediaMetadata$Builder;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-string v0, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 103
    .line 104
    iget-object v1, p1, Lv52;->c:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {p0, v0, v1}, Landroid/media/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/media/MediaMetadata$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const-string v0, "android.media.metadata.DURATION"

    .line 111
    .line 112
    iget-wide v3, p1, Lv52;->i:J

    .line 113
    .line 114
    invoke-virtual {p0, v0, v3, v4}, Landroid/media/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroid/media/MediaMetadata$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Landroid/media/MediaMetadata$Builder;->build()Landroid/media/MediaMetadata;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {v2, p0}, Landroid/media/session/MediaSession;->setMetadata(Landroid/media/MediaMetadata;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, Landroid/media/session/PlaybackState$Builder;

    .line 126
    .line 127
    invoke-direct {p0}, Landroid/media/session/PlaybackState$Builder;-><init>()V

    .line 128
    .line 129
    .line 130
    iget-boolean v0, p1, Lv52;->v:Z

    .line 131
    .line 132
    const-wide/16 v3, 0x0

    .line 133
    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    const-wide/16 v0, 0x20

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    move-wide v0, v3

    .line 140
    :goto_1
    const-wide/16 v5, 0x307

    .line 141
    .line 142
    or-long/2addr v0, v5

    .line 143
    iget-boolean v5, p1, Lv52;->w:Z

    .line 144
    .line 145
    if-eqz v5, :cond_4

    .line 146
    .line 147
    const-wide/16 v3, 0x10

    .line 148
    .line 149
    :cond_4
    or-long/2addr v0, v3

    .line 150
    invoke-virtual {p0, v0, v1}, Landroid/media/session/PlaybackState$Builder;->setActions(J)Landroid/media/session/PlaybackState$Builder;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    iget-boolean v0, p1, Lv52;->j:Z

    .line 155
    .line 156
    if-eqz v0, :cond_5

    .line 157
    .line 158
    const/4 v1, 0x3

    .line 159
    goto :goto_2

    .line 160
    :cond_5
    const/4 v1, 0x2

    .line 161
    :goto_2
    iget-wide v3, p1, Lv52;->h:J

    .line 162
    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    iget p1, p1, Lv52;->y:F

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    const/4 p1, 0x0

    .line 169
    :goto_3
    invoke-virtual {p0, v1, v3, v4, p1}, Landroid/media/session/PlaybackState$Builder;->setState(IJF)Landroid/media/session/PlaybackState$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0}, Landroid/media/session/PlaybackState$Builder;->build()Landroid/media/session/PlaybackState;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {v2, p0}, Landroid/media/session/MediaSession;->setPlaybackState(Landroid/media/session/PlaybackState;)V

    .line 178
    .line 179
    .line 180
    const/4 p0, 0x1

    .line 181
    invoke-virtual {v2, p0}, Landroid/media/session/MediaSession;->setActive(Z)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_7
    :goto_4
    invoke-static {}, Lz52;->b()V

    .line 186
    .line 187
    .line 188
    return-void
.end method
