.class public final Luk2;
.super Landroid/media/session/MediaController$Callback;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lgm2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Luk2;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Landroid/media/session/MediaController$Callback;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Luk2;->b:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lnp2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Luk2;->a:I

    .line 15
    invoke-direct {p0}, Landroid/media/session/MediaController$Callback;-><init>()V

    .line 16
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Luk2;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onAudioInfoChanged(Landroid/media/session/MediaController$PlaybackInfo;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luk2;->a:I

    .line 4
    .line 5
    iget-object v0, v0, Luk2;->b:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lnp2;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getPlaybackType()I

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getAudioAttributes()Landroid/media/AudioAttributes;

    .line 22
    .line 23
    .line 24
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v1, 0x1a

    .line 27
    .line 28
    if-lt v0, v1, :cond_0

    .line 29
    .line 30
    new-instance v0, Landroidx/media/AudioAttributesCompat;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Landroidx/media/AudioAttributesCompat;

    .line 34
    .line 35
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getVolumeControl()I

    .line 36
    .line 37
    .line 38
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getMaxVolume()I

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getCurrentVolume()I

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void

    .line 45
    :pswitch_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lgm2;

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    if-eqz p1, :cond_5

    .line 54
    .line 55
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getPlaybackType()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const/16 v3, 0x1e

    .line 62
    .line 63
    if-lt v1, v3, :cond_2

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, Ll3;->q(Landroid/media/session/MediaController$PlaybackInfo;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_1
    move-object v7, v1

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/4 v1, 0x0

    .line 72
    goto :goto_1

    .line 73
    :goto_2
    const/4 v1, 0x1

    .line 74
    if-ne v2, v1, :cond_4

    .line 75
    .line 76
    if-nez v7, :cond_3

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    const/4 v1, 0x0

    .line 80
    :cond_4
    :goto_3
    invoke-static {v1}, Lrr2;->l(Z)V

    .line 81
    .line 82
    .line 83
    new-instance v1, Lfg4;

    .line 84
    .line 85
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getAudioAttributes()Landroid/media/AudioAttributes;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-static {v3}, Lil;->b(Landroid/media/AudioAttributes;)Lil;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getVolumeControl()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getMaxVolume()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    invoke-virtual/range {p1 .. p1}, Landroid/media/session/MediaController$PlaybackInfo;->getCurrentVolume()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    invoke-direct/range {v1 .. v7}, Lfg4;-><init>(ILil;IIILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object v2, v0, Lgm2;->e:Lim2;

    .line 109
    .line 110
    iget-object v3, v2, Lim2;->n:Lhm2;

    .line 111
    .line 112
    new-instance v8, Lhm2;

    .line 113
    .line 114
    iget-object v4, v3, Lhm2;->e:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v10, v4

    .line 117
    check-cast v10, Lei3;

    .line 118
    .line 119
    iget-object v4, v3, Lhm2;->f:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v11, v4

    .line 122
    check-cast v11, Leo2;

    .line 123
    .line 124
    iget-object v12, v3, Lhm2;->a:Ljava/util/List;

    .line 125
    .line 126
    iget-object v4, v3, Lhm2;->g:Ljava/lang/Object;

    .line 127
    .line 128
    move-object v13, v4

    .line 129
    check-cast v13, Ljava/lang/CharSequence;

    .line 130
    .line 131
    iget v14, v3, Lhm2;->b:I

    .line 132
    .line 133
    iget v15, v3, Lhm2;->c:I

    .line 134
    .line 135
    iget-object v3, v3, Lhm2;->h:Ljava/lang/Object;

    .line 136
    .line 137
    move-object/from16 v16, v3

    .line 138
    .line 139
    check-cast v16, Landroid/os/Bundle;

    .line 140
    .line 141
    move-object v9, v1

    .line 142
    invoke-direct/range {v8 .. v16}, Lhm2;-><init>(Lfg4;Lei3;Leo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 143
    .line 144
    .line 145
    iput-object v8, v2, Lim2;->n:Lhm2;

    .line 146
    .line 147
    invoke-virtual {v0}, Lgm2;->e()V

    .line 148
    .line 149
    .line 150
    :cond_5
    return-void

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onExtrasChanged(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    iget v0, p0, Luk2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Luk2;->b:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lrr2;->z(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lnp2;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-static {p1}, Lf35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lgm2;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lgm2;->e:Lim2;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 37
    .line 38
    .line 39
    :cond_0
    move-object v9, p1

    .line 40
    iget-object p1, v0, Lim2;->n:Lhm2;

    .line 41
    .line 42
    new-instance v1, Lhm2;

    .line 43
    .line 44
    iget-object v2, p1, Lhm2;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lfg4;

    .line 47
    .line 48
    iget-object v3, p1, Lhm2;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Lei3;

    .line 51
    .line 52
    iget-object v4, p1, Lhm2;->f:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Leo2;

    .line 55
    .line 56
    iget-object v5, p1, Lhm2;->a:Ljava/util/List;

    .line 57
    .line 58
    iget-object v6, p1, Lhm2;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v6, Ljava/lang/CharSequence;

    .line 61
    .line 62
    iget v7, p1, Lhm2;->b:I

    .line 63
    .line 64
    iget v8, p1, Lhm2;->c:I

    .line 65
    .line 66
    invoke-direct/range {v1 .. v9}, Lhm2;-><init>(Lfg4;Lei3;Leo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, v0, Lim2;->n:Lhm2;

    .line 70
    .line 71
    const/4 p1, 0x1

    .line 72
    iput-boolean p1, v0, Lim2;->o:Z

    .line 73
    .line 74
    invoke-virtual {p0}, Lgm2;->e()V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onMetadataChanged(Landroid/media/MediaMetadata;)V
    .locals 12

    .line 1
    iget v0, p0, Luk2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Luk2;->b:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lnp2;

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    invoke-static {p1}, Landroid/support/v4/media/MediaMetadataCompat;->a(Landroid/media/MediaMetadata;)Landroid/support/v4/media/MediaMetadataCompat;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget v0, p0, Lnp2;->a:I

    .line 23
    .line 24
    packed-switch v0, :pswitch_data_1

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lnp2;->b:Ldg;

    .line 28
    .line 29
    check-cast p0, Llq2;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->b()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :goto_0
    iput-object v2, p0, Llq2;->Y:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 39
    .line 40
    invoke-virtual {p0}, Llq2;->j()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Llq2;->n()V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :pswitch_0
    iget-object p0, p0, Lnp2;->b:Ldg;

    .line 48
    .line 49
    check-cast p0, Lqp2;

    .line 50
    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->b()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :goto_1
    iput-object v2, p0, Lqp2;->h0:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 59
    .line 60
    invoke-virtual {p0}, Lqp2;->u()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lqp2;->t(Z)V

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_2
    return-void

    .line 67
    :pswitch_1
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Lgm2;

    .line 72
    .line 73
    if-eqz p0, :cond_4

    .line 74
    .line 75
    sget-object v0, Leo2;->q:Loi;

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1, v0, v1}, Landroid/media/MediaMetadata;->writeToParcel(Landroid/os/Parcel;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 87
    .line 88
    .line 89
    sget-object v1, Leo2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 90
    .line 91
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    move-object v2, v1

    .line 96
    check-cast v2, Leo2;

    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 99
    .line 100
    .line 101
    iput-object p1, v2, Leo2;->o:Landroid/media/MediaMetadata;

    .line 102
    .line 103
    :cond_3
    move-object v6, v2

    .line 104
    iget-object p1, p0, Lgm2;->e:Lim2;

    .line 105
    .line 106
    iget-object v0, p1, Lim2;->n:Lhm2;

    .line 107
    .line 108
    new-instance v3, Lhm2;

    .line 109
    .line 110
    iget-object v1, v0, Lhm2;->d:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v4, v1

    .line 113
    check-cast v4, Lfg4;

    .line 114
    .line 115
    iget-object v1, v0, Lhm2;->e:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v5, v1

    .line 118
    check-cast v5, Lei3;

    .line 119
    .line 120
    iget-object v7, v0, Lhm2;->a:Ljava/util/List;

    .line 121
    .line 122
    iget-object v1, v0, Lhm2;->g:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v8, v1

    .line 125
    check-cast v8, Ljava/lang/CharSequence;

    .line 126
    .line 127
    iget v9, v0, Lhm2;->b:I

    .line 128
    .line 129
    iget v10, v0, Lhm2;->c:I

    .line 130
    .line 131
    iget-object v0, v0, Lhm2;->h:Ljava/lang/Object;

    .line 132
    .line 133
    move-object v11, v0

    .line 134
    check-cast v11, Landroid/os/Bundle;

    .line 135
    .line 136
    invoke-direct/range {v3 .. v11}, Lhm2;-><init>(Lfg4;Lei3;Leo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 137
    .line 138
    .line 139
    iput-object v3, p1, Lim2;->n:Lhm2;

    .line 140
    .line 141
    invoke-virtual {p0}, Lgm2;->e()V

    .line 142
    .line 143
    .line 144
    :cond_4
    return-void

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onPlaybackStateChanged(Landroid/media/session/PlaybackState;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luk2;->a:I

    .line 4
    .line 5
    iget-object v0, v0, Luk2;->b:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lnp2;

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, Lbi3;->j(Landroid/media/session/PlaybackState;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    new-instance v3, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    check-cast v4, Landroid/media/session/PlaybackState$CustomAction;

    .line 53
    .line 54
    invoke-static {v4}, Lbi3;->l(Landroid/media/session/PlaybackState$CustomAction;)Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {v5}, Lrr2;->z(Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 62
    .line 63
    invoke-static {v4}, Lbi3;->f(Landroid/media/session/PlaybackState$CustomAction;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-static {v4}, Lbi3;->o(Landroid/media/session/PlaybackState$CustomAction;)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-static {v4}, Lbi3;->m(Landroid/media/session/PlaybackState$CustomAction;)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-direct {v6, v7, v8, v4, v5}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    move-object v6, v1

    .line 80
    :goto_1
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move-object/from16 v19, v3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    move-object/from16 v19, v1

    .line 88
    .line 89
    :goto_2
    invoke-static/range {p1 .. p1}, Lci3;->a(Landroid/media/session/PlaybackState;)Landroid/os/Bundle;

    .line 90
    .line 91
    .line 92
    move-result-object v22

    .line 93
    invoke-static/range {v22 .. v22}, Lrr2;->z(Landroid/os/Bundle;)V

    .line 94
    .line 95
    .line 96
    new-instance v7, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 97
    .line 98
    invoke-static/range {p1 .. p1}, Lbi3;->r(Landroid/media/session/PlaybackState;)I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    invoke-static/range {p1 .. p1}, Lbi3;->q(Landroid/media/session/PlaybackState;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v9

    .line 106
    invoke-static/range {p1 .. p1}, Lbi3;->i(Landroid/media/session/PlaybackState;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v11

    .line 110
    invoke-static/range {p1 .. p1}, Lbi3;->p(Landroid/media/session/PlaybackState;)F

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    invoke-static/range {p1 .. p1}, Lbi3;->g(Landroid/media/session/PlaybackState;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v14

    .line 118
    invoke-static/range {p1 .. p1}, Lbi3;->k(Landroid/media/session/PlaybackState;)Ljava/lang/CharSequence;

    .line 119
    .line 120
    .line 121
    move-result-object v16

    .line 122
    invoke-static/range {p1 .. p1}, Lbi3;->n(Landroid/media/session/PlaybackState;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v17

    .line 126
    invoke-static/range {p1 .. p1}, Lbi3;->h(Landroid/media/session/PlaybackState;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v20

    .line 130
    invoke-direct/range {v7 .. v22}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJLjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 131
    .line 132
    .line 133
    move-object v1, v7

    .line 134
    :cond_3
    iget v2, v0, Lnp2;->a:I

    .line 135
    .line 136
    packed-switch v2, :pswitch_data_1

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :pswitch_0
    iget-object v0, v0, Lnp2;->b:Ldg;

    .line 141
    .line 142
    check-cast v0, Lqp2;

    .line 143
    .line 144
    iput-object v1, v0, Lqp2;->g0:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    invoke-virtual {v0, v1}, Lqp2;->t(Z)V

    .line 148
    .line 149
    .line 150
    :cond_4
    :goto_3
    return-void

    .line 151
    :pswitch_1
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Lgm2;

    .line 156
    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    iget-object v1, v0, Lgm2;->c:Ltk2;

    .line 160
    .line 161
    if-eqz v1, :cond_5

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_5
    invoke-static/range {p1 .. p1}, Lei3;->a(Landroid/media/session/PlaybackState;)Lei3;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v0, v1}, Lgm2;->b(Lei3;)V

    .line 169
    .line 170
    .line 171
    :cond_6
    :goto_4
    return-void

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onQueueChanged(Ljava/util/List;)V
    .locals 11

    .line 1
    iget v0, p0, Luk2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Luk2;->b:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lnp2;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    new-instance p0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    check-cast v0, Landroid/media/session/MediaSession$QueueItem;

    .line 44
    .line 45
    invoke-static {v0}, Lnr2;->b(Landroid/media/session/MediaSession$QueueItem;)Landroid/media/MediaDescription;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, Landroid/support/v4/media/MediaDescriptionCompat;->a(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v0}, Lnr2;->c(Landroid/media/session/MediaSession$QueueItem;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 58
    .line 59
    invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;J)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    const/4 v0, 0x0

    .line 64
    :goto_1
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    return-void

    .line 69
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Lgm2;

    .line 74
    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    invoke-static {p1}, Lor2;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v0, p0, Lgm2;->e:Lim2;

    .line 82
    .line 83
    iget-object v1, v0, Lim2;->n:Lhm2;

    .line 84
    .line 85
    invoke-static {p1}, Lim2;->X0(Ljava/util/ArrayList;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    new-instance v2, Lhm2;

    .line 90
    .line 91
    iget-object p1, v1, Lhm2;->d:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v3, p1

    .line 94
    check-cast v3, Lfg4;

    .line 95
    .line 96
    iget-object p1, v1, Lhm2;->e:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v4, p1

    .line 99
    check-cast v4, Lei3;

    .line 100
    .line 101
    iget-object p1, v1, Lhm2;->f:Ljava/lang/Object;

    .line 102
    .line 103
    move-object v5, p1

    .line 104
    check-cast v5, Leo2;

    .line 105
    .line 106
    iget-object p1, v1, Lhm2;->g:Ljava/lang/Object;

    .line 107
    .line 108
    move-object v7, p1

    .line 109
    check-cast v7, Ljava/lang/CharSequence;

    .line 110
    .line 111
    iget v8, v1, Lhm2;->b:I

    .line 112
    .line 113
    iget v9, v1, Lhm2;->c:I

    .line 114
    .line 115
    iget-object p1, v1, Lhm2;->h:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v10, p1

    .line 118
    check-cast v10, Landroid/os/Bundle;

    .line 119
    .line 120
    invoke-direct/range {v2 .. v10}, Lhm2;-><init>(Lfg4;Lei3;Leo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 121
    .line 122
    .line 123
    iput-object v2, v0, Lim2;->n:Lhm2;

    .line 124
    .line 125
    invoke-virtual {p0}, Lgm2;->e()V

    .line 126
    .line 127
    .line 128
    :cond_2
    return-void

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onQueueTitleChanged(Ljava/lang/CharSequence;)V
    .locals 11

    .line 1
    iget v0, p0, Luk2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Luk2;->b:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lnp2;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lgm2;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lgm2;->e:Lim2;

    .line 24
    .line 25
    iget-object v1, v0, Lim2;->n:Lhm2;

    .line 26
    .line 27
    new-instance v2, Lhm2;

    .line 28
    .line 29
    iget-object v3, v1, Lhm2;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Lfg4;

    .line 32
    .line 33
    iget-object v4, v1, Lhm2;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Lei3;

    .line 36
    .line 37
    iget-object v5, v1, Lhm2;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Leo2;

    .line 40
    .line 41
    iget-object v6, v1, Lhm2;->a:Ljava/util/List;

    .line 42
    .line 43
    iget v8, v1, Lhm2;->b:I

    .line 44
    .line 45
    iget v9, v1, Lhm2;->c:I

    .line 46
    .line 47
    iget-object v1, v1, Lhm2;->h:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v10, v1

    .line 50
    check-cast v10, Landroid/os/Bundle;

    .line 51
    .line 52
    move-object v7, p1

    .line 53
    invoke-direct/range {v2 .. v10}, Lhm2;-><init>(Lfg4;Lei3;Leo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, v0, Lim2;->n:Lhm2;

    .line 57
    .line 58
    invoke-virtual {p0}, Lgm2;->e()V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSessionDestroyed()V
    .locals 1

    .line 1
    iget v0, p0, Luk2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Luk2;->b:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lnp2;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget p0, p0, Lnp2;->a:I

    .line 17
    .line 18
    packed-switch p0, :pswitch_data_1

    .line 19
    .line 20
    .line 21
    :cond_0
    :pswitch_0
    return-void

    .line 22
    :pswitch_1
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lgm2;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Lgm2;->e:Lim2;

    .line 31
    .line 32
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Lsk2;->Y0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget v0, p0, Luk2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Luk2;->b:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Lrr2;->z(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lnp2;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-static {p2}, Lf35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lgm2;

    .line 27
    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    iget-object p0, p0, Lgm2;->e:Lim2;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    if-nez p2, :cond_1

    .line 36
    .line 37
    sget-object p2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Lsk2;->f:Landroid/os/Handler;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-ne v0, v1, :cond_2

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const/4 v0, 0x0

    .line 61
    :goto_0
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Lsk2;->e:Lqk2;

    .line 65
    .line 66
    new-instance v0, Lva4;

    .line 67
    .line 68
    invoke-direct {v0, p1, p2}, Lva4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, v0}, Lqk2;->y(Lva4;)Lmw1;

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_1
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
