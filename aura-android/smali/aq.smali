.class public final Laq;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loi3;


# instance fields
.field public final synthetic n:Lcom/eddyizm/tempus/service/MediaService;

.field public final synthetic o:Lqi3;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/service/MediaService;Lqi3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 5
    .line 6
    iput-object p2, p0, Laq;->o:Lqi3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A(Ljw4;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Laq;->o:Lqi3;

    .line 5
    .line 6
    invoke-interface {v0}, Lqi3;->o0()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "onTracksChanged: "

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "BaseMediaService"

    .line 25
    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p1}, Ljz3;->p(Lqi3;Ljw4;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Lqi3;->a()Lgn2;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, Lgi1;->J(Lgn2;)Lgn2;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v3, p1, Lgn2;->d:Ldo2;

    .line 44
    .line 45
    iget-object v3, v3, Ldo2;->I:Landroid/os/Bundle;

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    invoke-static {p1, v1}, Lbo2;->m(Lgn2;Z)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object p0, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 53
    .line 54
    invoke-static {v0, p0}, Lis3;->a(Lqi3;Lao2;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    instance-of p0, v0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 58
    .line 59
    if-eqz p0, :cond_6

    .line 60
    .line 61
    sget-object p0, Lbo2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_6

    .line 68
    .line 69
    const-string p1, "update shuffle order"

    .line 70
    .line 71
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 75
    .line 76
    .line 77
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 78
    .line 79
    move-object p0, v0

    .line 80
    check-cast p0, Lfq;

    .line 81
    .line 82
    invoke-virtual {p0}, Lfq;->Q0()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    new-array p1, p0, [I

    .line 87
    .line 88
    move v2, v1

    .line 89
    :goto_0
    if-ge v2, p0, :cond_2

    .line 90
    .line 91
    aput v2, p1, v2

    .line 92
    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    sget-object v2, Lku3;->n:Lju3;

    .line 97
    .line 98
    add-int/lit8 v2, p0, -0x1

    .line 99
    .line 100
    :goto_1
    if-lez v2, :cond_3

    .line 101
    .line 102
    add-int/lit8 v3, v2, 0x1

    .line 103
    .line 104
    sget-object v4, Lku3;->o:Lz1;

    .line 105
    .line 106
    invoke-virtual {v4, v3}, Lz1;->a(I)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    aget v4, p1, v2

    .line 111
    .line 112
    aget v5, p1, v3

    .line 113
    .line 114
    aput v5, p1, v2

    .line 115
    .line 116
    aput v4, p1, v3

    .line 117
    .line 118
    add-int/lit8 v2, v2, -0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    check-cast v0, Li41;

    .line 122
    .line 123
    invoke-virtual {v0}, Li41;->o0()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-static {p1, v2}, Lti;->l0([II)I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    const/4 v3, -0x1

    .line 132
    if-le v2, v3, :cond_5

    .line 133
    .line 134
    if-nez p0, :cond_4

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    aget p0, p1, v1

    .line 138
    .line 139
    aget v3, p1, v2

    .line 140
    .line 141
    aput v3, p1, v1

    .line 142
    .line 143
    aput p0, p1, v2

    .line 144
    .line 145
    :cond_5
    :goto_2
    new-instance p0, Lpd4;

    .line 146
    .line 147
    sget-object v1, Lku3;->n:Lju3;

    .line 148
    .line 149
    sget-object v1, Lku3;->o:Lz1;

    .line 150
    .line 151
    invoke-virtual {v1}, Lz1;->b()Ljava/util/Random;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    .line 156
    .line 157
    .line 158
    move-result-wide v1

    .line 159
    invoke-direct {p0, p1, v1, v2}, Lpd4;-><init>([IJ)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, p0}, Li41;->s1(Lpd4;)V

    .line 163
    .line 164
    .line 165
    :cond_6
    return-void
.end method

.method public final I(Lcu4;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Laq;->o:Lqi3;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "onTimelineChanged reason="

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string v1, "BaseMediaService"

    .line 21
    .line 22
    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->u()V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-static {v0}, Ljz3;->g(Lqi3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p2

    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v3, "prefetchQueueGains failed: "

    .line 38
    .line 39
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {v1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    :goto_0
    sget-object p2, Lrs3;->a:Lrs3;

    .line 53
    .line 54
    invoke-virtual {p2, p0, v0}, Lrs3;->c(Landroid/content/Context;Lqi3;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcu4;->p()Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_0

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_0
    new-instance p2, Lbu4;

    .line 65
    .line 66
    invoke-direct {p2}, Lbu4;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcu4;->o()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/4 v1, 0x0

    .line 74
    :goto_1
    if-ge v1, v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1, v1, p2}, Lcu4;->n(ILbu4;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, p2, Lbu4;->b:Lgn2;

    .line 80
    .line 81
    iget-object v2, v2, Lgn2;->d:Ldo2;

    .line 82
    .line 83
    iget-object v2, v2, Ldo2;->m:Landroid/net/Uri;

    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    iget-object v3, p0, Lcom/eddyizm/tempus/service/MediaService;->y:Lns3;

    .line 88
    .line 89
    if-eqz v3, :cond_2

    .line 90
    .line 91
    iget-object v4, v3, Lns3;->p:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v4, Landroid/util/LruCache;

    .line 94
    .line 95
    invoke-virtual {v4, v2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    if-eqz v4, :cond_1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_1
    iget-object v4, v3, Lns3;->q:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v4, Ljava/util/concurrent/ExecutorService;

    .line 105
    .line 106
    new-instance v5, Lur2;

    .line 107
    .line 108
    const/16 v6, 0x17

    .line 109
    .line 110
    invoke-direct {v5, v6, v3, v2}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    const-string p0, "bitmapLoader"

    .line 118
    .line 119
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const/4 p0, 0x0

    .line 123
    throw p0

    .line 124
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    :goto_3
    return-void
.end method

.method public final S(Landroidx/media3/common/PlaybackException;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Landroidx/media3/common/PlaybackException;->n:I

    .line 5
    .line 6
    const/16 v1, -0x64

    .line 7
    .line 8
    if-eq v0, v1, :cond_7

    .line 9
    .line 10
    const/4 v1, -0x6

    .line 11
    if-eq v0, v1, :cond_6

    .line 12
    .line 13
    const/4 v1, -0x4

    .line 14
    if-eq v0, v1, :cond_5

    .line 15
    .line 16
    const/4 v1, -0x3

    .line 17
    if-eq v0, v1, :cond_4

    .line 18
    .line 19
    const/4 v1, -0x2

    .line 20
    if-eq v0, v1, :cond_3

    .line 21
    .line 22
    const/16 v1, 0x1b58

    .line 23
    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    const/16 v1, 0x1b59

    .line 27
    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    packed-switch v0, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    packed-switch v0, :pswitch_data_1

    .line 34
    .line 35
    .line 36
    packed-switch v0, :pswitch_data_2

    .line 37
    .line 38
    .line 39
    packed-switch v0, :pswitch_data_3

    .line 40
    .line 41
    .line 42
    packed-switch v0, :pswitch_data_4

    .line 43
    .line 44
    .line 45
    packed-switch v0, :pswitch_data_5

    .line 46
    .line 47
    .line 48
    packed-switch v0, :pswitch_data_6

    .line 49
    .line 50
    .line 51
    const v1, 0xf4240

    .line 52
    .line 53
    .line 54
    if-lt v0, v1, :cond_0

    .line 55
    .line 56
    const-string v1, "custom error code"

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_0
    const-string v1, "invalid error code"

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :pswitch_0
    const-string v1, "ERROR_CODE_DRM_LICENSE_EXPIRED"

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :pswitch_1
    const-string v1, "ERROR_CODE_DRM_DEVICE_REVOKED"

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :pswitch_2
    const-string v1, "ERROR_CODE_DRM_SYSTEM_ERROR"

    .line 73
    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    :pswitch_3
    const-string v1, "ERROR_CODE_DRM_DISALLOWED_OPERATION"

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :pswitch_4
    const-string v1, "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED"

    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :pswitch_5
    const-string v1, "ERROR_CODE_DRM_CONTENT_ERROR"

    .line 85
    .line 86
    goto/16 :goto_0

    .line 87
    .line 88
    :pswitch_6
    const-string v1, "ERROR_CODE_DRM_PROVISIONING_FAILED"

    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :pswitch_7
    const-string v1, "ERROR_CODE_DRM_SCHEME_UNSUPPORTED"

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :pswitch_8
    const-string v1, "ERROR_CODE_DRM_UNSPECIFIED"

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :pswitch_9
    const-string v1, "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED"

    .line 101
    .line 102
    goto/16 :goto_0

    .line 103
    .line 104
    :pswitch_a
    const-string v1, "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED"

    .line 105
    .line 106
    goto/16 :goto_0

    .line 107
    .line 108
    :pswitch_b
    const-string v1, "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED"

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :pswitch_c
    const-string v1, "ERROR_CODE_AUDIO_TRACK_INIT_FAILED"

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :pswitch_d
    const-string v1, "ERROR_CODE_DECODING_RESOURCES_RECLAIMED"

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :pswitch_e
    const-string v1, "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED"

    .line 121
    .line 122
    goto/16 :goto_0

    .line 123
    .line 124
    :pswitch_f
    const-string v1, "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES"

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :pswitch_10
    const-string v1, "ERROR_CODE_DECODING_FAILED"

    .line 129
    .line 130
    goto/16 :goto_0

    .line 131
    .line 132
    :pswitch_11
    const-string v1, "ERROR_CODE_DECODER_QUERY_FAILED"

    .line 133
    .line 134
    goto/16 :goto_0

    .line 135
    .line 136
    :pswitch_12
    const-string v1, "ERROR_CODE_DECODER_INIT_FAILED"

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :pswitch_13
    const-string v1, "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED"

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :pswitch_14
    const-string v1, "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED"

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :pswitch_15
    const-string v1, "ERROR_CODE_PARSING_MANIFEST_MALFORMED"

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :pswitch_16
    const-string v1, "ERROR_CODE_PARSING_CONTAINER_MALFORMED"

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :pswitch_17
    const-string v1, "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE"

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :pswitch_18
    const-string v1, "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED"

    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :pswitch_19
    const-string v1, "ERROR_CODE_IO_NO_PERMISSION"

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :pswitch_1a
    const-string v1, "ERROR_CODE_IO_FILE_NOT_FOUND"

    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :pswitch_1b
    const-string v1, "ERROR_CODE_IO_BAD_HTTP_STATUS"

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :pswitch_1c
    const-string v1, "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE"

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :pswitch_1d
    const-string v1, "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT"

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :pswitch_1e
    const-string v1, "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED"

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :pswitch_1f
    const-string v1, "ERROR_CODE_IO_UNSPECIFIED"

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :pswitch_20
    const-string v1, "ERROR_CODE_FAILED_RUNTIME_CHECK"

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :pswitch_21
    const-string v1, "ERROR_CODE_TIMEOUT"

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :pswitch_22
    const-string v1, "ERROR_CODE_BEHIND_LIVE_WINDOW"

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :pswitch_23
    const-string v1, "ERROR_CODE_REMOTE_ERROR"

    .line 197
    .line 198
    goto :goto_0

    .line 199
    :pswitch_24
    const-string v1, "ERROR_CODE_UNSPECIFIED"

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :pswitch_25
    const-string v1, "ERROR_CODE_AUTHENTICATION_EXPIRED"

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :pswitch_26
    const-string v1, "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED"

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :pswitch_27
    const-string v1, "ERROR_CODE_CONCURRENT_STREAM_LIMIT"

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :pswitch_28
    const-string v1, "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED"

    .line 212
    .line 213
    goto :goto_0

    .line 214
    :pswitch_29
    const-string v1, "ERROR_CODE_NOT_AVAILABLE_IN_REGION"

    .line 215
    .line 216
    goto :goto_0

    .line 217
    :pswitch_2a
    const-string v1, "ERROR_CODE_SKIP_LIMIT_REACHED"

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :pswitch_2b
    const-string v1, "ERROR_CODE_SETUP_REQUIRED"

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :pswitch_2c
    const-string v1, "ERROR_CODE_END_OF_PLAYLIST"

    .line 224
    .line 225
    goto :goto_0

    .line 226
    :pswitch_2d
    const-string v1, "ERROR_CODE_CONTENT_ALREADY_PLAYING"

    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_1
    const-string v1, "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED"

    .line 230
    .line 231
    goto :goto_0

    .line 232
    :cond_2
    const-string v1, "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED"

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_3
    const-string v1, "ERROR_CODE_INVALID_STATE"

    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_4
    const-string v1, "ERROR_CODE_BAD_VALUE"

    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_5
    const-string v1, "ERROR_CODE_PERMISSION_DENIED"

    .line 242
    .line 243
    goto :goto_0

    .line 244
    :cond_6
    const-string v1, "ERROR_CODE_NOT_SUPPORTED"

    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_7
    const-string v1, "ERROR_CODE_DISCONNECTED"

    .line 248
    .line 249
    :goto_0
    const-string v2, "onPlayerError: "

    .line 250
    .line 251
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    const-string v2, "BaseMediaService"

    .line 256
    .line 257
    invoke-static {v2, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 258
    .line 259
    .line 260
    packed-switch v0, :pswitch_data_7

    .line 261
    .line 262
    .line 263
    goto :goto_1

    .line 264
    :pswitch_2e
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 265
    .line 266
    .line 267
    move-result-wide v0

    .line 268
    iget-object p1, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 269
    .line 270
    iget-wide v2, p1, Lcom/eddyizm/tempus/service/MediaService;->O:J

    .line 271
    .line 272
    sub-long v2, v0, v2

    .line 273
    .line 274
    iget-wide v4, p1, Lcom/eddyizm/tempus/service/MediaService;->P:J

    .line 275
    .line 276
    cmp-long v2, v2, v4

    .line 277
    .line 278
    if-ltz v2, :cond_8

    .line 279
    .line 280
    iput-wide v0, p1, Lcom/eddyizm/tempus/service/MediaService;->O:J

    .line 281
    .line 282
    iget-object p0, p0, Laq;->o:Lqi3;

    .line 283
    .line 284
    invoke-interface {p0}, Lqi3;->b()V

    .line 285
    .line 286
    .line 287
    :cond_8
    :goto_1
    return-void

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch -0x6e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    :pswitch_data_1
    .packed-switch 0x3e8
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
    .end packed-switch

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    :pswitch_data_2
    .packed-switch 0x7d0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    :pswitch_data_3
    .packed-switch 0xbb9
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    :pswitch_data_4
    .packed-switch 0xfa1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

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
    :pswitch_data_5
    .packed-switch 0x1389
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

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
    :pswitch_data_6
    .packed-switch 0x1770
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

    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    :pswitch_data_7
    .packed-switch 0x7d0
        :pswitch_2e
        :pswitch_2e
        :pswitch_2e
    .end packed-switch
.end method

.method public final V(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/eddyizm/tempus/service/MediaService;->F:Lg5;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/eddyizm/tempus/service/MediaService;->B:Landroid/os/Handler;

    .line 6
    .line 7
    iget-object p0, p0, Laq;->o:Lqi3;

    .line 8
    .line 9
    invoke-interface {p0}, Lqi3;->o0()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    new-instance v4, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v5, "onIsPlayingChanged "

    .line 16
    .line 17
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "BaseMediaService"

    .line 28
    .line 29
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    invoke-interface {p0}, Lqi3;->a()Lgn2;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {p0}, Lqi3;->M0()J

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    invoke-static {v4, v5, v6}, Lbo2;->n(Lgn2;J)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p0}, Lqi3;->a()Lgn2;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    iget-object v7, v4, Lgn2;->a:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    new-instance v6, Lvs3;

    .line 57
    .line 58
    invoke-direct {v6}, Lvs3;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0}, Lqi3;->M0()J

    .line 62
    .line 63
    .line 64
    move-result-wide v8

    .line 65
    sget-object v4, Lvs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 66
    .line 67
    new-instance v5, Lss3;

    .line 68
    .line 69
    const/4 v10, 0x1

    .line 70
    invoke-direct/range {v5 .. v10}, Lss3;-><init>(Lvs3;Ljava/lang/String;JI)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-interface {p0}, Lqi3;->a()Lgn2;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v4, v3}, Lbo2;->m(Lgn2;Z)V

    .line 82
    .line 83
    .line 84
    :cond_1
    :goto_0
    iget-boolean v4, v0, Lcom/eddyizm/tempus/service/MediaService;->C:Z

    .line 85
    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    const-wide/16 v3, 0x3e8

    .line 92
    .line 93
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 94
    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    iput-boolean p1, v0, Lcom/eddyizm/tempus/service/MediaService;->C:Z

    .line 98
    .line 99
    :goto_1
    invoke-static {v0}, Lcom/eddyizm/tempus/service/MediaService;->m(Lcom/eddyizm/tempus/service/MediaService;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    if-nez v4, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 107
    .line 108
    .line 109
    iput-boolean v3, v0, Lcom/eddyizm/tempus/service/MediaService;->C:Z

    .line 110
    .line 111
    :goto_2
    invoke-virtual {v0}, Lcom/eddyizm/tempus/service/MediaService;->t()V

    .line 112
    .line 113
    .line 114
    :goto_3
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/service/MediaService;->w(Lqi3;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final b(I)V
    .locals 2

    .line 1
    const-string v0, "BaseMediaService"

    .line 2
    .line 3
    const-string v1, "onAudioSessionIdChanged"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/eddyizm/tempus/service/MediaService;->A:Lwo0;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lwo0;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lv11;

    .line 17
    .line 18
    iget-object v0, v0, Lwo0;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v0, p1}, Lv11;->f(Landroid/content/Context;I)Z

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroid/content/Intent;

    .line 33
    .line 34
    const-string v0, "com.eddyizm.tempus.service.EQUALIZER_UPDATED"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    const-string p0, "equalizerManager"

    .line 44
    .line 45
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    throw p0
.end method

.method public final f(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lud3;->t0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final h(Lqv2;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lqv2;->a:[Lpv2;

    .line 5
    .line 6
    iget-object v0, p0, Laq;->o:Lqi3;

    .line 7
    .line 8
    invoke-interface {v0}, Lqi3;->a()Lgn2;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_b

    .line 15
    .line 16
    :cond_0
    iget-object v2, v1, Lgn2;->d:Ldo2;

    .line 17
    .line 18
    iget-object v3, v2, Ldo2;->I:Landroid/os/Bundle;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    const-string v5, "type"

    .line 24
    .line 25
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v5, v4

    .line 31
    :goto_0
    const-string v6, "radio"

    .line 32
    .line 33
    invoke-static {v5, v6}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-nez v5, :cond_2

    .line 38
    .line 39
    goto/16 :goto_b

    .line 40
    .line 41
    :cond_2
    array-length v5, p1

    .line 42
    const/4 v6, 0x0

    .line 43
    move-object v8, v4

    .line 44
    move-object v9, v8

    .line 45
    move v7, v6

    .line 46
    :goto_1
    const-string v10, " - "

    .line 47
    .line 48
    if-ge v7, v5, :cond_f

    .line 49
    .line 50
    aget-object v11, p1, v7

    .line 51
    .line 52
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    instance-of v12, v11, Ljv1;

    .line 56
    .line 57
    if-eqz v12, :cond_5

    .line 58
    .line 59
    check-cast v11, Ljv1;

    .line 60
    .line 61
    iget-object v11, v11, Ljv1;->b:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v11, :cond_e

    .line 64
    .line 65
    filled-new-array {v10}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    const/4 v10, 0x2

    .line 70
    invoke-static {v11, v9, v10}, Lqm4;->C0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    if-ne v12, v10, :cond_4

    .line 79
    .line 80
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v8}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-nez v10, :cond_3

    .line 99
    .line 100
    move-object v8, v4

    .line 101
    :cond_3
    const/4 v10, 0x1

    .line 102
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    check-cast v9, Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v9}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    if-nez v10, :cond_e

    .line 121
    .line 122
    :goto_2
    move-object v9, v4

    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :cond_4
    invoke-static {v11}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-nez v10, :cond_e

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    instance-of v10, v11, Lds4;

    .line 141
    .line 142
    if-eqz v10, :cond_9

    .line 143
    .line 144
    check-cast v11, Lds4;

    .line 145
    .line 146
    iget-object v10, v11, Lds4;->c:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v11, v11, Lnv1;->a:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    const v13, 0x274b93

    .line 158
    .line 159
    .line 160
    if-eq v12, v13, :cond_7

    .line 161
    .line 162
    const v13, 0x276408

    .line 163
    .line 164
    .line 165
    if-eq v12, v13, :cond_6

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_6
    const-string v12, "TPE1"

    .line 169
    .line 170
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    if-eqz v11, :cond_e

    .line 175
    .line 176
    invoke-static {v10}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    if-nez v11, :cond_e

    .line 181
    .line 182
    :goto_3
    move-object v8, v10

    .line 183
    goto :goto_5

    .line 184
    :cond_7
    const-string v12, "TIT2"

    .line 185
    .line 186
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    if-nez v11, :cond_8

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_8
    invoke-static {v10}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    if-nez v11, :cond_e

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_9
    instance-of v10, v11, Lr85;

    .line 201
    .line 202
    if-eqz v10, :cond_e

    .line 203
    .line 204
    check-cast v11, Lr85;

    .line 205
    .line 206
    iget-object v10, v11, Lr85;->b:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object v11, v11, Lr85;->a:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 214
    .line 215
    .line 216
    move-result v12

    .line 217
    const v13, 0x4c22a38

    .line 218
    .line 219
    .line 220
    if-eq v12, v13, :cond_c

    .line 221
    .line 222
    const v13, 0x7395d347

    .line 223
    .line 224
    .line 225
    if-eq v12, v13, :cond_a

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_a
    const-string v12, "ARTIST"

    .line 229
    .line 230
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-nez v11, :cond_b

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_b
    invoke-static {v10}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    if-nez v11, :cond_e

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_c
    const-string v12, "TITLE"

    .line 245
    .line 246
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    if-nez v11, :cond_d

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_d
    invoke-static {v10}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    if-nez v11, :cond_e

    .line 258
    .line 259
    :goto_4
    move-object v9, v10

    .line 260
    :cond_e
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 261
    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :cond_f
    if-eqz v8, :cond_10

    .line 265
    .line 266
    invoke-static {v8}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-eqz p1, :cond_11

    .line 271
    .line 272
    :cond_10
    if-eqz v9, :cond_24

    .line 273
    .line 274
    invoke-static {v9}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    if-eqz p1, :cond_11

    .line 279
    .line 280
    goto/16 :goto_b

    .line 281
    .line 282
    :cond_11
    iget-object p0, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 283
    .line 284
    iget-object p1, p0, Lcom/eddyizm/tempus/service/MediaService;->M:Ljava/lang/String;

    .line 285
    .line 286
    invoke-static {v8, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    if-eqz p1, :cond_12

    .line 291
    .line 292
    iget-object p1, p0, Lcom/eddyizm/tempus/service/MediaService;->N:Ljava/lang/String;

    .line 293
    .line 294
    invoke-static {v9, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    if-eqz p1, :cond_12

    .line 299
    .line 300
    goto/16 :goto_b

    .line 301
    .line 302
    :cond_12
    iput-object v8, p0, Lcom/eddyizm/tempus/service/MediaService;->M:Ljava/lang/String;

    .line 303
    .line 304
    iput-object v9, p0, Lcom/eddyizm/tempus/service/MediaService;->N:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->t()V

    .line 307
    .line 308
    .line 309
    invoke-interface {v0}, Lqi3;->o0()I

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    const/4 v5, -0x1

    .line 314
    if-ne p1, v5, :cond_13

    .line 315
    .line 316
    goto/16 :goto_b

    .line 317
    .line 318
    :cond_13
    invoke-virtual {v2}, Ldo2;->a()Lco2;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    new-instance v6, Landroid/os/Bundle;

    .line 323
    .line 324
    if-nez v3, :cond_14

    .line 325
    .line 326
    new-instance v7, Landroid/os/Bundle;

    .line 327
    .line 328
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 329
    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_14
    move-object v7, v3

    .line 333
    :goto_6
    invoke-direct {v6, v7}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 334
    .line 335
    .line 336
    if-eqz v8, :cond_15

    .line 337
    .line 338
    const-string v7, "radioArtist"

    .line 339
    .line 340
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    :cond_15
    if-eqz v9, :cond_16

    .line 344
    .line 345
    const-string v7, "radioTitle"

    .line 346
    .line 347
    invoke-virtual {v6, v7, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_16
    const-string v7, "stationName"

    .line 351
    .line 352
    if-eqz v3, :cond_17

    .line 353
    .line 354
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    if-nez v3, :cond_19

    .line 359
    .line 360
    :cond_17
    iget-object v2, v2, Ldo2;->a:Ljava/lang/CharSequence;

    .line 361
    .line 362
    if-eqz v2, :cond_18

    .line 363
    .line 364
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    goto :goto_7

    .line 369
    :cond_18
    const-string v3, ""

    .line 370
    .line 371
    :cond_19
    :goto_7
    invoke-static {v3}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-nez v2, :cond_1a

    .line 376
    .line 377
    invoke-virtual {v6, v7, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :cond_1a
    if-eqz v8, :cond_1d

    .line 381
    .line 382
    invoke-static {v8}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_1b

    .line 387
    .line 388
    goto :goto_8

    .line 389
    :cond_1b
    if-eqz v9, :cond_1d

    .line 390
    .line 391
    invoke-static {v9}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    if-eqz v2, :cond_1c

    .line 396
    .line 397
    goto :goto_8

    .line 398
    :cond_1c
    new-instance v2, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    goto :goto_a

    .line 417
    :cond_1d
    :goto_8
    if-eqz v9, :cond_1f

    .line 418
    .line 419
    invoke-static {v9}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    if-eqz v2, :cond_1e

    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_1e
    move-object v8, v9

    .line 427
    goto :goto_a

    .line 428
    :cond_1f
    :goto_9
    if-eqz v8, :cond_20

    .line 429
    .line 430
    invoke-static {v8}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_21

    .line 435
    .line 436
    :cond_20
    move-object v8, v3

    .line 437
    :cond_21
    :goto_a
    iput-object v8, v5, Lco2;->a:Ljava/lang/CharSequence;

    .line 438
    .line 439
    invoke-static {v3}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    if-nez v2, :cond_22

    .line 444
    .line 445
    iput-object v3, v5, Lco2;->b:Ljava/lang/CharSequence;

    .line 446
    .line 447
    :cond_22
    instance-of v2, v0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 448
    .line 449
    if-eqz v2, :cond_23

    .line 450
    .line 451
    move-object v4, v0

    .line 452
    check-cast v4, Landroidx/media3/exoplayer/ExoPlayer;

    .line 453
    .line 454
    :cond_23
    if-eqz v4, :cond_24

    .line 455
    .line 456
    invoke-virtual {v1}, Lgn2;->a()Ltm2;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    iput-object v6, v5, Lco2;->H:Landroid/os/Bundle;

    .line 461
    .line 462
    new-instance v1, Ldo2;

    .line 463
    .line 464
    invoke-direct {v1, v5}, Ldo2;-><init>(Lco2;)V

    .line 465
    .line 466
    .line 467
    iput-object v1, v0, Ltm2;->k:Ldo2;

    .line 468
    .line 469
    invoke-virtual {v0}, Ltm2;->a()Lgn2;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    move-object v1, v4

    .line 474
    check-cast v1, Lfq;

    .line 475
    .line 476
    invoke-virtual {v1, p1, v0}, Lfq;->z0(ILgn2;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {p0, v4}, Lcom/eddyizm/tempus/service/MediaService;->w(Lqi3;)V

    .line 480
    .line 481
    .line 482
    :cond_24
    :goto_b
    return-void
.end method

.method public final k(Lpi3;Lpi3;I)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p1, Lpi3;->b:I

    .line 8
    .line 9
    iget v1, p2, Lpi3;->b:I

    .line 10
    .line 11
    const-string v2, " old="

    .line 12
    .line 13
    const-string v3, " new="

    .line 14
    .line 15
    const-string v4, "onPositionDiscontinuity reason="

    .line 16
    .line 17
    invoke-static {v4, v2, p3, v0, v3}, Lb11;->t(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "BaseMediaService"

    .line 29
    .line 30
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    iget v0, p1, Lpi3;->b:I

    .line 34
    .line 35
    iget v1, p2, Lpi3;->b:I

    .line 36
    .line 37
    if-eq v0, v1, :cond_0

    .line 38
    .line 39
    if-eqz p3, :cond_0

    .line 40
    .line 41
    iget-object v0, p1, Lpi3;->c:Lgn2;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-wide v1, p1, Lpi3;->f:J

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Lbo2;->n(Lgn2;J)V

    .line 48
    .line 49
    .line 50
    :cond_0
    const/4 v0, 0x0

    .line 51
    if-eqz p3, :cond_1

    .line 52
    .line 53
    iget v1, p1, Lpi3;->b:I

    .line 54
    .line 55
    iget v2, p2, Lpi3;->b:I

    .line 56
    .line 57
    if-ne v1, v2, :cond_1

    .line 58
    .line 59
    sget-object v1, Ljz3;->e:Liz3;

    .line 60
    .line 61
    iput-boolean v0, v1, Liz3;->l:Z

    .line 62
    .line 63
    iget-object p0, p0, Laq;->o:Lqi3;

    .line 64
    .line 65
    invoke-static {p0}, Ljz3;->i(Lqi3;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    const/4 p0, 0x1

    .line 69
    const-string v1, "music"

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    const-string v3, "type"

    .line 73
    .line 74
    if-nez p3, :cond_5

    .line 75
    .line 76
    iget-object p3, p1, Lpi3;->c:Lgn2;

    .line 77
    .line 78
    if-eqz p3, :cond_2

    .line 79
    .line 80
    iget-object p3, p3, Lgn2;->d:Ldo2;

    .line 81
    .line 82
    if-eqz p3, :cond_2

    .line 83
    .line 84
    iget-object p3, p3, Ldo2;->I:Landroid/os/Bundle;

    .line 85
    .line 86
    if-eqz p3, :cond_2

    .line 87
    .line 88
    invoke-virtual {p3, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    move-object p3, v2

    .line 94
    :goto_0
    invoke-static {p3, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    if-eqz p3, :cond_3

    .line 99
    .line 100
    iget-object p3, p1, Lpi3;->c:Lgn2;

    .line 101
    .line 102
    invoke-static {p3, p0}, Lbo2;->m(Lgn2;Z)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p1, Lpi3;->c:Lgn2;

    .line 106
    .line 107
    invoke-static {p0}, Lbo2;->l(Lgn2;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    iget-object p0, p1, Lpi3;->c:Lgn2;

    .line 111
    .line 112
    invoke-static {p0}, Lbo2;->d(Lgn2;)V

    .line 113
    .line 114
    .line 115
    iget-object p0, p2, Lpi3;->c:Lgn2;

    .line 116
    .line 117
    if-eqz p0, :cond_4

    .line 118
    .line 119
    iget-object p0, p0, Lgn2;->d:Ldo2;

    .line 120
    .line 121
    if-eqz p0, :cond_4

    .line 122
    .line 123
    iget-object p0, p0, Ldo2;->I:Landroid/os/Bundle;

    .line 124
    .line 125
    if-eqz p0, :cond_4

    .line 126
    .line 127
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :cond_4
    invoke-static {v2, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_9

    .line 136
    .line 137
    iget-object p0, p2, Lpi3;->c:Lgn2;

    .line 138
    .line 139
    if-eqz p0, :cond_9

    .line 140
    .line 141
    new-instance p1, Lvs3;

    .line 142
    .line 143
    invoke-direct {p1}, Lvs3;-><init>()V

    .line 144
    .line 145
    .line 146
    iget-object p0, p0, Lgn2;->a:Ljava/lang/String;

    .line 147
    .line 148
    sget-object p2, Lvs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 149
    .line 150
    new-instance p3, Lur2;

    .line 151
    .line 152
    const/16 v0, 0xe

    .line 153
    .line 154
    invoke-direct {p3, v0, p1, p0}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_5
    if-ne p3, p0, :cond_9

    .line 162
    .line 163
    iget p3, p1, Lpi3;->b:I

    .line 164
    .line 165
    iget p2, p2, Lpi3;->b:I

    .line 166
    .line 167
    if-eq p3, p2, :cond_9

    .line 168
    .line 169
    iget-object p2, p1, Lpi3;->c:Lgn2;

    .line 170
    .line 171
    if-eqz p2, :cond_6

    .line 172
    .line 173
    iget-object p2, p2, Lgn2;->d:Ldo2;

    .line 174
    .line 175
    if-eqz p2, :cond_6

    .line 176
    .line 177
    iget-object p2, p2, Ldo2;->I:Landroid/os/Bundle;

    .line 178
    .line 179
    if-eqz p2, :cond_6

    .line 180
    .line 181
    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    :cond_6
    invoke-static {v2, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-eqz p2, :cond_9

    .line 190
    .line 191
    iget-object p2, p1, Lpi3;->c:Lgn2;

    .line 192
    .line 193
    if-eqz p2, :cond_7

    .line 194
    .line 195
    iget-object p2, p2, Lgn2;->d:Ldo2;

    .line 196
    .line 197
    if-eqz p2, :cond_7

    .line 198
    .line 199
    iget-object p2, p2, Ldo2;->I:Landroid/os/Bundle;

    .line 200
    .line 201
    if-eqz p2, :cond_7

    .line 202
    .line 203
    const-string p3, "duration"

    .line 204
    .line 205
    invoke-virtual {p2, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    :cond_7
    int-to-long p2, v0

    .line 210
    const-wide/16 v0, 0x3e8

    .line 211
    .line 212
    mul-long/2addr p2, v0

    .line 213
    iget-wide v0, p1, Lpi3;->f:J

    .line 214
    .line 215
    sget-object v2, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 216
    .line 217
    const-wide/16 v2, 0x7530

    .line 218
    .line 219
    cmp-long v2, p2, v2

    .line 220
    .line 221
    if-gtz v2, :cond_8

    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_8
    const-wide/16 v2, 0x2

    .line 225
    .line 226
    div-long/2addr p2, v2

    .line 227
    const-wide/32 v2, 0x3a980

    .line 228
    .line 229
    .line 230
    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 231
    .line 232
    .line 233
    move-result-wide p2

    .line 234
    cmp-long p2, v0, p2

    .line 235
    .line 236
    if-ltz p2, :cond_9

    .line 237
    .line 238
    iget-object p2, p1, Lpi3;->c:Lgn2;

    .line 239
    .line 240
    invoke-static {p2, p0}, Lbo2;->m(Lgn2;Z)V

    .line 241
    .line 242
    .line 243
    iget-object p0, p1, Lpi3;->c:Lgn2;

    .line 244
    .line 245
    invoke-static {p0}, Lbo2;->l(Lgn2;)V

    .line 246
    .line 247
    .line 248
    :cond_9
    :goto_1
    return-void
.end method

.method public final q(Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lrs3;->a:Lrs3;

    .line 4
    .line 5
    iget-object v0, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 6
    .line 7
    iget-object p0, p0, Laq;->o:Lqi3;

    .line 8
    .line 9
    invoke-virtual {p1, v0, p0}, Lrs3;->c(Landroid/content/Context;Lqi3;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final t(ILgn2;)V
    .locals 11

    .line 1
    iget-object v0, p0, Laq;->o:Lqi3;

    .line 2
    .line 3
    invoke-interface {v0}, Lqi3;->o0()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "onMediaItemTransition"

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "BaseMediaService"

    .line 22
    .line 23
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Laq;->o:Lqi3;

    .line 30
    .line 31
    sget-object v1, Ljz3;->e:Liz3;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    iput-boolean v2, v1, Liz3;->l:Z

    .line 35
    .line 36
    iget-object v2, p2, Lgn2;->a:Ljava/lang/String;

    .line 37
    .line 38
    const-string v3, "ReplayGainUtil"

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    const-string v0, "applyGain: null mediaItem or mediaId, skipping"

    .line 43
    .line 44
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_1
    invoke-static {p2}, Ljz3;->d(Lgn2;)Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v4, " totalGain="

    .line 54
    .line 55
    const-string v5, " peak="

    .line 56
    .line 57
    const-string v6, " gain="

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-static {v2}, Ljz3;->o(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v7, Ljz3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    iget-object v8, p2, Lgn2;->a:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v7, v8, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object v7, Ljz3;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 73
    .line 74
    iget-object v8, p2, Lgn2;->a:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v7, v8}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v2}, Ljz3;->k(Lqi3;Ljava/util/List;)F

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-static {v0, v2}, Ljz3;->l(Lqi3;Ljava/util/List;)F

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-static {v7, v2}, Ljz3;->c(FF)F

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    new-instance v9, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v10, "applyGain: server RG for "

    .line 94
    .line 95
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object v10, p2, Lgn2;->a:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v8}, Liz3;->n(F)V

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, Ljz3;->h(Lqi3;)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_1

    .line 135
    .line 136
    :cond_2
    sget-object v2, Ljz3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 137
    .line 138
    iget-object v7, p2, Lgn2;->a:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v2, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Ljava/util/List;

    .line 145
    .line 146
    if-eqz v2, :cond_4

    .line 147
    .line 148
    invoke-static {v0, v2}, Ljz3;->k(Lqi3;Ljava/util/List;)F

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    const/4 v8, 0x0

    .line 153
    cmpl-float v9, v7, v8

    .line 154
    .line 155
    if-eqz v9, :cond_3

    .line 156
    .line 157
    invoke-static {v0, v2}, Ljz3;->l(Lqi3;Ljava/util/List;)F

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    invoke-static {v7, v2}, Ljz3;->c(FF)F

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    new-instance v9, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v10, "applyGain: tag cache hit for "

    .line 168
    .line 169
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-object v10, p2, Lgn2;->a:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v8}, Liz3;->n(F)V

    .line 203
    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_3
    invoke-static {v8, v8}, Ljz3;->c(FF)F

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    new-instance v4, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v5, "applyGain: cache hit but gain=0 for "

    .line 213
    .line 214
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iget-object v5, p2, Lgn2;->a:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string v5, ", applying preamp-only totalGain="

    .line 223
    .line 224
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, v2}, Liz3;->n(F)V

    .line 238
    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v2, "applyGain: cache miss for "

    .line 244
    .line 245
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget-object v2, p2, Lgn2;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v2, ", holding current gain until onTracksChanged"

    .line 254
    .line 255
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    :goto_0
    invoke-static {v0}, Ljz3;->h(Lqi3;)V

    .line 266
    .line 267
    .line 268
    :goto_1
    iget-object v0, p2, Lgn2;->d:Ldo2;

    .line 269
    .line 270
    iget-object v0, v0, Ldo2;->I:Landroid/os/Bundle;

    .line 271
    .line 272
    const-string v1, "aa_start_index"

    .line 273
    .line 274
    const/4 v2, -0x1

    .line 275
    if-eqz v0, :cond_5

    .line 276
    .line 277
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    goto :goto_2

    .line 282
    :cond_5
    move v3, v2

    .line 283
    :goto_2
    if-ltz v3, :cond_7

    .line 284
    .line 285
    new-instance v4, Landroid/os/Bundle;

    .line 286
    .line 287
    invoke-direct {v4, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    iget-object v0, p2, Lgn2;->d:Ldo2;

    .line 294
    .line 295
    invoke-virtual {v0}, Ldo2;->a()Lco2;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iput-object v4, v0, Lco2;->H:Landroid/os/Bundle;

    .line 300
    .line 301
    new-instance v1, Ldo2;

    .line 302
    .line 303
    invoke-direct {v1, v0}, Ldo2;-><init>(Lco2;)V

    .line 304
    .line 305
    .line 306
    iget-object v0, p0, Laq;->o:Lqi3;

    .line 307
    .line 308
    invoke-interface {v0}, Lqi3;->o0()I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    iget-object v4, p0, Laq;->o:Lqi3;

    .line 313
    .line 314
    instance-of v5, v4, Landroidx/media3/exoplayer/ExoPlayer;

    .line 315
    .line 316
    if-eqz v5, :cond_6

    .line 317
    .line 318
    if-eq v0, v2, :cond_6

    .line 319
    .line 320
    check-cast v4, Landroidx/media3/exoplayer/ExoPlayer;

    .line 321
    .line 322
    invoke-virtual {p2}, Lgn2;->a()Ltm2;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    iput-object v1, v2, Ltm2;->k:Ldo2;

    .line 327
    .line 328
    invoke-virtual {v2}, Ltm2;->a()Lgn2;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    check-cast v4, Lfq;

    .line 333
    .line 334
    invoke-virtual {v4, v0, v1}, Lfq;->z0(ILgn2;)V

    .line 335
    .line 336
    .line 337
    :cond_6
    if-ltz v3, :cond_7

    .line 338
    .line 339
    iget-object v1, p0, Laq;->o:Lqi3;

    .line 340
    .line 341
    invoke-interface {v1}, Lqi3;->Q0()I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-ge v3, v1, :cond_7

    .line 346
    .line 347
    if-eq v3, v0, :cond_7

    .line 348
    .line 349
    iget-object v0, p0, Laq;->o:Lqi3;

    .line 350
    .line 351
    const-wide/16 v1, 0x0

    .line 352
    .line 353
    invoke-interface {v0, v3, v1, v2}, Lqi3;->n(IJ)V

    .line 354
    .line 355
    .line 356
    :cond_7
    const/4 v0, 0x1

    .line 357
    if-eq p1, v0, :cond_8

    .line 358
    .line 359
    const/4 v1, 0x2

    .line 360
    if-eq p1, v1, :cond_8

    .line 361
    .line 362
    goto :goto_3

    .line 363
    :cond_8
    sget-object v1, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 364
    .line 365
    new-instance v1, Lvs3;

    .line 366
    .line 367
    invoke-direct {v1}, Lvs3;-><init>()V

    .line 368
    .line 369
    .line 370
    iget-object v2, p2, Lgn2;->a:Ljava/lang/String;

    .line 371
    .line 372
    sget-object v3, Lvs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 373
    .line 374
    new-instance v4, Lur2;

    .line 375
    .line 376
    const/16 v5, 0xe

    .line 377
    .line 378
    invoke-direct {v4, v5, v1, v2}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 382
    .line 383
    .line 384
    :goto_3
    if-ne p1, v0, :cond_9

    .line 385
    .line 386
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    iget-boolean p1, p1, Lyf4;->g:Z

    .line 391
    .line 392
    if-eqz p1, :cond_9

    .line 393
    .line 394
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-virtual {p1}, Lyf4;->f()V

    .line 399
    .line 400
    .line 401
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    invoke-virtual {p1, v0}, Lyf4;->a(Z)V

    .line 406
    .line 407
    .line 408
    iget-object p1, p0, Laq;->o:Lqi3;

    .line 409
    .line 410
    const/high16 v0, 0x3f800000    # 1.0f

    .line 411
    .line 412
    invoke-interface {p1, v0}, Lqi3;->R(F)V

    .line 413
    .line 414
    .line 415
    iget-object p1, p0, Laq;->o:Lqi3;

    .line 416
    .line 417
    invoke-interface {p1}, Lqi3;->c()V

    .line 418
    .line 419
    .line 420
    :cond_9
    iget-object p1, p2, Lgn2;->d:Ldo2;

    .line 421
    .line 422
    iget-object p1, p1, Ldo2;->I:Landroid/os/Bundle;

    .line 423
    .line 424
    if-eqz p1, :cond_a

    .line 425
    .line 426
    const-string p2, "type"

    .line 427
    .line 428
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    goto :goto_4

    .line 433
    :cond_a
    const/4 p1, 0x0

    .line 434
    :goto_4
    const-string p2, "radio"

    .line 435
    .line 436
    invoke-static {p1, p2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-eqz v0, :cond_b

    .line 441
    .line 442
    iget-object v0, p0, Laq;->o:Lqi3;

    .line 443
    .line 444
    invoke-interface {v0}, Lqi3;->h0()Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-eqz v0, :cond_b

    .line 449
    .line 450
    iget-object p1, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 451
    .line 452
    invoke-virtual {p1}, Lcom/eddyizm/tempus/service/MediaService;->t()V

    .line 453
    .line 454
    .line 455
    iget-object p1, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 456
    .line 457
    invoke-static {p1}, Lcom/eddyizm/tempus/service/MediaService;->m(Lcom/eddyizm/tempus/service/MediaService;)V

    .line 458
    .line 459
    .line 460
    goto :goto_5

    .line 461
    :cond_b
    invoke-static {p1, p2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result p1

    .line 465
    if-nez p1, :cond_c

    .line 466
    .line 467
    iget-object p1, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 468
    .line 469
    invoke-virtual {p1}, Lcom/eddyizm/tempus/service/MediaService;->t()V

    .line 470
    .line 471
    .line 472
    :cond_c
    :goto_5
    iget-object p1, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 473
    .line 474
    iget-object p2, p0, Laq;->o:Lqi3;

    .line 475
    .line 476
    invoke-virtual {p1, p2}, Lcom/eddyizm/tempus/service/MediaService;->w(Lqi3;)V

    .line 477
    .line 478
    .line 479
    sget-object p1, Lrs3;->a:Lrs3;

    .line 480
    .line 481
    iget-object p2, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 482
    .line 483
    iget-object p0, p0, Laq;->o:Lqi3;

    .line 484
    .line 485
    invoke-virtual {p1, p2, p0}, Lrs3;->c(Landroid/content/Context;Lqi3;)V

    .line 486
    .line 487
    .line 488
    return-void
.end method

.method public final v(I)V
    .locals 2

    .line 1
    const-string v0, "BaseMediaService"

    .line 2
    .line 3
    const-string v1, "onPlaybackStateChanged"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Laq;->o:Lqi3;

    .line 9
    .line 10
    invoke-interface {v0}, Lqi3;->f0()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    if-ne p1, v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Lqi3;->K0()Ldo2;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p1, p1, Ldo2;->I:Landroid/os/Bundle;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const-string v1, "type"

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    :goto_0
    const-string v1, "music"

    .line 36
    .line 37
    invoke-static {p1, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Lqi3;->a()Lgn2;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-static {p1, v1}, Lbo2;->m(Lgn2;Z)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Lqi3;->a()Lgn2;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lbo2;->l(Lgn2;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Lqi3;->a()Lgn2;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lbo2;->d(Lgn2;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object p0, p0, Laq;->n:Lcom/eddyizm/tempus/service/MediaService;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/service/MediaService;->w(Lqi3;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final x(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lud3;->x0(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
