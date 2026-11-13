.class public final Ldefpackage/yk;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ak2;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public p:Z

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;

.field public t:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ldefpackage/yk;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v0, Ldefpackage/oi;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, Ldefpackage/yd4;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Ldefpackage/ck2;Ldefpackage/ns3;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/yk;->n:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 25
    new-instance p1, Ldefpackage/cl;

    invoke-direct {p1, p2}, Ldefpackage/cl;-><init>(Landroid/os/HandlerThread;)V

    iput-object p1, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 26
    iput-object p3, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 27
    iput-object p4, p0, Ldefpackage/yk;->t:Ljava/lang/Object;

    .line 28
    iput v0, p0, Ldefpackage/yk;->o:I

    return-void
.end method

.method public constructor <init>(Ldefpackage/w12;Ldefpackage/cx2;ILdefpackage/q03;Ldefpackage/q03;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/yk;->n:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/yk;->t:Ljava/lang/Object;

    .line 30
    iput-object p2, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 31
    iput p3, p0, Ldefpackage/yk;->o:I

    .line 32
    iput-object p4, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 33
    iput-object p5, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 34
    iput-boolean p6, p0, Ldefpackage/yk;->p:Z

    return-void
.end method

.method public static b(Ldefpackage/yk;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/cl;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/media/MediaCodec;

    .line 8
    .line 9
    iget-object v2, v0, Ldefpackage/cl;->b:Landroid/os/HandlerThread;

    .line 10
    .line 11
    iget-object v3, v0, Ldefpackage/cl;->c:Landroid/os/Handler;

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v3, 0x0

    .line 19
    :goto_0
    invoke-static {v3}, Ldefpackage/rr2;->w(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v3, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0, v3}, Landroid/media/MediaCodec;->setCallback(Landroid/media/MediaCodec$Callback;Landroid/os/Handler;)V

    .line 35
    .line 36
    .line 37
    iput-object v3, v0, Ldefpackage/cl;->c:Landroid/os/Handler;

    .line 38
    .line 39
    const-string v0, "configureCodec"

    .line 40
    .line 41
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ldefpackage/ck2;

    .line 53
    .line 54
    invoke-interface {p1}, Ldefpackage/ck2;->start()V

    .line 55
    .line 56
    .line 57
    const-string p1, "startCodec"

    .line 58
    .line 59
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 66
    .line 67
    .line 68
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 p2, 0x23

    .line 71
    .line 72
    if-lt p1, p2, :cond_2

    .line 73
    .line 74
    iget-object p1, p0, Ldefpackage/yk;->t:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Ldefpackage/ns3;

    .line 77
    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    iget-object p2, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Landroid/media/LoudnessCodecController;

    .line 83
    .line 84
    if-eqz p2, :cond_1

    .line 85
    .line 86
    invoke-static {p2, v1}, Ldefpackage/vk;->i(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-nez p2, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    iget-object p1, p1, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Ljava/util/HashSet;

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {p1}, Ldefpackage/rr2;->w(Z)V

    .line 102
    .line 103
    .line 104
    :cond_2
    :goto_1
    iput v4, p0, Ldefpackage/yk;->o:I

    .line 105
    .line 106
    return-void
.end method

.method public static o(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    if-ne p0, p1, :cond_0

    .line 8
    .line 9
    const-string p0, "Audio"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x2

    .line 16
    if-ne p0, p1, :cond_1

    .line 17
    .line 18
    const-string p0, "Video"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string p1, "Unknown("

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, ")"

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/yk;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iput-boolean v1, p0, Ldefpackage/yk;->p:Z

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v2, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ldefpackage/oi;

    .line 17
    .line 18
    invoke-virtual {v2}, Ldefpackage/oi;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ldefpackage/oi;

    .line 28
    .line 29
    invoke-virtual {v2}, Ldefpackage/yd4;->clear()V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Ldefpackage/sl2;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    iget-object v2, p0, Ldefpackage/yk;->t:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Ldefpackage/sl2;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    iput-object v2, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object v2, p0, Ldefpackage/yk;->t:Ljava/lang/Object;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto :goto_2

    .line 60
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    const/4 v0, 0x0

    .line 66
    :goto_1
    if-ge v0, p0, :cond_1

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    check-cast v2, Ldefpackage/ea4;

    .line 75
    .line 76
    invoke-virtual {v2}, Ldefpackage/ea4;->q()V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    return-void

    .line 81
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw p0

    .line 83
    :pswitch_0
    const/16 v0, 0x21

    .line 84
    .line 85
    const/16 v2, 0x1e

    .line 86
    .line 87
    const/16 v3, 0x23

    .line 88
    .line 89
    :try_start_2
    iget v4, p0, Ldefpackage/yk;->o:I

    .line 90
    .line 91
    if-ne v4, v1, :cond_2

    .line 92
    .line 93
    iget-object v4, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v4, Ldefpackage/ck2;

    .line 96
    .line 97
    invoke-interface {v4}, Ldefpackage/ck2;->shutdown()V

    .line 98
    .line 99
    .line 100
    iget-object v4, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Ldefpackage/cl;

    .line 103
    .line 104
    iget-object v5, v4, Ldefpackage/cl;->a:Ljava/lang/Object;

    .line 105
    .line 106
    monitor-enter v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 107
    :try_start_3
    iput-boolean v1, v4, Ldefpackage/cl;->m:Z

    .line 108
    .line 109
    iget-object v6, v4, Ldefpackage/cl;->b:Landroid/os/HandlerThread;

    .line 110
    .line 111
    invoke-virtual {v6}, Landroid/os/HandlerThread;->quit()Z

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Ldefpackage/cl;->a()V

    .line 115
    .line 116
    .line 117
    monitor-exit v5

    .line 118
    goto :goto_3

    .line 119
    :catchall_1
    move-exception v4

    .line 120
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    :try_start_4
    throw v4

    .line 122
    :catchall_2
    move-exception v4

    .line 123
    goto :goto_7

    .line 124
    :cond_2
    :goto_3
    const/4 v4, 0x2

    .line 125
    iput v4, p0, Ldefpackage/yk;->o:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 126
    .line 127
    iget-boolean v4, p0, Ldefpackage/yk;->p:Z

    .line 128
    .line 129
    if-nez v4, :cond_6

    .line 130
    .line 131
    :try_start_5
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    if-lt v4, v2, :cond_3

    .line 134
    .line 135
    if-ge v4, v0, :cond_3

    .line 136
    .line 137
    iget-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Landroid/media/MediaCodec;

    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :catchall_3
    move-exception v0

    .line 146
    goto :goto_5

    .line 147
    :cond_3
    :goto_4
    if-lt v4, v3, :cond_4

    .line 148
    .line 149
    iget-object v0, p0, Ldefpackage/yk;->t:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Ldefpackage/ns3;

    .line 152
    .line 153
    if-eqz v0, :cond_4

    .line 154
    .line 155
    iget-object v2, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, Landroid/media/MediaCodec;

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Ldefpackage/ns3;->e(Landroid/media/MediaCodec;)V

    .line 160
    .line 161
    .line 162
    :cond_4
    iget-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Landroid/media/MediaCodec;

    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 167
    .line 168
    .line 169
    iput-boolean v1, p0, Ldefpackage/yk;->p:Z

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :goto_5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 173
    .line 174
    if-lt v2, v3, :cond_5

    .line 175
    .line 176
    iget-object v2, p0, Ldefpackage/yk;->t:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, Ldefpackage/ns3;

    .line 179
    .line 180
    if-eqz v2, :cond_5

    .line 181
    .line 182
    iget-object v3, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v3, Landroid/media/MediaCodec;

    .line 185
    .line 186
    invoke-virtual {v2, v3}, Ldefpackage/ns3;->e(Landroid/media/MediaCodec;)V

    .line 187
    .line 188
    .line 189
    :cond_5
    iget-object v2, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v2, Landroid/media/MediaCodec;

    .line 192
    .line 193
    invoke-virtual {v2}, Landroid/media/MediaCodec;->release()V

    .line 194
    .line 195
    .line 196
    iput-boolean v1, p0, Ldefpackage/yk;->p:Z

    .line 197
    .line 198
    throw v0

    .line 199
    :cond_6
    :goto_6
    return-void

    .line 200
    :goto_7
    iget-boolean v5, p0, Ldefpackage/yk;->p:Z

    .line 201
    .line 202
    if-nez v5, :cond_a

    .line 203
    .line 204
    :try_start_6
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 205
    .line 206
    if-lt v5, v2, :cond_7

    .line 207
    .line 208
    if-ge v5, v0, :cond_7

    .line 209
    .line 210
    iget-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Landroid/media/MediaCodec;

    .line 213
    .line 214
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 215
    .line 216
    .line 217
    goto :goto_8

    .line 218
    :catchall_4
    move-exception v0

    .line 219
    goto :goto_9

    .line 220
    :cond_7
    :goto_8
    if-lt v5, v3, :cond_8

    .line 221
    .line 222
    iget-object v0, p0, Ldefpackage/yk;->t:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Ldefpackage/ns3;

    .line 225
    .line 226
    if-eqz v0, :cond_8

    .line 227
    .line 228
    iget-object v2, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v2, Landroid/media/MediaCodec;

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Ldefpackage/ns3;->e(Landroid/media/MediaCodec;)V

    .line 233
    .line 234
    .line 235
    :cond_8
    iget-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Landroid/media/MediaCodec;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 240
    .line 241
    .line 242
    iput-boolean v1, p0, Ldefpackage/yk;->p:Z

    .line 243
    .line 244
    goto :goto_a

    .line 245
    :goto_9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 246
    .line 247
    if-lt v2, v3, :cond_9

    .line 248
    .line 249
    iget-object v2, p0, Ldefpackage/yk;->t:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v2, Ldefpackage/ns3;

    .line 252
    .line 253
    if-eqz v2, :cond_9

    .line 254
    .line 255
    iget-object v3, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v3, Landroid/media/MediaCodec;

    .line 258
    .line 259
    invoke-virtual {v2, v3}, Ldefpackage/ns3;->e(Landroid/media/MediaCodec;)V

    .line 260
    .line 261
    .line 262
    :cond_9
    iget-object v2, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v2, Landroid/media/MediaCodec;

    .line 265
    .line 266
    invoke-virtual {v2}, Landroid/media/MediaCodec;->release()V

    .line 267
    .line 268
    .line 269
    iput-boolean v1, p0, Ldefpackage/yk;->p:Z

    .line 270
    .line 271
    throw v0

    .line 272
    :cond_a
    :goto_a
    throw v4

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/ck2;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ldefpackage/ck2;->c(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(II)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/q03;

    .line 4
    .line 5
    iget v1, p0, Ldefpackage/yk;->o:I

    .line 6
    .line 7
    add-int/2addr v1, p1

    .line 8
    invoke-virtual {v0, v1}, Ldefpackage/q03;->f(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ldefpackage/bx2;

    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ldefpackage/q03;

    .line 17
    .line 18
    iget p0, p0, Ldefpackage/yk;->o:I

    .line 19
    .line 20
    add-int/2addr p0, p2

    .line 21
    invoke-virtual {v0, p0}, Ldefpackage/q03;->f(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ldefpackage/bx2;

    .line 26
    .line 27
    invoke-static {p1, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-ne p1, p0, :cond_1

    .line 43
    .line 44
    :goto_0
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    return p0
.end method

.method public e(ILdefpackage/fg0;JI)V
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Ldefpackage/ck2;

    .line 5
    .line 6
    move v1, p1

    .line 7
    move-object v2, p2

    .line 8
    move-wide v3, p3

    .line 9
    move v5, p5

    .line 10
    invoke-interface/range {v0 .. v5}, Ldefpackage/ck2;->e(ILdefpackage/fg0;JI)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public f(IIIJ)V
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Ldefpackage/ck2;

    .line 5
    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move v3, p3

    .line 9
    move-wide v4, p4

    .line 10
    invoke-interface/range {v0 .. v5}, Ldefpackage/ck2;->f(IIIJ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public flush()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ck2;

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/ck2;->flush()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/media/MediaCodec;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ldefpackage/cl;

    .line 18
    .line 19
    iget-object v1, v0, Ldefpackage/cl;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    iget-wide v2, v0, Ldefpackage/cl;->l:J

    .line 23
    .line 24
    const-wide/16 v4, 0x1

    .line 25
    .line 26
    add-long/2addr v2, v4

    .line 27
    iput-wide v2, v0, Ldefpackage/cl;->l:J

    .line 28
    .line 29
    iget-object v2, v0, Ldefpackage/cl;->c:Landroid/os/Handler;

    .line 30
    .line 31
    sget-object v3, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v3, Ldefpackage/a0;

    .line 34
    .line 35
    const/4 v4, 0x7

    .line 36
    invoke-direct {v3, v4, v0}, Ldefpackage/a0;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Landroid/media/MediaCodec;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/media/MediaCodec;->start()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw p0
.end method

.method public g(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public h()Landroid/media/MediaFormat;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/cl;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/cl;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object p0, p0, Ldefpackage/cl;->h:Landroid/media/MediaFormat;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method public i()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {p0}, Ldefpackage/vk;->g(Landroid/media/MediaCodec;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Ljava/lang/Object;)Ldefpackage/ea4;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/yk;->s()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    new-instance v2, Ldefpackage/ea4;

    .line 9
    .line 10
    invoke-direct {v2, v1, p1}, Ldefpackage/ea4;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-boolean p1, p0, Ldefpackage/yk;->p:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Ldefpackage/ea4;->q()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object p0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ldefpackage/oi;

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1, v2}, Ldefpackage/yd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :goto_0
    monitor-exit v0

    .line 35
    return-object v2

    .line 36
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p0
.end method

.method public k(Ldefpackage/ws1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/cl;

    .line 4
    .line 5
    new-instance v1, Ldefpackage/k6;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v1, v2, p0, p1}, Ldefpackage/k6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, v0, Ldefpackage/cl;->a:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    invoke-virtual {v0}, Ldefpackage/cl;->b()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ldefpackage/k6;->run()V

    .line 18
    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
.end method

.method public l(IJ)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public m()I
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ck2;

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/ck2;->j()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ldefpackage/cl;

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/cl;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/cl;->b()V

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Ldefpackage/cl;->l:J

    .line 19
    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x1

    .line 26
    if-gtz v1, :cond_1

    .line 27
    .line 28
    iget-boolean v1, p0, Ldefpackage/cl;->m:Z

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v1, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    move v1, v3

    .line 36
    :goto_1
    const/4 v4, -0x1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return v4

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_3

    .line 43
    :cond_2
    iget-object p0, p0, Ldefpackage/cl;->d:Ldefpackage/b30;

    .line 44
    .line 45
    iget v1, p0, Ldefpackage/b30;->a:I

    .line 46
    .line 47
    iget v5, p0, Ldefpackage/b30;->b:I

    .line 48
    .line 49
    if-ne v1, v5, :cond_3

    .line 50
    .line 51
    move v2, v3

    .line 52
    :cond_3
    if-eqz v2, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    if-eq v1, v5, :cond_5

    .line 56
    .line 57
    iget-object v2, p0, Ldefpackage/b30;->c:[I

    .line 58
    .line 59
    aget v4, v2, v1

    .line 60
    .line 61
    add-int/2addr v1, v3

    .line 62
    iget v2, p0, Ldefpackage/b30;->d:I

    .line 63
    .line 64
    and-int/2addr v1, v2

    .line 65
    iput v1, p0, Ldefpackage/b30;->a:I

    .line 66
    .line 67
    :goto_2
    monitor-exit v0

    .line 68
    return v4

    .line 69
    :cond_5
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 70
    .line 71
    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw p0
.end method

.method public n(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ck2;

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/ck2;->j()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ldefpackage/cl;

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/cl;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/cl;->b()V

    .line 16
    .line 17
    .line 18
    iget-wide v2, p0, Ldefpackage/cl;->l:J

    .line 19
    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    cmp-long v0, v2, v4

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x1

    .line 26
    if-gtz v0, :cond_1

    .line 27
    .line 28
    iget-boolean v0, p0, Ldefpackage/cl;->m:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    move v0, v3

    .line 36
    :goto_1
    const/4 v4, -0x1

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    monitor-exit v1

    .line 40
    return v4

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p0, v0

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    iget-object v0, p0, Ldefpackage/cl;->e:Ldefpackage/b30;

    .line 45
    .line 46
    iget v5, v0, Ldefpackage/b30;->a:I

    .line 47
    .line 48
    iget v6, v0, Ldefpackage/b30;->b:I

    .line 49
    .line 50
    if-ne v5, v6, :cond_3

    .line 51
    .line 52
    move v2, v3

    .line 53
    :cond_3
    if-eqz v2, :cond_4

    .line 54
    .line 55
    monitor-exit v1

    .line 56
    return v4

    .line 57
    :cond_4
    if-eq v5, v6, :cond_7

    .line 58
    .line 59
    iget-object v2, v0, Ldefpackage/b30;->c:[I

    .line 60
    .line 61
    aget v2, v2, v5

    .line 62
    .line 63
    add-int/2addr v5, v3

    .line 64
    iget v3, v0, Ldefpackage/b30;->d:I

    .line 65
    .line 66
    and-int/2addr v3, v5

    .line 67
    iput v3, v0, Ldefpackage/b30;->a:I

    .line 68
    .line 69
    if-ltz v2, :cond_5

    .line 70
    .line 71
    iget-object v0, p0, Ldefpackage/cl;->h:Landroid/media/MediaFormat;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, Ldefpackage/cl;->f:Ljava/util/ArrayDeque;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Landroid/media/MediaCodec$BufferInfo;

    .line 83
    .line 84
    iget v4, p0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 85
    .line 86
    iget v5, p0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 87
    .line 88
    iget-wide v6, p0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 89
    .line 90
    iget v8, p0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 91
    .line 92
    move-object v3, p1

    .line 93
    invoke-virtual/range {v3 .. v8}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    const/4 p1, -0x2

    .line 98
    if-ne v2, p1, :cond_6

    .line 99
    .line 100
    iget-object p1, p0, Ldefpackage/cl;->g:Ljava/util/ArrayDeque;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Landroid/media/MediaFormat;

    .line 107
    .line 108
    iput-object p1, p0, Ldefpackage/cl;->h:Landroid/media/MediaFormat;

    .line 109
    .line 110
    :cond_6
    :goto_2
    monitor-exit v1

    .line 111
    return v2

    .line 112
    :cond_7
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 113
    .line 114
    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 115
    .line 116
    .line 117
    throw p0

    .line 118
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    throw p0
.end method

.method public p(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(I)Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public r(Landroid/view/Surface;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public s()I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Ldefpackage/yk;->o:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    iput v2, p0, Ldefpackage/yk;->o:I

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p0
.end method

.method public t(I)Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public u(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {p0, p1}, Ldefpackage/db;->D(Landroid/media/MediaCodec;Ljava/util/ArrayList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public v(Ldefpackage/nk2;Landroid/os/Handler;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    new-instance v1, Ldefpackage/wk;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldefpackage/wk;-><init>(Ldefpackage/ak2;Ldefpackage/nk2;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public w(Ldefpackage/om1;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/cl;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/cl;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iput-object p1, p0, Ldefpackage/cl;->o:Ldefpackage/om1;

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p0
.end method

.method public x(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {p0, p1}, Ldefpackage/db;->u(Landroid/media/MediaCodec;Ljava/util/ArrayList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public y(ILjava/lang/Object;)V
    .locals 4

    .line 1
    const-string v0, "Type mismatch, expected "

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/yk;->q:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Ldefpackage/oi;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v2, p1}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ldefpackage/ea4;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object v2, p1, Ldefpackage/ea4;->v:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-ne v2, v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Ldefpackage/u0;->l(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const-string v2, "SequencedFutureManager"

    .line 41
    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p1, Ldefpackage/ea4;->v:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, ", but was "

    .line 57
    .line 58
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {v2, p1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    :goto_0
    iget-object p1, p0, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Ldefpackage/sl2;

    .line 78
    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    iget-object p1, p0, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Ldefpackage/oi;

    .line 84
    .line 85
    invoke-virtual {p1}, Ldefpackage/yd4;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0}, Ldefpackage/yk;->a()V

    .line 92
    .line 93
    .line 94
    :cond_2
    monitor-exit v1

    .line 95
    return-void

    .line 96
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    throw p0
.end method
