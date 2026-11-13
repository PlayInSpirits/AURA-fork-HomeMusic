.class public abstract Ldefpackage/f92;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/jx1;


# direct methods
.method static constructor <clinit>()V
    .locals 27

    .line 1
    const-string v25, "android.media.metadata.DOWNLOAD_STATUS"

    .line 2
    .line 3
    const-string v26, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 4
    .line 5
    const-string v1, "android.media.metadata.COMPOSER"

    .line 6
    .line 7
    const-string v2, "android.media.metadata.COMPILATION"

    .line 8
    .line 9
    const-string v3, "android.media.metadata.DATE"

    .line 10
    .line 11
    const-string v4, "android.media.metadata.YEAR"

    .line 12
    .line 13
    const-string v5, "android.media.metadata.GENRE"

    .line 14
    .line 15
    const-string v6, "android.media.metadata.TRACK_NUMBER"

    .line 16
    .line 17
    const-string v7, "android.media.metadata.NUM_TRACKS"

    .line 18
    .line 19
    const-string v8, "android.media.metadata.DISC_NUMBER"

    .line 20
    .line 21
    const-string v9, "android.media.metadata.ALBUM_ARTIST"

    .line 22
    .line 23
    const-string v10, "android.media.metadata.ART"

    .line 24
    .line 25
    const-string v11, "android.media.metadata.ART_URI"

    .line 26
    .line 27
    const-string v12, "android.media.metadata.ALBUM_ART"

    .line 28
    .line 29
    const-string v13, "android.media.metadata.ALBUM_ART_URI"

    .line 30
    .line 31
    const-string v14, "android.media.metadata.USER_RATING"

    .line 32
    .line 33
    const-string v15, "android.media.metadata.RATING"

    .line 34
    .line 35
    const-string v16, "android.media.metadata.DISPLAY_TITLE"

    .line 36
    .line 37
    const-string v17, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 38
    .line 39
    const-string v18, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 40
    .line 41
    const-string v19, "android.media.metadata.DISPLAY_ICON"

    .line 42
    .line 43
    const-string v20, "android.media.metadata.DISPLAY_ICON_URI"

    .line 44
    .line 45
    const-string v21, "android.media.metadata.MEDIA_ID"

    .line 46
    .line 47
    const-string v22, "android.media.metadata.MEDIA_URI"

    .line 48
    .line 49
    const-string v23, "android.media.metadata.BT_FOLDER_TYPE"

    .line 50
    .line 51
    const-string v24, "android.media.metadata.ADVERTISEMENT"

    .line 52
    .line 53
    filled-new-array/range {v1 .. v26}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sget v1, Ldefpackage/jx1;->p:I

    .line 58
    .line 59
    const/16 v1, 0x20

    .line 60
    .line 61
    new-array v2, v1, [Ljava/lang/Object;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    const-string v4, "android.media.metadata.TITLE"

    .line 65
    .line 66
    aput-object v4, v2, v3

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    const-string v5, "android.media.metadata.ARTIST"

    .line 70
    .line 71
    aput-object v5, v2, v4

    .line 72
    .line 73
    const/4 v4, 0x2

    .line 74
    const-string v5, "android.media.metadata.DURATION"

    .line 75
    .line 76
    aput-object v5, v2, v4

    .line 77
    .line 78
    const/4 v4, 0x3

    .line 79
    const-string v5, "android.media.metadata.ALBUM"

    .line 80
    .line 81
    aput-object v5, v2, v4

    .line 82
    .line 83
    const/4 v4, 0x4

    .line 84
    const-string v5, "android.media.metadata.AUTHOR"

    .line 85
    .line 86
    aput-object v5, v2, v4

    .line 87
    .line 88
    const/4 v4, 0x5

    .line 89
    const-string v5, "android.media.metadata.WRITER"

    .line 90
    .line 91
    aput-object v5, v2, v4

    .line 92
    .line 93
    const/4 v4, 0x6

    .line 94
    const/16 v5, 0x1a

    .line 95
    .line 96
    invoke-static {v0, v3, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v2}, Ldefpackage/jx1;->j(I[Ljava/lang/Object;)Ldefpackage/jx1;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Ldefpackage/f92;->a:Ldefpackage/jx1;

    .line 104
    .line 105
    return-void
.end method

.method public static a(Ldefpackage/gn2;Landroid/graphics/Bitmap;)Ldefpackage/ij2;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Ldefpackage/f92;->i(Ldefpackage/gn2;Landroid/graphics/Bitmap;)Ldefpackage/pm2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/do2;->q:Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-object p0, p0, Ldefpackage/do2;->r:Ljava/lang/Boolean;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    or-int/lit8 v0, v0, 0x2

    .line 31
    .line 32
    :cond_1
    new-instance p0, Ldefpackage/ij2;

    .line 33
    .line 34
    invoke-direct {p0, p1, v0}, Ldefpackage/ij2;-><init>(Ldefpackage/pm2;I)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public static b(Ldefpackage/ei3;Ldefpackage/eo2;J)J
    .locals 8

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    :goto_0
    move-wide v2, v0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-wide v0, p0, Ldefpackage/ei3;->p:J

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :goto_1
    invoke-static {p0, p1, p2, p3}, Ldefpackage/f92;->c(Ldefpackage/ei3;Ldefpackage/eo2;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    invoke-static {p1}, Ldefpackage/f92;->d(Ldefpackage/eo2;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v6

    .line 18
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p0, v6, p0

    .line 24
    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    return-wide p0

    .line 32
    :cond_1
    invoke-static/range {v2 .. v7}, Ldefpackage/f35;->k(JJJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
.end method

.method public static c(Ldefpackage/ei3;Ldefpackage/eo2;J)J
    .locals 14

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    iget-wide v2, p0, Ldefpackage/ei3;->o:J

    .line 7
    .line 8
    iget v4, p0, Ldefpackage/ei3;->n:I

    .line 9
    .line 10
    const/4 v5, 0x3

    .line 11
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    if-ne v4, v5, :cond_3

    .line 17
    .line 18
    cmp-long v4, p2, v6

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    :goto_0
    iget v5, p0, Ldefpackage/ei3;->q:F

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v8

    .line 41
    iget-wide v10, p0, Ldefpackage/ei3;->u:J

    .line 42
    .line 43
    sub-long/2addr v8, v10

    .line 44
    :goto_1
    long-to-float p0, v8

    .line 45
    mul-float/2addr v5, p0

    .line 46
    float-to-long v4, v5

    .line 47
    add-long/2addr v2, v4

    .line 48
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    :cond_3
    move-wide v8, v2

    .line 53
    invoke-static {p1}, Ldefpackage/f92;->d(Ldefpackage/eo2;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v12

    .line 57
    cmp-long p0, v12, v6

    .line 58
    .line 59
    if-nez p0, :cond_4

    .line 60
    .line 61
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    return-wide v0

    .line 66
    :cond_4
    const-wide/16 v10, 0x0

    .line 67
    .line 68
    invoke-static/range {v8 .. v13}, Ldefpackage/f35;->k(JJJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0
.end method

.method public static d(Ldefpackage/eo2;)J
    .locals 6

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    iget-object v2, p0, Ldefpackage/eo2;->n:Landroid/os/Bundle;

    .line 9
    .line 10
    const-string v3, "android.media.metadata.DURATION"

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0, v3}, Ldefpackage/eo2;->a(Ljava/lang/String;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    cmp-long p0, v2, v4

    .line 26
    .line 27
    if-gtz p0, :cond_1

    .line 28
    .line 29
    return-wide v0

    .line 30
    :cond_1
    return-wide v2

    .line 31
    :cond_2
    :goto_0
    return-wide v0
.end method

.method public static e(I)J
    .locals 2

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string v0, "Unrecognized FolderType: "

    .line 5
    .line 6
    invoke-static {p0, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    return-wide v0

    .line 16
    :pswitch_0
    const-wide/16 v0, 0x6

    .line 17
    .line 18
    return-wide v0

    .line 19
    :pswitch_1
    const-wide/16 v0, 0x5

    .line 20
    .line 21
    return-wide v0

    .line 22
    :pswitch_2
    const-wide/16 v0, 0x4

    .line 23
    .line 24
    return-wide v0

    .line 25
    :pswitch_3
    const-wide/16 v0, 0x3

    .line 26
    .line 27
    return-wide v0

    .line 28
    :pswitch_4
    const-wide/16 v0, 0x2

    .line 29
    .line 30
    return-wide v0

    .line 31
    :pswitch_5
    const-wide/16 v0, 0x1

    .line 32
    .line 33
    return-wide v0

    .line 34
    :pswitch_6
    const-wide/16 v0, 0x0

    .line 35
    .line 36
    return-wide v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static f(J)I
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const-wide/16 v2, 0x1

    .line 10
    .line 11
    cmp-long v0, p0, v2

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const-wide/16 v2, 0x2

    .line 18
    .line 19
    cmp-long v0, p0, v2

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    const/4 p0, 0x2

    .line 24
    return p0

    .line 25
    :cond_2
    const-wide/16 v2, 0x3

    .line 26
    .line 27
    cmp-long v0, p0, v2

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    const/4 p0, 0x3

    .line 32
    return p0

    .line 33
    :cond_3
    const-wide/16 v2, 0x4

    .line 34
    .line 35
    cmp-long v0, p0, v2

    .line 36
    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    const/4 p0, 0x4

    .line 40
    return p0

    .line 41
    :cond_4
    const-wide/16 v2, 0x5

    .line 42
    .line 43
    cmp-long v0, p0, v2

    .line 44
    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    const/4 p0, 0x5

    .line 48
    return p0

    .line 49
    :cond_5
    const-wide/16 v2, 0x6

    .line 50
    .line 51
    cmp-long p0, p0, v2

    .line 52
    .line 53
    if-nez p0, :cond_6

    .line 54
    .line 55
    const/4 p0, 0x6

    .line 56
    return p0

    .line 57
    :cond_6
    return v1
.end method

.method public static g(I)I
    .locals 2

    .line 1
    const/16 v0, -0x6e

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, -0x6d

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, -0x6

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, -0x2

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    if-eq p0, v1, :cond_0

    .line 17
    .line 18
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :pswitch_0
    const/4 p0, 0x3

    .line 24
    return p0

    .line 25
    :pswitch_1
    const/4 p0, 0x4

    .line 26
    return p0

    .line 27
    :pswitch_2
    const/4 p0, 0x5

    .line 28
    return p0

    .line 29
    :pswitch_3
    const/4 p0, 0x6

    .line 30
    return p0

    .line 31
    :pswitch_4
    const/4 p0, 0x7

    .line 32
    return p0

    .line 33
    :pswitch_5
    const/16 p0, 0x9

    .line 34
    .line 35
    return p0

    .line 36
    :cond_0
    const/16 p0, 0xa

    .line 37
    .line 38
    return p0

    .line 39
    :cond_1
    return v1

    .line 40
    :cond_2
    const/4 p0, 0x2

    .line 41
    return p0

    .line 42
    :cond_3
    const/16 p0, 0xb

    .line 43
    .line 44
    return p0

    .line 45
    :cond_4
    const/16 p0, 0x8

    .line 46
    .line 47
    return p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch -0x6b
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static h(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Bundle;)Ldefpackage/jn2;
    .locals 4

    .line 1
    const-string v0, "androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS"

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1, p0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-ltz p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY"

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    if-ne p0, v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v2, v1

    .line 32
    :goto_0
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    :cond_2
    sget-object p0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 36
    .line 37
    const-string p0, "android.service.media.extra.RECENT"

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    const-string v0, "android.service.media.extra.OFFLINE"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const-string v2, "android.service.media.extra.SUGGESTED"

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    new-instance v3, Ldefpackage/jn2;

    .line 56
    .line 57
    invoke-direct {v3, p1, p0, v0, v2}, Ldefpackage/jn2;-><init>(Landroid/os/Bundle;ZZZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    return-object v3

    .line 61
    :catch_0
    sget-object p0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 62
    .line 63
    new-instance p0, Ldefpackage/jn2;

    .line 64
    .line 65
    invoke-direct {p0, p1, v1, v1, v1}, Ldefpackage/jn2;-><init>(Landroid/os/Bundle;ZZZ)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method

.method public static i(Ldefpackage/gn2;Landroid/graphics/Bitmap;)Ldefpackage/pm2;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, v0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 16
    .line 17
    move-object v4, v1

    .line 18
    :goto_0
    iget-object v1, v0, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    move-object/from16 v8, p1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v8, 0x0

    .line 26
    :goto_1
    iget-object v3, v1, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 27
    .line 28
    iget-object v5, v1, Ldefpackage/do2;->a:Ljava/lang/CharSequence;

    .line 29
    .line 30
    iget-object v6, v1, Ldefpackage/do2;->g:Ljava/lang/CharSequence;

    .line 31
    .line 32
    iget-object v7, v1, Ldefpackage/do2;->f:Ljava/lang/CharSequence;

    .line 33
    .line 34
    iget-object v9, v1, Ldefpackage/do2;->J:Ldefpackage/yw1;

    .line 35
    .line 36
    iget-object v10, v1, Ldefpackage/do2;->H:Ljava/lang/Integer;

    .line 37
    .line 38
    iget-object v11, v1, Ldefpackage/do2;->p:Ljava/lang/Integer;

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    new-instance v12, Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-direct {v12, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 45
    .line 46
    .line 47
    move-object v3, v12

    .line 48
    :cond_2
    const/4 v12, -0x1

    .line 49
    const/4 v14, 0x1

    .line 50
    if-eqz v11, :cond_3

    .line 51
    .line 52
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    if-eq v15, v12, :cond_3

    .line 57
    .line 58
    move v15, v14

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    const/4 v15, 0x0

    .line 61
    :goto_2
    if-eqz v10, :cond_4

    .line 62
    .line 63
    move/from16 v16, v14

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v16, 0x0

    .line 67
    .line 68
    :goto_3
    if-nez v15, :cond_6

    .line 69
    .line 70
    if-eqz v16, :cond_5

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_5
    const/4 v15, 0x0

    .line 74
    goto :goto_6

    .line 75
    :cond_6
    :goto_4
    if-nez v3, :cond_7

    .line 76
    .line 77
    new-instance v3, Landroid/os/Bundle;

    .line 78
    .line 79
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 80
    .line 81
    .line 82
    :cond_7
    if-eqz v15, :cond_8

    .line 83
    .line 84
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    const/4 v15, 0x0

    .line 92
    invoke-static {v11}, Ldefpackage/f92;->e(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v12

    .line 96
    const-string v11, "android.media.extra.BT_FOLDER_TYPE"

    .line 97
    .line 98
    invoke-virtual {v3, v11, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    const/4 v15, 0x0

    .line 103
    :goto_5
    if-eqz v16, :cond_9

    .line 104
    .line 105
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    int-to-long v10, v10

    .line 113
    const-string v12, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 114
    .line 115
    invoke-virtual {v3, v12, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 116
    .line 117
    .line 118
    :cond_9
    :goto_6
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    if-nez v10, :cond_b

    .line 123
    .line 124
    if-nez v3, :cond_a

    .line 125
    .line 126
    new-instance v3, Landroid/os/Bundle;

    .line 127
    .line 128
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 129
    .line 130
    .line 131
    :cond_a
    new-instance v10, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 134
    .line 135
    .line 136
    const-string v9, "androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST"

    .line 137
    .line 138
    invoke-virtual {v3, v9, v10}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 139
    .line 140
    .line 141
    :cond_b
    iget-object v9, v1, Ldefpackage/do2;->e:Ljava/lang/CharSequence;

    .line 142
    .line 143
    if-eqz v9, :cond_d

    .line 144
    .line 145
    if-nez v3, :cond_c

    .line 146
    .line 147
    new-instance v2, Landroid/os/Bundle;

    .line 148
    .line 149
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 150
    .line 151
    .line 152
    move-object v3, v2

    .line 153
    :cond_c
    const-string v2, "androidx.media3.mediadescriptioncompat.title"

    .line 154
    .line 155
    invoke-virtual {v3, v2, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    :goto_7
    move-object v5, v7

    .line 159
    move-object v7, v6

    .line 160
    move-object v6, v5

    .line 161
    move-object v10, v3

    .line 162
    move-object v5, v9

    .line 163
    goto/16 :goto_c

    .line 164
    .line 165
    :cond_d
    const/4 v9, 0x3

    .line 166
    new-array v10, v9, [Ljava/lang/CharSequence;

    .line 167
    .line 168
    move v11, v15

    .line 169
    move v12, v11

    .line 170
    :goto_8
    const/4 v13, 0x2

    .line 171
    if-ge v11, v9, :cond_18

    .line 172
    .line 173
    sget-object v2, Ldefpackage/eo2;->r:[Ljava/lang/String;

    .line 174
    .line 175
    array-length v9, v2

    .line 176
    if-ge v12, v9, :cond_18

    .line 177
    .line 178
    add-int/lit8 v9, v12, 0x1

    .line 179
    .line 180
    aget-object v2, v2, v12

    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    sparse-switch v12, :sswitch_data_0

    .line 190
    .line 191
    .line 192
    :goto_9
    const/4 v13, -0x1

    .line 193
    goto/16 :goto_a

    .line 194
    .line 195
    :sswitch_0
    const-string v12, "android.media.metadata.ALBUM_ARTIST"

    .line 196
    .line 197
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-nez v2, :cond_e

    .line 202
    .line 203
    goto :goto_9

    .line 204
    :cond_e
    const/16 v13, 0x8

    .line 205
    .line 206
    goto/16 :goto_a

    .line 207
    .line 208
    :sswitch_1
    const-string v12, "android.media.metadata.TITLE"

    .line 209
    .line 210
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-nez v2, :cond_f

    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_f
    const/4 v13, 0x7

    .line 218
    goto :goto_a

    .line 219
    :sswitch_2
    const-string v12, "android.media.metadata.ALBUM"

    .line 220
    .line 221
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-nez v2, :cond_10

    .line 226
    .line 227
    goto :goto_9

    .line 228
    :cond_10
    const/4 v13, 0x6

    .line 229
    goto :goto_a

    .line 230
    :sswitch_3
    const-string v12, "android.media.metadata.COMPOSER"

    .line 231
    .line 232
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-nez v2, :cond_11

    .line 237
    .line 238
    goto :goto_9

    .line 239
    :cond_11
    const/4 v13, 0x5

    .line 240
    goto :goto_a

    .line 241
    :sswitch_4
    const-string v12, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 242
    .line 243
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-nez v2, :cond_12

    .line 248
    .line 249
    goto :goto_9

    .line 250
    :cond_12
    const/4 v13, 0x4

    .line 251
    goto :goto_a

    .line 252
    :sswitch_5
    const-string v12, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 253
    .line 254
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-nez v2, :cond_13

    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_13
    const/4 v13, 0x3

    .line 262
    goto :goto_a

    .line 263
    :sswitch_6
    const-string v12, "android.media.metadata.WRITER"

    .line 264
    .line 265
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-nez v2, :cond_16

    .line 270
    .line 271
    goto :goto_9

    .line 272
    :sswitch_7
    const-string v12, "android.media.metadata.AUTHOR"

    .line 273
    .line 274
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-nez v2, :cond_14

    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_14
    move v13, v14

    .line 282
    goto :goto_a

    .line 283
    :sswitch_8
    const-string v12, "android.media.metadata.ARTIST"

    .line 284
    .line 285
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-nez v2, :cond_15

    .line 290
    .line 291
    goto :goto_9

    .line 292
    :cond_15
    move v13, v15

    .line 293
    :cond_16
    :goto_a
    packed-switch v13, :pswitch_data_0

    .line 294
    .line 295
    .line 296
    :pswitch_0
    const/4 v2, 0x0

    .line 297
    goto :goto_b

    .line 298
    :pswitch_1
    iget-object v2, v1, Ldefpackage/do2;->d:Ljava/lang/CharSequence;

    .line 299
    .line 300
    goto :goto_b

    .line 301
    :pswitch_2
    move-object v2, v5

    .line 302
    goto :goto_b

    .line 303
    :pswitch_3
    iget-object v2, v1, Ldefpackage/do2;->c:Ljava/lang/CharSequence;

    .line 304
    .line 305
    goto :goto_b

    .line 306
    :pswitch_4
    iget-object v2, v1, Ldefpackage/do2;->A:Ljava/lang/CharSequence;

    .line 307
    .line 308
    goto :goto_b

    .line 309
    :pswitch_5
    move-object v2, v6

    .line 310
    goto :goto_b

    .line 311
    :pswitch_6
    move-object v2, v7

    .line 312
    goto :goto_b

    .line 313
    :pswitch_7
    iget-object v2, v1, Ldefpackage/do2;->z:Ljava/lang/CharSequence;

    .line 314
    .line 315
    goto :goto_b

    .line 316
    :pswitch_8
    iget-object v2, v1, Ldefpackage/do2;->b:Ljava/lang/CharSequence;

    .line 317
    .line 318
    :goto_b
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 319
    .line 320
    .line 321
    move-result v12

    .line 322
    if-nez v12, :cond_17

    .line 323
    .line 324
    add-int/lit8 v12, v11, 0x1

    .line 325
    .line 326
    aput-object v2, v10, v11

    .line 327
    .line 328
    move v11, v12

    .line 329
    :cond_17
    move v12, v9

    .line 330
    const/4 v9, 0x3

    .line 331
    goto/16 :goto_8

    .line 332
    .line 333
    :cond_18
    aget-object v9, v10, v15

    .line 334
    .line 335
    aget-object v7, v10, v14

    .line 336
    .line 337
    aget-object v6, v10, v13

    .line 338
    .line 339
    goto/16 :goto_7

    .line 340
    .line 341
    :goto_c
    iget-object v9, v1, Ldefpackage/do2;->m:Landroid/net/Uri;

    .line 342
    .line 343
    iget-object v0, v0, Ldefpackage/gn2;->f:Ldefpackage/cn2;

    .line 344
    .line 345
    iget-object v11, v0, Ldefpackage/cn2;->a:Landroid/net/Uri;

    .line 346
    .line 347
    new-instance v3, Ldefpackage/pm2;

    .line 348
    .line 349
    invoke-direct/range {v3 .. v11}, Ldefpackage/pm2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 350
    .line 351
    .line 352
    return-object v3

    .line 353
    :sswitch_data_0
    .sparse-switch
        -0x6e7c6d63 -> :sswitch_8
        -0x6e522b1f -> :sswitch_7
        -0x48f6a837 -> :sswitch_6
        0xb9aeaeb -> :sswitch_5
        0x3f1c9429 -> :sswitch_4
        0x6467f2f6 -> :sswitch_3
        0x70098439 -> :sswitch_2
        0x71142822 -> :sswitch_1
        0x7522ca0d -> :sswitch_0
    .end sparse-switch

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static j(Ldefpackage/pm2;)Ldefpackage/gn2;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/pm2;->n:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v1, Ldefpackage/um2;

    .line 7
    .line 8
    invoke-direct {v1}, Ldefpackage/um2;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v2, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 12
    .line 13
    sget-object v2, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 14
    .line 15
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 16
    .line 17
    new-instance v2, Ldefpackage/zm2;

    .line 18
    .line 19
    invoke-direct {v2}, Ldefpackage/zm2;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v3, Ldefpackage/cn2;->d:Ldefpackage/cn2;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const-string v0, ""

    .line 27
    .line 28
    :cond_0
    move-object v4, v0

    .line 29
    new-instance v0, Ldefpackage/yc5;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v3, p0, Ldefpackage/pm2;->v:Landroid/net/Uri;

    .line 35
    .line 36
    iput-object v3, v0, Ldefpackage/yc5;->n:Ljava/lang/Object;

    .line 37
    .line 38
    new-instance v9, Ldefpackage/cn2;

    .line 39
    .line 40
    invoke-direct {v9, v0}, Ldefpackage/cn2;-><init>(Ldefpackage/yc5;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-static {p0, v0}, Ldefpackage/f92;->l(Ldefpackage/pm2;I)Ldefpackage/do2;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance v3, Ldefpackage/gn2;

    .line 49
    .line 50
    new-instance v5, Ldefpackage/wm2;

    .line 51
    .line 52
    invoke-direct {v5, v1}, Ldefpackage/vm2;-><init>(Ldefpackage/um2;)V

    .line 53
    .line 54
    .line 55
    new-instance v7, Ldefpackage/an2;

    .line 56
    .line 57
    invoke-direct {v7, v2}, Ldefpackage/an2;-><init>(Ldefpackage/zm2;)V

    .line 58
    .line 59
    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    :goto_0
    move-object v8, p0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    sget-object p0, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :goto_1
    const/4 v6, 0x0

    .line 68
    invoke-direct/range {v3 .. v9}, Ldefpackage/gn2;-><init>(Ljava/lang/String;Ldefpackage/wm2;Ldefpackage/bn2;Ldefpackage/an2;Ldefpackage/do2;Ldefpackage/cn2;)V

    .line 69
    .line 70
    .line 71
    return-object v3
.end method

.method public static k(Ljava/lang/String;Ldefpackage/eo2;I)Ldefpackage/gn2;
    .locals 11

    .line 1
    new-instance v0, Ldefpackage/um2;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/um2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 7
    .line 8
    sget-object v1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    sget-object v1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 13
    .line 14
    new-instance v1, Ldefpackage/zm2;

    .line 15
    .line 16
    invoke-direct {v1}, Ldefpackage/zm2;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v2, Ldefpackage/cn2;->d:Ldefpackage/cn2;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p0, v3

    .line 26
    :goto_0
    const-string v4, "android.media.metadata.MEDIA_URI"

    .line 27
    .line 28
    iget-object v5, p1, Ldefpackage/eo2;->n:Landroid/os/Bundle;

    .line 29
    .line 30
    invoke-virtual {v5, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    :cond_1
    if-eqz v3, :cond_2

    .line 41
    .line 42
    new-instance v2, Ldefpackage/yc5;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iput-object v3, v2, Ldefpackage/yc5;->n:Ljava/lang/Object;

    .line 52
    .line 53
    new-instance v3, Ldefpackage/cn2;

    .line 54
    .line 55
    invoke-direct {v3, v2}, Ldefpackage/cn2;-><init>(Ldefpackage/yc5;)V

    .line 56
    .line 57
    .line 58
    move-object v10, v3

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object v10, v2

    .line 61
    :goto_1
    invoke-static {p1, p2}, Ldefpackage/f92;->m(Ldefpackage/eo2;I)Ldefpackage/do2;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v4, Ldefpackage/gn2;

    .line 66
    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    :goto_2
    move-object v5, p0

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    const-string p0, ""

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :goto_3
    new-instance v6, Ldefpackage/wm2;

    .line 75
    .line 76
    invoke-direct {v6, v0}, Ldefpackage/vm2;-><init>(Ldefpackage/um2;)V

    .line 77
    .line 78
    .line 79
    new-instance v8, Ldefpackage/an2;

    .line 80
    .line 81
    invoke-direct {v8, v1}, Ldefpackage/an2;-><init>(Ldefpackage/zm2;)V

    .line 82
    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    :goto_4
    move-object v9, p1

    .line 87
    goto :goto_5

    .line 88
    :cond_4
    sget-object p1, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :goto_5
    const/4 v7, 0x0

    .line 92
    invoke-direct/range {v4 .. v10}, Ldefpackage/gn2;-><init>(Ljava/lang/String;Ldefpackage/wm2;Ldefpackage/bn2;Ldefpackage/an2;Ldefpackage/do2;Ldefpackage/cn2;)V

    .line 93
    .line 94
    .line 95
    return-object v4
.end method

.method public static l(Ldefpackage/pm2;I)Ldefpackage/do2;
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v0, p0, Ldefpackage/pm2;->o:Ljava/lang/CharSequence;

    .line 7
    .line 8
    new-instance v1, Ldefpackage/co2;

    .line 9
    .line 10
    invoke-direct {v1}, Ldefpackage/co2;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Ldefpackage/pm2;->p:Ljava/lang/CharSequence;

    .line 14
    .line 15
    iput-object v2, v1, Ldefpackage/co2;->f:Ljava/lang/CharSequence;

    .line 16
    .line 17
    iget-object v2, p0, Ldefpackage/pm2;->q:Ljava/lang/CharSequence;

    .line 18
    .line 19
    iput-object v2, v1, Ldefpackage/co2;->g:Ljava/lang/CharSequence;

    .line 20
    .line 21
    iget-object v2, p0, Ldefpackage/pm2;->t:Landroid/net/Uri;

    .line 22
    .line 23
    iput-object v2, v1, Ldefpackage/co2;->m:Landroid/net/Uri;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    packed-switch p1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object v3, v2

    .line 30
    goto :goto_0

    .line 31
    :pswitch_0
    new-instance v3, Ldefpackage/mu3;

    .line 32
    .line 33
    const/high16 v4, -0x40800000    # -1.0f

    .line 34
    .line 35
    invoke-direct {v3, p1, v4}, Ldefpackage/mu3;-><init>(IF)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v3}, Ldefpackage/f92;->q(Ldefpackage/mu3;)Ldefpackage/lu3;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, v1, Ldefpackage/co2;->i:Ldefpackage/lu3;

    .line 43
    .line 44
    iget-object p1, p0, Ldefpackage/pm2;->r:Landroid/graphics/Bitmap;

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    move-object p1, v2

    .line 49
    goto :goto_4

    .line 50
    :cond_1
    iget-object v3, p0, Ldefpackage/pm2;->s:[B

    .line 51
    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    :try_start_0
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    :try_start_1
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-virtual {p1, v4, v5, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Ldefpackage/pm2;->s:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    :try_start_2
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :catch_0
    move-exception p1

    .line 76
    goto :goto_2

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    :try_start_3
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_1
    move-exception v3

    .line 83
    :try_start_4
    invoke-virtual {p1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :goto_1
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 87
    :goto_2
    const-string v3, "MediaDescriptionCompat"

    .line 88
    .line 89
    const-string v4, "Failed to compress MediaDescriptionCompat artwork"

    .line 90
    .line 91
    invoke-static {v3, v4, p1}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_3
    iget-object p1, p0, Ldefpackage/pm2;->s:[B

    .line 95
    .line 96
    :goto_4
    if-eqz p1, :cond_3

    .line 97
    .line 98
    const/4 v3, 0x3

    .line 99
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v1, p1, v3}, Ldefpackage/co2;->c([BLjava/lang/Integer;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    iget-object p0, p0, Ldefpackage/pm2;->u:Landroid/os/Bundle;

    .line 107
    .line 108
    if-nez p0, :cond_4

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_4
    new-instance v2, Landroid/os/Bundle;

    .line 112
    .line 113
    invoke-direct {v2, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 114
    .line 115
    .line 116
    :goto_5
    if-eqz v2, :cond_5

    .line 117
    .line 118
    const-string p0, "android.media.extra.BT_FOLDER_TYPE"

    .line 119
    .line 120
    invoke-virtual {v2, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_5

    .line 125
    .line 126
    invoke-virtual {v2, p0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    invoke-static {v3, v4}, Ldefpackage/f92;->f(J)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, v1, Ldefpackage/co2;->p:Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v2, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 144
    .line 145
    iput-object p0, v1, Ldefpackage/co2;->q:Ljava/lang/Boolean;

    .line 146
    .line 147
    if-eqz v2, :cond_6

    .line 148
    .line 149
    const-string p0, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 150
    .line 151
    invoke-virtual {v2, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_6

    .line 156
    .line 157
    invoke-virtual {v2, p0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v3

    .line 161
    long-to-int p1, v3

    .line 162
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iput-object p1, v1, Ldefpackage/co2;->G:Ljava/lang/Integer;

    .line 167
    .line 168
    invoke-virtual {v2, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_6
    if-eqz v2, :cond_7

    .line 172
    .line 173
    const-string p0, "androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST"

    .line 174
    .line 175
    invoke-virtual {v2, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_7

    .line 180
    .line 181
    invoke-virtual {v2, p0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {p0}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {p0}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    iput-object p0, v1, Ldefpackage/co2;->I:Ldefpackage/yw1;

    .line 197
    .line 198
    :cond_7
    if-eqz v2, :cond_8

    .line 199
    .line 200
    const-string p0, "androidx.media3.mediadescriptioncompat.title"

    .line 201
    .line 202
    invoke-virtual {v2, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-eqz p1, :cond_8

    .line 207
    .line 208
    invoke-virtual {v2, p0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iput-object p1, v1, Ldefpackage/co2;->a:Ljava/lang/CharSequence;

    .line 213
    .line 214
    iput-object v0, v1, Ldefpackage/co2;->e:Ljava/lang/CharSequence;

    .line 215
    .line 216
    invoke-virtual {v2, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_8
    iput-object v0, v1, Ldefpackage/co2;->a:Ljava/lang/CharSequence;

    .line 221
    .line 222
    :goto_6
    if-eqz v2, :cond_9

    .line 223
    .line 224
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    if-nez p0, :cond_9

    .line 229
    .line 230
    iput-object v2, v1, Ldefpackage/co2;->H:Landroid/os/Bundle;

    .line 231
    .line 232
    :cond_9
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 233
    .line 234
    iput-object p0, v1, Ldefpackage/co2;->r:Ljava/lang/Boolean;

    .line 235
    .line 236
    new-instance p0, Ldefpackage/do2;

    .line 237
    .line 238
    invoke-direct {p0, v1}, Ldefpackage/do2;-><init>(Ldefpackage/co2;)V

    .line 239
    .line 240
    .line 241
    return-object p0

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static m(Ldefpackage/eo2;I)Ldefpackage/do2;
    .locals 13

    .line 1
    const-string v0, "Failed to retrieve a key as Rating."

    .line 2
    .line 3
    const-string v1, "MediaMetadata"

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v2, p0, Ldefpackage/eo2;->n:Landroid/os/Bundle;

    .line 11
    .line 12
    new-instance v3, Ldefpackage/co2;

    .line 13
    .line 14
    invoke-direct {v3}, Ldefpackage/co2;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v4, "android.media.metadata.DISPLAY_TITLE"

    .line 18
    .line 19
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x3

    .line 24
    const/4 v6, 0x0

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    const-string v7, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 28
    .line 29
    invoke-virtual {v2, v7}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    const-string v8, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 34
    .line 35
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-array v4, v5, [Ljava/lang/CharSequence;

    .line 41
    .line 42
    move v7, v6

    .line 43
    move v8, v7

    .line 44
    :goto_0
    if-ge v7, v5, :cond_3

    .line 45
    .line 46
    sget-object v9, Ldefpackage/eo2;->r:[Ljava/lang/String;

    .line 47
    .line 48
    array-length v10, v9

    .line 49
    if-ge v8, v10, :cond_3

    .line 50
    .line 51
    add-int/lit8 v10, v8, 0x1

    .line 52
    .line 53
    aget-object v8, v9, v8

    .line 54
    .line 55
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-nez v9, :cond_2

    .line 64
    .line 65
    add-int/lit8 v9, v7, 0x1

    .line 66
    .line 67
    aput-object v8, v4, v7

    .line 68
    .line 69
    move v7, v9

    .line 70
    :cond_2
    move v8, v10

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    aget-object v7, v4, v6

    .line 73
    .line 74
    const/4 v8, 0x1

    .line 75
    aget-object v8, v4, v8

    .line 76
    .line 77
    const/4 v9, 0x2

    .line 78
    aget-object v4, v4, v9

    .line 79
    .line 80
    move-object v12, v8

    .line 81
    move-object v8, v4

    .line 82
    move-object v4, v7

    .line 83
    move-object v7, v12

    .line 84
    :goto_1
    const-string v9, "android.media.metadata.TITLE"

    .line 85
    .line 86
    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    if-eqz v9, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v9, v4

    .line 94
    :goto_2
    iput-object v9, v3, Ldefpackage/co2;->a:Ljava/lang/CharSequence;

    .line 95
    .line 96
    iput-object v4, v3, Ldefpackage/co2;->e:Ljava/lang/CharSequence;

    .line 97
    .line 98
    iput-object v7, v3, Ldefpackage/co2;->f:Ljava/lang/CharSequence;

    .line 99
    .line 100
    iput-object v8, v3, Ldefpackage/co2;->g:Ljava/lang/CharSequence;

    .line 101
    .line 102
    const-string v4, "android.media.metadata.ARTIST"

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    iput-object v4, v3, Ldefpackage/co2;->b:Ljava/lang/CharSequence;

    .line 109
    .line 110
    const-string v4, "android.media.metadata.ALBUM"

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    iput-object v4, v3, Ldefpackage/co2;->c:Ljava/lang/CharSequence;

    .line 117
    .line 118
    const-string v4, "android.media.metadata.ALBUM_ARTIST"

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iput-object v4, v3, Ldefpackage/co2;->d:Ljava/lang/CharSequence;

    .line 125
    .line 126
    const-string v4, "android.media.metadata.RATING"

    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    :try_start_0
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-static {v4}, Ldefpackage/mu3;->a(Landroid/os/Parcelable;)Ldefpackage/mu3;

    .line 134
    .line 135
    .line 136
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    goto :goto_3

    .line 138
    :catch_0
    move-exception v4

    .line 139
    invoke-static {v1, v0, v4}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    move-object v4, v7

    .line 143
    :goto_3
    invoke-static {v4}, Ldefpackage/f92;->q(Ldefpackage/mu3;)Ldefpackage/lu3;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    iput-object v4, v3, Ldefpackage/co2;->j:Ldefpackage/lu3;

    .line 148
    .line 149
    const-string v4, "android.media.metadata.DURATION"

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eqz v8, :cond_5

    .line 156
    .line 157
    invoke-virtual {p0, v4}, Ldefpackage/eo2;->a(Ljava/lang/String;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v8

    .line 161
    const-wide/16 v10, 0x0

    .line 162
    .line 163
    cmp-long v4, v8, v10

    .line 164
    .line 165
    if-ltz v4, :cond_5

    .line 166
    .line 167
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v3, v4}, Ldefpackage/co2;->d(Ljava/lang/Long;)V

    .line 172
    .line 173
    .line 174
    :cond_5
    const-string v4, "android.media.metadata.USER_RATING"

    .line 175
    .line 176
    :try_start_1
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-static {v4}, Ldefpackage/mu3;->a(Landroid/os/Parcelable;)Ldefpackage/mu3;

    .line 181
    .line 182
    .line 183
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 184
    goto :goto_4

    .line 185
    :catch_1
    move-exception v4

    .line 186
    invoke-static {v1, v0, v4}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    move-object v0, v7

    .line 190
    :goto_4
    invoke-static {v0}, Ldefpackage/f92;->q(Ldefpackage/mu3;)Ldefpackage/lu3;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_6

    .line 195
    .line 196
    iput-object v0, v3, Ldefpackage/co2;->i:Ldefpackage/lu3;

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_6
    packed-switch p1, :pswitch_data_0

    .line 200
    .line 201
    .line 202
    move-object v0, v7

    .line 203
    goto :goto_5

    .line 204
    :pswitch_0
    new-instance v0, Ldefpackage/mu3;

    .line 205
    .line 206
    const/high16 v4, -0x40800000    # -1.0f

    .line 207
    .line 208
    invoke-direct {v0, p1, v4}, Ldefpackage/mu3;-><init>(IF)V

    .line 209
    .line 210
    .line 211
    :goto_5
    invoke-static {v0}, Ldefpackage/f92;->q(Ldefpackage/mu3;)Ldefpackage/lu3;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iput-object p1, v3, Ldefpackage/co2;->i:Ldefpackage/lu3;

    .line 216
    .line 217
    :goto_6
    const-string p1, "android.media.metadata.YEAR"

    .line 218
    .line 219
    invoke-virtual {v2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_7

    .line 224
    .line 225
    invoke-virtual {p0, p1}, Ldefpackage/eo2;->a(Ljava/lang/String;)J

    .line 226
    .line 227
    .line 228
    move-result-wide v8

    .line 229
    long-to-int p1, v8

    .line 230
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iput-object p1, v3, Ldefpackage/co2;->s:Ljava/lang/Integer;

    .line 235
    .line 236
    :cond_7
    const-string p1, "android.media.metadata.ALBUM_ART_URI"

    .line 237
    .line 238
    const-string v0, "android.media.metadata.ART_URI"

    .line 239
    .line 240
    const-string v4, "android.media.metadata.DISPLAY_ICON_URI"

    .line 241
    .line 242
    filled-new-array {v4, p1, v0}, [Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    move v0, v6

    .line 247
    :goto_7
    if-ge v0, v5, :cond_9

    .line 248
    .line 249
    aget-object v4, p1, v0

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    if-eqz v8, :cond_8

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    if-eqz p1, :cond_9

    .line 262
    .line 263
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    goto :goto_8

    .line 268
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_9
    move-object p1, v7

    .line 272
    :goto_8
    if-eqz p1, :cond_a

    .line 273
    .line 274
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    goto :goto_9

    .line 279
    :cond_a
    move-object p1, v7

    .line 280
    :goto_9
    if-eqz p1, :cond_b

    .line 281
    .line 282
    iput-object p1, v3, Ldefpackage/co2;->m:Landroid/net/Uri;

    .line 283
    .line 284
    :cond_b
    invoke-virtual {p0}, Ldefpackage/eo2;->b()Landroid/graphics/Bitmap;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    if-nez p1, :cond_c

    .line 289
    .line 290
    goto :goto_d

    .line 291
    :cond_c
    iget-object v0, p0, Ldefpackage/eo2;->p:[B

    .line 292
    .line 293
    if-nez v0, :cond_d

    .line 294
    .line 295
    :try_start_2
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 296
    .line 297
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 298
    .line 299
    .line 300
    :try_start_3
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 301
    .line 302
    invoke-virtual {p1, v4, v6, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    iput-object p1, p0, Ldefpackage/eo2;->p:[B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 310
    .line 311
    :try_start_4
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 312
    .line 313
    .line 314
    goto :goto_c

    .line 315
    :catch_2
    move-exception p1

    .line 316
    goto :goto_b

    .line 317
    :catchall_0
    move-exception p1

    .line 318
    :try_start_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 319
    .line 320
    .line 321
    goto :goto_a

    .line 322
    :catchall_1
    move-exception v0

    .line 323
    :try_start_6
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    :goto_a
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 327
    :goto_b
    const-string v0, "Failed to compress MediaMetadataCompat artwork"

    .line 328
    .line 329
    invoke-static {v1, v0, p1}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    :cond_d
    :goto_c
    iget-object v7, p0, Ldefpackage/eo2;->p:[B

    .line 333
    .line 334
    :goto_d
    if-eqz v7, :cond_e

    .line 335
    .line 336
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-virtual {v3, v7, p1}, Ldefpackage/co2;->c([BLjava/lang/Integer;)V

    .line 341
    .line 342
    .line 343
    :cond_e
    const-string p1, "android.media.metadata.BT_FOLDER_TYPE"

    .line 344
    .line 345
    invoke-virtual {v2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    iput-object v1, v3, Ldefpackage/co2;->q:Ljava/lang/Boolean;

    .line 354
    .line 355
    if-eqz v0, :cond_f

    .line 356
    .line 357
    invoke-virtual {p0, p1}, Ldefpackage/eo2;->a(Ljava/lang/String;)J

    .line 358
    .line 359
    .line 360
    move-result-wide v0

    .line 361
    invoke-static {v0, v1}, Ldefpackage/f92;->f(J)I

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    iput-object p1, v3, Ldefpackage/co2;->p:Ljava/lang/Integer;

    .line 370
    .line 371
    :cond_f
    const-string p1, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 372
    .line 373
    invoke-virtual {v2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_10

    .line 378
    .line 379
    invoke-virtual {p0, p1}, Ldefpackage/eo2;->a(Ljava/lang/String;)J

    .line 380
    .line 381
    .line 382
    move-result-wide p0

    .line 383
    long-to-int p0, p0

    .line 384
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    iput-object p0, v3, Ldefpackage/co2;->G:Ljava/lang/Integer;

    .line 389
    .line 390
    :cond_10
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 391
    .line 392
    iput-object p0, v3, Ldefpackage/co2;->r:Ljava/lang/Boolean;

    .line 393
    .line 394
    new-instance p0, Landroid/os/Bundle;

    .line 395
    .line 396
    invoke-direct {p0, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 397
    .line 398
    .line 399
    sget-object p1, Ldefpackage/f92;->a:Ldefpackage/jx1;

    .line 400
    .line 401
    invoke-virtual {p1}, Ldefpackage/rw1;->h()Ldefpackage/o15;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    if-eqz v0, :cond_11

    .line 410
    .line 411
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    check-cast v0, Ljava/lang/String;

    .line 416
    .line 417
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    goto :goto_e

    .line 421
    :cond_11
    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    if-nez p1, :cond_12

    .line 426
    .line 427
    iput-object p0, v3, Ldefpackage/co2;->H:Landroid/os/Bundle;

    .line 428
    .line 429
    :cond_12
    new-instance p0, Ldefpackage/do2;

    .line 430
    .line 431
    invoke-direct {p0, v3}, Ldefpackage/do2;-><init>(Ldefpackage/co2;)V

    .line 432
    .line 433
    .line 434
    return-object p0

    .line 435
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static n(Ldefpackage/do2;Ljava/lang/String;Landroid/net/Uri;JLandroid/graphics/Bitmap;)Ldefpackage/eo2;
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/pz1;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/pz1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "android.media.metadata.MEDIA_ID"

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Ldefpackage/pz1;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Ldefpackage/do2;->a:Ljava/lang/CharSequence;

    .line 13
    .line 14
    iget-object v1, p0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 15
    .line 16
    iget-object v2, p0, Ldefpackage/do2;->p:Ljava/lang/Integer;

    .line 17
    .line 18
    iget-object v3, p0, Ldefpackage/do2;->m:Landroid/net/Uri;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-string v4, "android.media.metadata.TITLE"

    .line 23
    .line 24
    invoke-virtual {v0, p1, v4}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object p1, p0, Ldefpackage/do2;->e:Ljava/lang/CharSequence;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const-string v4, "android.media.metadata.DISPLAY_TITLE"

    .line 32
    .line 33
    invoke-virtual {v0, p1, v4}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p1, p0, Ldefpackage/do2;->f:Ljava/lang/CharSequence;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    const-string v4, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 41
    .line 42
    invoke-virtual {v0, p1, v4}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object p1, p0, Ldefpackage/do2;->g:Ljava/lang/CharSequence;

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    const-string v4, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 50
    .line 51
    invoke-virtual {v0, p1, v4}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iget-object p1, p0, Ldefpackage/do2;->b:Ljava/lang/CharSequence;

    .line 55
    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    const-string v4, "android.media.metadata.ARTIST"

    .line 59
    .line 60
    invoke-virtual {v0, p1, v4}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget-object p1, p0, Ldefpackage/do2;->c:Ljava/lang/CharSequence;

    .line 64
    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    const-string v4, "android.media.metadata.ALBUM"

    .line 68
    .line 69
    invoke-virtual {v0, p1, v4}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    iget-object p1, p0, Ldefpackage/do2;->d:Ljava/lang/CharSequence;

    .line 73
    .line 74
    if-eqz p1, :cond_6

    .line 75
    .line 76
    const-string v4, "android.media.metadata.ALBUM_ARTIST"

    .line 77
    .line 78
    invoke-virtual {v0, p1, v4}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_6
    iget-object p1, p0, Ldefpackage/do2;->t:Ljava/lang/Integer;

    .line 82
    .line 83
    if-eqz p1, :cond_7

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    int-to-long v4, p1

    .line 90
    const-string p1, "android.media.metadata.YEAR"

    .line 91
    .line 92
    invoke-virtual {v0, p1, v4, v5}, Ldefpackage/pz1;->D(Ljava/lang/String;J)V

    .line 93
    .line 94
    .line 95
    :cond_7
    iget-object p1, p0, Ldefpackage/do2;->z:Ljava/lang/CharSequence;

    .line 96
    .line 97
    if-eqz p1, :cond_8

    .line 98
    .line 99
    const-string v4, "android.media.metadata.WRITER"

    .line 100
    .line 101
    invoke-virtual {v0, p1, v4}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_8
    iget-object p1, p0, Ldefpackage/do2;->A:Ljava/lang/CharSequence;

    .line 105
    .line 106
    if-eqz p1, :cond_9

    .line 107
    .line 108
    const-string v4, "android.media.metadata.COMPOSER"

    .line 109
    .line 110
    invoke-virtual {v0, p1, v4}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_9
    if-eqz p2, :cond_a

    .line 114
    .line 115
    const-string p1, "android.media.metadata.MEDIA_URI"

    .line 116
    .line 117
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {v0, p1, p2}, Ldefpackage/pz1;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_a
    if-eqz v3, :cond_b

    .line 125
    .line 126
    const-string p1, "android.media.metadata.DISPLAY_ICON_URI"

    .line 127
    .line 128
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {v0, p1, p2}, Ldefpackage/pz1;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string p1, "android.media.metadata.ALBUM_ART_URI"

    .line 136
    .line 137
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {v0, p1, p2}, Ldefpackage/pz1;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-string p1, "android.media.metadata.ART_URI"

    .line 145
    .line 146
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {v0, p1, p2}, Ldefpackage/pz1;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_b
    if-eqz p5, :cond_c

    .line 154
    .line 155
    const-string p1, "android.media.metadata.DISPLAY_ICON"

    .line 156
    .line 157
    invoke-virtual {v0, p1, p5}, Ldefpackage/pz1;->C(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 158
    .line 159
    .line 160
    const-string p1, "android.media.metadata.ALBUM_ART"

    .line 161
    .line 162
    invoke-virtual {v0, p1, p5}, Ldefpackage/pz1;->C(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 163
    .line 164
    .line 165
    :cond_c
    if-eqz v2, :cond_d

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    const/4 p2, -0x1

    .line 172
    if-eq p1, p2, :cond_d

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    invoke-static {p1}, Ldefpackage/f92;->e(I)J

    .line 179
    .line 180
    .line 181
    move-result-wide p1

    .line 182
    const-string p5, "android.media.metadata.BT_FOLDER_TYPE"

    .line 183
    .line 184
    invoke-virtual {v0, p5, p1, p2}, Ldefpackage/pz1;->D(Ljava/lang/String;J)V

    .line 185
    .line 186
    .line 187
    :cond_d
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    cmp-long p5, p3, p1

    .line 193
    .line 194
    if-nez p5, :cond_e

    .line 195
    .line 196
    iget-object p5, p0, Ldefpackage/do2;->h:Ljava/lang/Long;

    .line 197
    .line 198
    if-eqz p5, :cond_e

    .line 199
    .line 200
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    .line 201
    .line 202
    .line 203
    move-result-wide p3

    .line 204
    :cond_e
    cmp-long p1, p3, p1

    .line 205
    .line 206
    if-eqz p1, :cond_f

    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_f
    const-wide/16 p3, -0x1

    .line 210
    .line 211
    :goto_0
    const-string p1, "android.media.metadata.DURATION"

    .line 212
    .line 213
    invoke-virtual {v0, p1, p3, p4}, Ldefpackage/pz1;->D(Ljava/lang/String;J)V

    .line 214
    .line 215
    .line 216
    iget-object p1, p0, Ldefpackage/do2;->i:Ldefpackage/lu3;

    .line 217
    .line 218
    invoke-static {p1}, Ldefpackage/f92;->r(Ldefpackage/lu3;)Ldefpackage/mu3;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    if-eqz p1, :cond_10

    .line 223
    .line 224
    const-string p2, "android.media.metadata.USER_RATING"

    .line 225
    .line 226
    invoke-virtual {v0, p2, p1}, Ldefpackage/pz1;->E(Ljava/lang/String;Ldefpackage/mu3;)V

    .line 227
    .line 228
    .line 229
    :cond_10
    iget-object p1, p0, Ldefpackage/do2;->j:Ldefpackage/lu3;

    .line 230
    .line 231
    invoke-static {p1}, Ldefpackage/f92;->r(Ldefpackage/lu3;)Ldefpackage/mu3;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    if-eqz p1, :cond_11

    .line 236
    .line 237
    const-string p2, "android.media.metadata.RATING"

    .line 238
    .line 239
    invoke-virtual {v0, p2, p1}, Ldefpackage/pz1;->E(Ljava/lang/String;Ldefpackage/mu3;)V

    .line 240
    .line 241
    .line 242
    :cond_11
    iget-object p0, p0, Ldefpackage/do2;->H:Ljava/lang/Integer;

    .line 243
    .line 244
    if-eqz p0, :cond_12

    .line 245
    .line 246
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    int-to-long p0, p0

    .line 251
    const-string p2, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"

    .line 252
    .line 253
    invoke-virtual {v0, p2, p0, p1}, Ldefpackage/pz1;->D(Ljava/lang/String;J)V

    .line 254
    .line 255
    .line 256
    :cond_12
    if-eqz v1, :cond_17

    .line 257
    .line 258
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    :cond_13
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-eqz p1, :cond_17

    .line 271
    .line 272
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    check-cast p1, Ljava/lang/String;

    .line 277
    .line 278
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    if-eqz p2, :cond_16

    .line 283
    .line 284
    instance-of p3, p2, Ljava/lang/CharSequence;

    .line 285
    .line 286
    if-eqz p3, :cond_14

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_14
    instance-of p3, p2, Ljava/lang/Byte;

    .line 290
    .line 291
    if-nez p3, :cond_15

    .line 292
    .line 293
    instance-of p3, p2, Ljava/lang/Short;

    .line 294
    .line 295
    if-nez p3, :cond_15

    .line 296
    .line 297
    instance-of p3, p2, Ljava/lang/Integer;

    .line 298
    .line 299
    if-nez p3, :cond_15

    .line 300
    .line 301
    instance-of p3, p2, Ljava/lang/Long;

    .line 302
    .line 303
    if-eqz p3, :cond_13

    .line 304
    .line 305
    :cond_15
    check-cast p2, Ljava/lang/Number;

    .line 306
    .line 307
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 308
    .line 309
    .line 310
    move-result-wide p2

    .line 311
    invoke-virtual {v0, p1, p2, p3}, Ldefpackage/pz1;->D(Ljava/lang/String;J)V

    .line 312
    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_16
    :goto_2
    check-cast p2, Ljava/lang/CharSequence;

    .line 316
    .line 317
    invoke-virtual {v0, p2, p1}, Ldefpackage/pz1;->G(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    goto :goto_1

    .line 321
    :cond_17
    new-instance p0, Ldefpackage/eo2;

    .line 322
    .line 323
    iget-object p1, v0, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast p1, Landroid/os/Bundle;

    .line 326
    .line 327
    invoke-direct {p0, p1}, Ldefpackage/eo2;-><init>(Landroid/os/Bundle;)V

    .line 328
    .line 329
    .line 330
    return-object p0
.end method

.method public static o(Ldefpackage/ei3;Landroid/content/Context;)Landroidx/media3/common/PlaybackException;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    iget v1, p0, Ldefpackage/ei3;->s:I

    .line 5
    .line 6
    iget v2, p0, Ldefpackage/ei3;->n:I

    .line 7
    .line 8
    const/4 v3, 0x7

    .line 9
    if-eq v2, v3, :cond_0

    .line 10
    .line 11
    goto :goto_4

    .line 12
    :cond_0
    iget-object v2, p0, Ldefpackage/ei3;->t:Ljava/lang/CharSequence;

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    invoke-static {v1}, Ldefpackage/f92;->t(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {p1, v2}, Ldefpackage/f92;->x(Landroid/content/Context;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_1
    iget-object p0, p0, Ldefpackage/ei3;->x:Landroid/os/Bundle;

    .line 25
    .line 26
    new-instance v3, Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_2
    move-object v4, v0

    .line 35
    invoke-static {v1}, Ldefpackage/f92;->t(I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/4 v0, -0x5

    .line 40
    if-eq p1, v0, :cond_4

    .line 41
    .line 42
    const/4 v0, -0x1

    .line 43
    if-eq p1, v0, :cond_3

    .line 44
    .line 45
    :goto_0
    move v6, p1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/16 p1, 0x3e8

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    const/16 p1, 0x7d0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    if-eqz p0, :cond_5

    .line 54
    .line 55
    :goto_2
    move-object v7, p0

    .line 56
    goto :goto_3

    .line 57
    :cond_5
    sget-object p0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v8

    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-direct/range {v3 .. v9}, Landroidx/media3/common/PlaybackException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILandroid/os/Bundle;J)V

    .line 66
    .line 67
    .line 68
    return-object v3

    .line 69
    :cond_6
    :goto_4
    return-object v0
.end method

.method public static p(I)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p0, v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p0, v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "Unrecognized RepeatMode: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p0, " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`"

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "LegacyConversions"

    .line 30
    .line 31
    invoke-static {v1, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return v0

    .line 35
    :cond_0
    return v1

    .line 36
    :cond_1
    return v0
.end method

.method public static q(Ldefpackage/mu3;)Ldefpackage/lu3;
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget v0, p0, Ldefpackage/mu3;->o:F

    .line 5
    .line 6
    iget v1, p0, Ldefpackage/mu3;->n:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/high16 v3, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/mu3;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    new-instance v2, Ldefpackage/jf3;

    .line 24
    .line 25
    const/4 v3, 0x6

    .line 26
    if-ne v1, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ldefpackage/mu3;->c()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    :cond_1
    const/high16 v0, -0x40800000    # -1.0f

    .line 35
    .line 36
    :cond_2
    invoke-direct {v2, v0}, Ldefpackage/jf3;-><init>(F)V

    .line 37
    .line 38
    .line 39
    return-object v2

    .line 40
    :cond_3
    new-instance p0, Ldefpackage/jf3;

    .line 41
    .line 42
    invoke-direct {p0}, Ldefpackage/jf3;-><init>()V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    invoke-virtual {p0}, Ldefpackage/mu3;->c()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x5

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    new-instance v0, Ldefpackage/xk4;

    .line 54
    .line 55
    invoke-virtual {p0}, Ldefpackage/mu3;->b()F

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-direct {v0, v1, p0}, Ldefpackage/xk4;-><init>(IF)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_4
    new-instance p0, Ldefpackage/xk4;

    .line 64
    .line 65
    invoke-direct {p0, v1}, Ldefpackage/xk4;-><init>(I)V

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_2
    invoke-virtual {p0}, Ldefpackage/mu3;->c()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/4 v1, 0x4

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    new-instance v0, Ldefpackage/xk4;

    .line 77
    .line 78
    invoke-virtual {p0}, Ldefpackage/mu3;->b()F

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-direct {v0, v1, p0}, Ldefpackage/xk4;-><init>(IF)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_5
    new-instance p0, Ldefpackage/xk4;

    .line 87
    .line 88
    invoke-direct {p0, v1}, Ldefpackage/xk4;-><init>(I)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_3
    invoke-virtual {p0}, Ldefpackage/mu3;->c()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    const/4 v1, 0x3

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    new-instance v0, Ldefpackage/xk4;

    .line 100
    .line 101
    invoke-virtual {p0}, Ldefpackage/mu3;->b()F

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    invoke-direct {v0, v1, p0}, Ldefpackage/xk4;-><init>(IF)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_6
    new-instance p0, Ldefpackage/xk4;

    .line 110
    .line 111
    invoke-direct {p0, v1}, Ldefpackage/xk4;-><init>(I)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_4
    invoke-virtual {p0}, Ldefpackage/mu3;->c()Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_9

    .line 120
    .line 121
    new-instance p0, Ldefpackage/qt4;

    .line 122
    .line 123
    const/4 v5, 0x2

    .line 124
    if-eq v1, v5, :cond_8

    .line 125
    .line 126
    :cond_7
    move v2, v4

    .line 127
    goto :goto_1

    .line 128
    :cond_8
    cmpl-float v0, v0, v3

    .line 129
    .line 130
    if-nez v0, :cond_7

    .line 131
    .line 132
    :goto_1
    invoke-direct {p0, v2}, Ldefpackage/qt4;-><init>(Z)V

    .line 133
    .line 134
    .line 135
    return-object p0

    .line 136
    :cond_9
    new-instance p0, Ldefpackage/qt4;

    .line 137
    .line 138
    invoke-direct {p0}, Ldefpackage/qt4;-><init>()V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_5
    invoke-virtual {p0}, Ldefpackage/mu3;->c()Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-eqz p0, :cond_c

    .line 147
    .line 148
    new-instance p0, Ldefpackage/vl1;

    .line 149
    .line 150
    if-eq v1, v2, :cond_b

    .line 151
    .line 152
    :cond_a
    move v2, v4

    .line 153
    goto :goto_2

    .line 154
    :cond_b
    cmpl-float v0, v0, v3

    .line 155
    .line 156
    if-nez v0, :cond_a

    .line 157
    .line 158
    :goto_2
    invoke-direct {p0, v2}, Ldefpackage/vl1;-><init>(Z)V

    .line 159
    .line 160
    .line 161
    return-object p0

    .line 162
    :cond_c
    new-instance p0, Ldefpackage/vl1;

    .line 163
    .line 164
    invoke-direct {p0}, Ldefpackage/vl1;-><init>()V

    .line 165
    .line 166
    .line 167
    return-object p0

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static r(Ldefpackage/lu3;)Ldefpackage/mu3;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p0}, Ldefpackage/f92;->w(Ldefpackage/lu3;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Ldefpackage/lu3;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance p0, Ldefpackage/mu3;

    .line 20
    .line 21
    const/high16 v0, -0x40800000    # -1.0f

    .line 22
    .line 23
    invoke-direct {p0, v1, v0}, Ldefpackage/mu3;-><init>(IF)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    const/high16 v3, 0x3f800000    # 1.0f

    .line 29
    .line 30
    packed-switch v1, :pswitch_data_1

    .line 31
    .line 32
    .line 33
    :goto_0
    return-object v0

    .line 34
    :pswitch_1
    check-cast p0, Ldefpackage/jf3;

    .line 35
    .line 36
    iget p0, p0, Ldefpackage/jf3;->b:F

    .line 37
    .line 38
    invoke-static {p0}, Ldefpackage/mu3;->d(F)Ldefpackage/mu3;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    check-cast p0, Ldefpackage/xk4;

    .line 44
    .line 45
    iget p0, p0, Ldefpackage/xk4;->c:F

    .line 46
    .line 47
    invoke-static {v1, p0}, Ldefpackage/mu3;->e(IF)Ldefpackage/mu3;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_3
    check-cast p0, Ldefpackage/qt4;

    .line 53
    .line 54
    iget-boolean p0, p0, Ldefpackage/qt4;->c:Z

    .line 55
    .line 56
    new-instance v0, Ldefpackage/mu3;

    .line 57
    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    move v2, v3

    .line 61
    :cond_2
    const/4 p0, 0x2

    .line 62
    invoke-direct {v0, p0, v2}, Ldefpackage/mu3;-><init>(IF)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_4
    check-cast p0, Ldefpackage/vl1;

    .line 67
    .line 68
    iget-boolean p0, p0, Ldefpackage/vl1;->c:Z

    .line 69
    .line 70
    new-instance v0, Ldefpackage/mu3;

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    move v2, v3

    .line 75
    :cond_3
    const/4 p0, 0x1

    .line 76
    invoke-direct {v0, p0, v2}, Ldefpackage/mu3;-><init>(IF)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 82
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static s(I)I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    if-eq p0, v2, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Unrecognized PlaybackStateCompat.RepeatMode: "

    .line 19
    .line 20
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, " was converted to `Player.REPEAT_MODE_OFF`"

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, "LegacyConversions"

    .line 36
    .line 37
    invoke-static {v0, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return v1

    .line 41
    :cond_0
    return v0

    .line 42
    :cond_1
    return v1
.end method

.method public static t(I)I
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :pswitch_0
    const/16 p0, -0x6d

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_1
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :pswitch_2
    const/16 p0, -0x6b

    .line 12
    .line 13
    return p0

    .line 14
    :pswitch_3
    const/16 p0, -0x6e

    .line 15
    .line 16
    return p0

    .line 17
    :pswitch_4
    const/16 p0, -0x6a

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_5
    const/16 p0, -0x69

    .line 21
    .line 22
    return p0

    .line 23
    :pswitch_6
    const/16 p0, -0x68

    .line 24
    .line 25
    return p0

    .line 26
    :pswitch_7
    const/16 p0, -0x67

    .line 27
    .line 28
    return p0

    .line 29
    :pswitch_8
    const/16 p0, -0x66

    .line 30
    .line 31
    return p0

    .line 32
    :pswitch_9
    const/4 p0, -0x6

    .line 33
    return p0

    .line 34
    :pswitch_a
    const/4 p0, -0x2

    .line 35
    return p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static u(I)Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p0, v0, :cond_2

    .line 3
    .line 4
    if-eqz p0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-ne p0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v0, "Unrecognized ShuffleMode: "

    .line 14
    .line 15
    invoke-static {p0, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    return v0

    .line 25
    :cond_2
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static v(Ldefpackage/ic2;)V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0xbb8

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    move-wide v5, v2

    .line 9
    :goto_0
    :try_start_0
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    invoke-interface {p0, v5, v6, v7}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :catch_0
    const/4 v4, 0x1

    .line 27
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    sub-long/2addr v5, v0

    .line 32
    cmp-long v7, v5, v2

    .line 33
    .line 34
    if-gez v7, :cond_1

    .line 35
    .line 36
    sub-long v5, v2, v5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :goto_1
    if-eqz v4, :cond_2

    .line 46
    .line 47
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 52
    .line 53
    .line 54
    :cond_2
    throw p0
.end method

.method public static w(Ldefpackage/lu3;)I
    .locals 1

    .line 1
    instance-of v0, p0, Ldefpackage/vl1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    instance-of v0, p0, Ldefpackage/qt4;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x2

    .line 12
    return p0

    .line 13
    :cond_1
    instance-of v0, p0, Ldefpackage/xk4;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    check-cast p0, Ldefpackage/xk4;

    .line 18
    .line 19
    iget p0, p0, Ldefpackage/xk4;->b:I

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    if-eq p0, v0, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x5

    .line 28
    if-eq p0, v0, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v0

    .line 32
    :cond_3
    instance-of p0, p0, Ldefpackage/jf3;

    .line 33
    .line 34
    if-eqz p0, :cond_4

    .line 35
    .line 36
    const/4 p0, 0x6

    .line 37
    return p0

    .line 38
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public static x(Landroid/content/Context;I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    if-eq p1, v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_5

    .line 7
    .line 8
    const/4 v0, -0x6

    .line 9
    if-eq p1, v0, :cond_4

    .line 10
    .line 11
    const/4 v0, -0x5

    .line 12
    if-eq p1, v0, :cond_3

    .line 13
    .line 14
    const/4 v0, -0x4

    .line 15
    if-eq p1, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, -0x3

    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, -0x2

    .line 21
    if-eq p1, v0, :cond_0

    .line 22
    .line 23
    packed-switch p1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    const p1, 0x7f130107

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    const p1, 0x7f130101

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_1
    const p1, 0x7f13010f

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_2
    const p1, 0x7f130103

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_3
    const p1, 0x7f13010d

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_4
    const p1, 0x7f13010b

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_5
    const p1, 0x7f130111

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_6
    const p1, 0x7f130110

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_7
    const p1, 0x7f130106

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_8
    const p1, 0x7f130104

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_0
    const p1, 0x7f130109

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :cond_1
    const p1, 0x7f130102

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :cond_2
    const p1, 0x7f13010e

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :cond_3
    const p1, 0x7f13010a

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :cond_4
    const p1, 0x7f13010c

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0

    .line 146
    :cond_5
    const p1, 0x7f130108

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_6
    const p1, 0x7f130105

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch -0x6e
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static y(JJ)Z
    .locals 0

    .line 1
    and-long/2addr p0, p2

    .line 2
    const-wide/16 p2, 0x0

    .line 3
    .line 4
    cmp-long p0, p0, p2

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method
