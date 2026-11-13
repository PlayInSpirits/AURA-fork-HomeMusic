.class public final Ldefpackage/an;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final r:Ljava/lang/Object;

.field public static s:Ljava/util/concurrent/ScheduledExecutorService;

.field public static t:I


# instance fields
.field public final a:Landroid/media/AudioTrack;

.field public final b:Ldefpackage/em;

.field public final c:Ldefpackage/zh0;

.field public d:Ldefpackage/bq4;

.field public final e:Ldefpackage/en;

.field public final f:Z

.field public final g:I

.field public final h:Ldefpackage/jv3;

.field public final i:Ldefpackage/tc2;

.field public j:Z

.field public k:J

.field public l:J

.field public m:J

.field public n:Ljava/nio/ByteBuffer;

.field public o:I

.field public p:I

.field public q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/an;->r:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/media/AudioTrack;Ldefpackage/em;Ldefpackage/zh0;Ldefpackage/vp4;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/an;->b:Ldefpackage/em;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/an;->c:Ldefpackage/zh0;

    .line 9
    .line 10
    new-instance v0, Ldefpackage/tc2;

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ldefpackage/tc2;-><init>(Ljava/lang/Thread;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ldefpackage/an;->i:Ldefpackage/tc2;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, v0, Ldefpackage/tc2;->i:Z

    .line 23
    .line 24
    iget v0, p2, Ldefpackage/em;->a:I

    .line 25
    .line 26
    invoke-static {v0}, Ldefpackage/f35;->L(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput-boolean v0, p0, Ldefpackage/an;->f:Z

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget v0, p2, Ldefpackage/em;->c:I

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p2, Ldefpackage/em;->a:I

    .line 41
    .line 42
    invoke-static {v2}, Ldefpackage/f35;->t(I)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    mul-int/2addr v2, v0

    .line 47
    iput v2, p0, Ldefpackage/an;->g:I

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 v0, -0x1

    .line 51
    iput v0, p0, Ldefpackage/an;->g:I

    .line 52
    .line 53
    :goto_0
    new-instance v2, Ldefpackage/en;

    .line 54
    .line 55
    new-instance v3, Ldefpackage/d34;

    .line 56
    .line 57
    const/16 v0, 0x8

    .line 58
    .line 59
    invoke-direct {v3, v0, p0}, Ldefpackage/d34;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget v6, p2, Ldefpackage/em;->a:I

    .line 63
    .line 64
    iget v7, p0, Ldefpackage/an;->g:I

    .line 65
    .line 66
    iget v8, p2, Ldefpackage/em;->f:I

    .line 67
    .line 68
    move-object v5, p1

    .line 69
    move-object v4, p4

    .line 70
    invoke-direct/range {v2 .. v8}, Ldefpackage/en;-><init>(Ldefpackage/d34;Ldefpackage/vp4;Landroid/media/AudioTrack;III)V

    .line 71
    .line 72
    .line 73
    iput-object v2, p0, Ldefpackage/an;->e:Ldefpackage/en;

    .line 74
    .line 75
    if-eqz p3, :cond_1

    .line 76
    .line 77
    new-instance p1, Ldefpackage/bq4;

    .line 78
    .line 79
    invoke-direct {p1, v5, p3}, Ldefpackage/bq4;-><init>(Landroid/media/AudioTrack;Ldefpackage/zh0;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Ldefpackage/an;->d:Ldefpackage/bq4;

    .line 83
    .line 84
    :cond_1
    invoke-virtual {p0}, Ldefpackage/an;->c()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    const/4 p2, 0x0

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    new-instance p1, Ldefpackage/jv3;

    .line 92
    .line 93
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object p0, p1, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {p2}, Ldefpackage/f35;->p(Ldefpackage/nk2;)Landroid/os/Handler;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    iput-object p2, p1, Ldefpackage/jv3;->n:Ljava/lang/Object;

    .line 103
    .line 104
    new-instance p3, Ldefpackage/zm;

    .line 105
    .line 106
    invoke-direct {p3, p1}, Ldefpackage/zm;-><init>(Ldefpackage/jv3;)V

    .line 107
    .line 108
    .line 109
    iput-object p3, p1, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 110
    .line 111
    iget-object p4, p0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 112
    .line 113
    new-instance v0, Ldefpackage/ym;

    .line 114
    .line 115
    invoke-direct {v0, p2, v1}, Ldefpackage/ym;-><init>(Landroid/os/Handler;I)V

    .line 116
    .line 117
    .line 118
    invoke-static {p4, v0, p3}, Ldefpackage/z9;->p(Landroid/media/AudioTrack;Ldefpackage/ym;Ldefpackage/zm;)V

    .line 119
    .line 120
    .line 121
    move-object p2, p1

    .line 122
    :cond_2
    iput-object p2, p0, Ldefpackage/an;->h:Ldefpackage/jv3;

    .line 123
    .line 124
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/an;->e:Ldefpackage/en;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/en;->b:Ldefpackage/vp4;

    .line 6
    .line 7
    iget-object v2, v0, Ldefpackage/en;->h:Ldefpackage/vm;

    .line 8
    .line 9
    iget-object v3, v0, Ldefpackage/en;->d:Landroid/media/AudioTrack;

    .line 10
    .line 11
    invoke-virtual {v3}, Landroid/media/AudioTrack;->getPlayState()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const-wide/16 v6, 0x3e8

    .line 16
    .line 17
    const-wide/16 v8, 0x0

    .line 18
    .line 19
    const/4 v11, 0x1

    .line 20
    const/4 v12, 0x3

    .line 21
    if-ne v4, v12, :cond_19

    .line 22
    .line 23
    iget-object v4, v0, Ldefpackage/en;->c:[J

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v13

    .line 32
    div-long/2addr v13, v6

    .line 33
    move-wide v15, v6

    .line 34
    iget-wide v6, v0, Ldefpackage/en;->l:J

    .line 35
    .line 36
    sub-long v6, v13, v6

    .line 37
    .line 38
    const-wide/16 v17, 0x7530

    .line 39
    .line 40
    cmp-long v6, v6, v17

    .line 41
    .line 42
    if-ltz v6, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Ldefpackage/en;->a()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    move-wide/from16 v17, v15

    .line 49
    .line 50
    iget v15, v0, Ldefpackage/en;->e:I

    .line 51
    .line 52
    invoke-static {v15, v6, v7}, Ldefpackage/f35;->Y(IJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    cmp-long v15, v6, v8

    .line 57
    .line 58
    if-nez v15, :cond_0

    .line 59
    .line 60
    move-object/from16 v23, v0

    .line 61
    .line 62
    move-object/from16 v24, v1

    .line 63
    .line 64
    move-object/from16 v31, v3

    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_0
    iget v15, v0, Ldefpackage/en;->s:I

    .line 69
    .line 70
    iget v12, v0, Ldefpackage/en;->i:F

    .line 71
    .line 72
    invoke-static {v6, v7, v12}, Ldefpackage/f35;->E(JF)J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    sub-long/2addr v6, v13

    .line 77
    aput-wide v6, v4, v15

    .line 78
    .line 79
    iget v6, v0, Ldefpackage/en;->s:I

    .line 80
    .line 81
    add-int/2addr v6, v11

    .line 82
    const/16 v7, 0xa

    .line 83
    .line 84
    rem-int/2addr v6, v7

    .line 85
    iput v6, v0, Ldefpackage/en;->s:I

    .line 86
    .line 87
    iget v6, v0, Ldefpackage/en;->t:I

    .line 88
    .line 89
    if-ge v6, v7, :cond_1

    .line 90
    .line 91
    add-int/2addr v6, v11

    .line 92
    iput v6, v0, Ldefpackage/en;->t:I

    .line 93
    .line 94
    :cond_1
    iput-wide v13, v0, Ldefpackage/en;->l:J

    .line 95
    .line 96
    iput-wide v8, v0, Ldefpackage/en;->k:J

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    :goto_0
    iget v7, v0, Ldefpackage/en;->t:I

    .line 100
    .line 101
    if-ge v6, v7, :cond_3

    .line 102
    .line 103
    move v15, v6

    .line 104
    iget-wide v5, v0, Ldefpackage/en;->k:J

    .line 105
    .line 106
    aget-wide v19, v4, v15

    .line 107
    .line 108
    int-to-long v11, v7

    .line 109
    div-long v19, v19, v11

    .line 110
    .line 111
    add-long v5, v19, v5

    .line 112
    .line 113
    iput-wide v5, v0, Ldefpackage/en;->k:J

    .line 114
    .line 115
    add-int/lit8 v6, v15, 0x1

    .line 116
    .line 117
    const/4 v11, 0x1

    .line 118
    goto :goto_0

    .line 119
    :cond_2
    move-wide/from16 v17, v15

    .line 120
    .line 121
    :cond_3
    iget-wide v4, v0, Ldefpackage/en;->n:J

    .line 122
    .line 123
    iget-boolean v6, v0, Ldefpackage/en;->g:Z

    .line 124
    .line 125
    const-string v7, "AudioTrackAudioOutput"

    .line 126
    .line 127
    const-wide/32 v19, 0x7a120

    .line 128
    .line 129
    .line 130
    if-eqz v6, :cond_5

    .line 131
    .line 132
    iget-object v6, v0, Ldefpackage/en;->m:Ljava/lang/reflect/Method;

    .line 133
    .line 134
    if-eqz v6, :cond_5

    .line 135
    .line 136
    iget-wide v11, v0, Ldefpackage/en;->o:J

    .line 137
    .line 138
    sub-long v11, v13, v11

    .line 139
    .line 140
    cmp-long v11, v11, v19

    .line 141
    .line 142
    if-ltz v11, :cond_5

    .line 143
    .line 144
    const/4 v11, 0x0

    .line 145
    :try_start_0
    invoke-virtual {v6, v3, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    check-cast v6, Ljava/lang/Integer;

    .line 150
    .line 151
    sget-object v12, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 157
    int-to-long v10, v6

    .line 158
    mul-long v10, v10, v17

    .line 159
    .line 160
    move-wide/from16 v21, v13

    .line 161
    .line 162
    :try_start_1
    iget-wide v12, v0, Ldefpackage/en;->f:J

    .line 163
    .line 164
    sub-long/2addr v10, v12

    .line 165
    iput-wide v10, v0, Ldefpackage/en;->n:J

    .line 166
    .line 167
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 168
    .line 169
    .line 170
    move-result-wide v10

    .line 171
    iput-wide v10, v0, Ldefpackage/en;->n:J

    .line 172
    .line 173
    const-wide/32 v12, 0x989680

    .line 174
    .line 175
    .line 176
    cmp-long v12, v10, v12

    .line 177
    .line 178
    if-lez v12, :cond_4

    .line 179
    .line 180
    new-instance v12, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v13, "Ignoring impossibly large audio latency: "

    .line 183
    .line 184
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    invoke-static {v7, v10}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iput-wide v8, v0, Ldefpackage/en;->n:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :catch_0
    const/4 v6, 0x0

    .line 201
    goto :goto_2

    .line 202
    :cond_4
    :goto_1
    move-wide/from16 v13, v21

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :catch_1
    move-wide/from16 v21, v13

    .line 206
    .line 207
    move-object v6, v11

    .line 208
    :goto_2
    iput-object v6, v0, Ldefpackage/en;->m:Ljava/lang/reflect/Method;

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :goto_3
    iput-wide v13, v0, Ldefpackage/en;->o:J

    .line 212
    .line 213
    :cond_5
    iget-wide v10, v0, Ldefpackage/en;->n:J

    .line 214
    .line 215
    cmp-long v4, v4, v10

    .line 216
    .line 217
    if-eqz v4, :cond_6

    .line 218
    .line 219
    const/4 v4, 0x1

    .line 220
    goto :goto_4

    .line 221
    :cond_6
    const/4 v4, 0x0

    .line 222
    :goto_4
    iget v5, v0, Ldefpackage/en;->i:F

    .line 223
    .line 224
    invoke-virtual {v0, v13, v14}, Ldefpackage/en;->b(J)J

    .line 225
    .line 226
    .line 227
    move-result-wide v10

    .line 228
    iget-object v6, v2, Ldefpackage/vm;->a:Ldefpackage/um;

    .line 229
    .line 230
    iget-object v12, v2, Ldefpackage/vm;->a:Ldefpackage/um;

    .line 231
    .line 232
    move-wide/from16 v21, v8

    .line 233
    .line 234
    iget v8, v2, Ldefpackage/vm;->b:I

    .line 235
    .line 236
    move-object v9, v3

    .line 237
    if-nez v4, :cond_7

    .line 238
    .line 239
    iget-wide v3, v2, Ldefpackage/vm;->g:J

    .line 240
    .line 241
    sub-long v3, v13, v3

    .line 242
    .line 243
    move-wide/from16 v23, v3

    .line 244
    .line 245
    iget-wide v3, v2, Ldefpackage/vm;->f:J

    .line 246
    .line 247
    cmp-long v3, v23, v3

    .line 248
    .line 249
    if-gez v3, :cond_7

    .line 250
    .line 251
    move-object/from16 v23, v0

    .line 252
    .line 253
    move-object/from16 v24, v1

    .line 254
    .line 255
    move-object/from16 v31, v9

    .line 256
    .line 257
    goto/16 :goto_a

    .line 258
    .line 259
    :cond_7
    iput-wide v13, v2, Ldefpackage/vm;->g:J

    .line 260
    .line 261
    iget-object v3, v6, Ldefpackage/um;->a:Landroid/media/AudioTrack;

    .line 262
    .line 263
    iget-object v4, v6, Ldefpackage/um;->b:Landroid/media/AudioTimestamp;

    .line 264
    .line 265
    invoke-virtual {v3, v4}, Landroid/media/AudioTrack;->getTimestamp(Landroid/media/AudioTimestamp;)Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-eqz v3, :cond_a

    .line 270
    .line 271
    move-object/from16 v23, v0

    .line 272
    .line 273
    move-object/from16 v24, v1

    .line 274
    .line 275
    iget-wide v0, v4, Landroid/media/AudioTimestamp;->framePosition:J

    .line 276
    .line 277
    move-wide/from16 v25, v10

    .line 278
    .line 279
    move-object v11, v9

    .line 280
    iget-wide v9, v6, Ldefpackage/um;->d:J

    .line 281
    .line 282
    cmp-long v27, v9, v0

    .line 283
    .line 284
    if-lez v27, :cond_9

    .line 285
    .line 286
    iget-boolean v15, v6, Ldefpackage/um;->f:Z

    .line 287
    .line 288
    if-eqz v15, :cond_8

    .line 289
    .line 290
    move-wide/from16 v28, v9

    .line 291
    .line 292
    iget-wide v9, v6, Ldefpackage/um;->g:J

    .line 293
    .line 294
    add-long v9, v9, v28

    .line 295
    .line 296
    iput-wide v9, v6, Ldefpackage/um;->g:J

    .line 297
    .line 298
    const/4 v15, 0x0

    .line 299
    iput-boolean v15, v6, Ldefpackage/um;->f:Z

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_8
    iget-wide v9, v6, Ldefpackage/um;->c:J

    .line 303
    .line 304
    const-wide/16 v27, 0x1

    .line 305
    .line 306
    add-long v9, v9, v27

    .line 307
    .line 308
    iput-wide v9, v6, Ldefpackage/um;->c:J

    .line 309
    .line 310
    :cond_9
    :goto_5
    iput-wide v0, v6, Ldefpackage/um;->d:J

    .line 311
    .line 312
    iget-wide v9, v6, Ldefpackage/um;->g:J

    .line 313
    .line 314
    add-long/2addr v0, v9

    .line 315
    iget-wide v9, v6, Ldefpackage/um;->c:J

    .line 316
    .line 317
    const/16 v27, 0x20

    .line 318
    .line 319
    shl-long v9, v9, v27

    .line 320
    .line 321
    add-long/2addr v0, v9

    .line 322
    iput-wide v0, v6, Ldefpackage/um;->e:J

    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_a
    move-object/from16 v23, v0

    .line 326
    .line 327
    move-object/from16 v24, v1

    .line 328
    .line 329
    move-wide/from16 v25, v10

    .line 330
    .line 331
    move-object v11, v9

    .line 332
    :goto_6
    if-eqz v3, :cond_d

    .line 333
    .line 334
    iget-object v1, v2, Ldefpackage/vm;->c:Ldefpackage/d34;

    .line 335
    .line 336
    iget-wide v9, v4, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 337
    .line 338
    div-long v9, v9, v17

    .line 339
    .line 340
    move-object/from16 v28, v1

    .line 341
    .line 342
    iget-wide v0, v12, Ldefpackage/um;->e:J

    .line 343
    .line 344
    iget-object v15, v12, Ldefpackage/um;->b:Landroid/media/AudioTimestamp;

    .line 345
    .line 346
    move-object/from16 v31, v11

    .line 347
    .line 348
    move-object/from16 v30, v12

    .line 349
    .line 350
    iget-wide v11, v15, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 351
    .line 352
    div-long v11, v11, v17

    .line 353
    .line 354
    invoke-static {v8, v0, v1}, Ldefpackage/f35;->Y(IJ)J

    .line 355
    .line 356
    .line 357
    move-result-wide v0

    .line 358
    sub-long v11, v13, v11

    .line 359
    .line 360
    invoke-static {v11, v12, v5}, Ldefpackage/f35;->A(JF)J

    .line 361
    .line 362
    .line 363
    move-result-wide v11

    .line 364
    add-long/2addr v11, v0

    .line 365
    sub-long v0, v9, v13

    .line 366
    .line 367
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 368
    .line 369
    .line 370
    move-result-wide v0

    .line 371
    const-wide/32 v32, 0x4c4b40

    .line 372
    .line 373
    .line 374
    cmp-long v0, v0, v32

    .line 375
    .line 376
    const-string v1, ", "

    .line 377
    .line 378
    if-lez v0, :cond_b

    .line 379
    .line 380
    iget-wide v11, v6, Ldefpackage/um;->e:J

    .line 381
    .line 382
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v15, "Spurious audio timestamp (system clock mismatch): "

    .line 388
    .line 389
    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    move-wide/from16 v9, v25

    .line 411
    .line 412
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    move-object/from16 v15, v28

    .line 419
    .line 420
    iget-object v1, v15, Ldefpackage/d34;->o:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v1, Ldefpackage/an;

    .line 423
    .line 424
    invoke-virtual {v1}, Ldefpackage/an;->b()J

    .line 425
    .line 426
    .line 427
    move-result-wide v9

    .line 428
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-static {v7, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    const/4 v0, 0x4

    .line 439
    invoke-virtual {v2, v0}, Ldefpackage/vm;->a(I)V

    .line 440
    .line 441
    .line 442
    move/from16 v25, v3

    .line 443
    .line 444
    move-object/from16 v26, v4

    .line 445
    .line 446
    move/from16 v28, v5

    .line 447
    .line 448
    goto/16 :goto_7

    .line 449
    .line 450
    :cond_b
    move-wide/from16 v34, v25

    .line 451
    .line 452
    move-wide/from16 v25, v11

    .line 453
    .line 454
    move-wide/from16 v11, v34

    .line 455
    .line 456
    move-object/from16 v15, v28

    .line 457
    .line 458
    sub-long v25, v25, v11

    .line 459
    .line 460
    invoke-static/range {v25 .. v26}, Ljava/lang/Math;->abs(J)J

    .line 461
    .line 462
    .line 463
    move-result-wide v25

    .line 464
    cmp-long v0, v25, v32

    .line 465
    .line 466
    if-lez v0, :cond_c

    .line 467
    .line 468
    move/from16 v25, v3

    .line 469
    .line 470
    move-object v0, v4

    .line 471
    iget-wide v3, v6, Ldefpackage/um;->e:J

    .line 472
    .line 473
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    move-object/from16 v26, v0

    .line 477
    .line 478
    new-instance v0, Ljava/lang/StringBuilder;

    .line 479
    .line 480
    move/from16 v28, v5

    .line 481
    .line 482
    const-string v5, "Spurious audio timestamp (frame position mismatch): "

    .line 483
    .line 484
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    iget-object v1, v15, Ldefpackage/d34;->o:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v1, Ldefpackage/an;

    .line 514
    .line 515
    invoke-virtual {v1}, Ldefpackage/an;->b()J

    .line 516
    .line 517
    .line 518
    move-result-wide v3

    .line 519
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-static {v7, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    const/4 v0, 0x4

    .line 530
    invoke-virtual {v2, v0}, Ldefpackage/vm;->a(I)V

    .line 531
    .line 532
    .line 533
    goto :goto_7

    .line 534
    :cond_c
    move/from16 v25, v3

    .line 535
    .line 536
    move-object/from16 v26, v4

    .line 537
    .line 538
    move/from16 v28, v5

    .line 539
    .line 540
    const/4 v0, 0x4

    .line 541
    iget v1, v2, Ldefpackage/vm;->d:I

    .line 542
    .line 543
    if-ne v1, v0, :cond_e

    .line 544
    .line 545
    const/4 v15, 0x0

    .line 546
    invoke-virtual {v2, v15}, Ldefpackage/vm;->a(I)V

    .line 547
    .line 548
    .line 549
    goto :goto_7

    .line 550
    :cond_d
    move/from16 v25, v3

    .line 551
    .line 552
    move-object/from16 v26, v4

    .line 553
    .line 554
    move/from16 v28, v5

    .line 555
    .line 556
    move-object/from16 v31, v11

    .line 557
    .line 558
    move-object/from16 v30, v12

    .line 559
    .line 560
    const/4 v0, 0x4

    .line 561
    :cond_e
    :goto_7
    iget v1, v2, Ldefpackage/vm;->d:I

    .line 562
    .line 563
    if-eqz v1, :cond_17

    .line 564
    .line 565
    const/4 v3, 0x1

    .line 566
    if-eq v1, v3, :cond_12

    .line 567
    .line 568
    const/4 v12, 0x2

    .line 569
    if-eq v1, v12, :cond_11

    .line 570
    .line 571
    const/4 v3, 0x3

    .line 572
    if-eq v1, v3, :cond_10

    .line 573
    .line 574
    if-ne v1, v0, :cond_f

    .line 575
    .line 576
    goto/16 :goto_a

    .line 577
    .line 578
    :cond_f
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 579
    .line 580
    .line 581
    return-wide v21

    .line 582
    :cond_10
    if-eqz v25, :cond_1a

    .line 583
    .line 584
    const/4 v15, 0x0

    .line 585
    invoke-virtual {v2, v15}, Ldefpackage/vm;->a(I)V

    .line 586
    .line 587
    .line 588
    goto/16 :goto_b

    .line 589
    .line 590
    :cond_11
    const/4 v15, 0x0

    .line 591
    if-nez v25, :cond_1a

    .line 592
    .line 593
    invoke-virtual {v2, v15}, Ldefpackage/vm;->a(I)V

    .line 594
    .line 595
    .line 596
    goto/16 :goto_a

    .line 597
    .line 598
    :cond_12
    move-object/from16 v0, v30

    .line 599
    .line 600
    if-eqz v25, :cond_16

    .line 601
    .line 602
    iget-wide v3, v6, Ldefpackage/um;->e:J

    .line 603
    .line 604
    iget-wide v9, v2, Ldefpackage/vm;->h:J

    .line 605
    .line 606
    cmp-long v1, v3, v9

    .line 607
    .line 608
    if-gtz v1, :cond_13

    .line 609
    .line 610
    move-wide/from16 v27, v13

    .line 611
    .line 612
    goto :goto_8

    .line 613
    :cond_13
    iget-wide v3, v2, Ldefpackage/vm;->i:J

    .line 614
    .line 615
    invoke-static {v8, v9, v10}, Ldefpackage/f35;->Y(IJ)J

    .line 616
    .line 617
    .line 618
    move-result-wide v9

    .line 619
    sub-long v3, v13, v3

    .line 620
    .line 621
    move/from16 v1, v28

    .line 622
    .line 623
    invoke-static {v3, v4, v1}, Ldefpackage/f35;->A(JF)J

    .line 624
    .line 625
    .line 626
    move-result-wide v3

    .line 627
    add-long/2addr v3, v9

    .line 628
    iget-wide v9, v0, Ldefpackage/um;->e:J

    .line 629
    .line 630
    iget-object v0, v0, Ldefpackage/um;->b:Landroid/media/AudioTimestamp;

    .line 631
    .line 632
    move-wide/from16 v27, v13

    .line 633
    .line 634
    iget-wide v12, v0, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 635
    .line 636
    div-long v12, v12, v17

    .line 637
    .line 638
    invoke-static {v8, v9, v10}, Ldefpackage/f35;->Y(IJ)J

    .line 639
    .line 640
    .line 641
    move-result-wide v7

    .line 642
    sub-long v13, v27, v12

    .line 643
    .line 644
    invoke-static {v13, v14, v1}, Ldefpackage/f35;->A(JF)J

    .line 645
    .line 646
    .line 647
    move-result-wide v0

    .line 648
    add-long/2addr v0, v7

    .line 649
    sub-long/2addr v0, v3

    .line 650
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 651
    .line 652
    .line 653
    move-result-wide v0

    .line 654
    cmp-long v0, v0, v17

    .line 655
    .line 656
    if-gez v0, :cond_14

    .line 657
    .line 658
    const/4 v12, 0x2

    .line 659
    invoke-virtual {v2, v12}, Ldefpackage/vm;->a(I)V

    .line 660
    .line 661
    .line 662
    goto :goto_a

    .line 663
    :cond_14
    :goto_8
    iget-wide v0, v2, Ldefpackage/vm;->e:J

    .line 664
    .line 665
    sub-long v13, v27, v0

    .line 666
    .line 667
    const-wide/32 v0, 0x1e8480

    .line 668
    .line 669
    .line 670
    cmp-long v0, v13, v0

    .line 671
    .line 672
    if-lez v0, :cond_15

    .line 673
    .line 674
    const/4 v3, 0x3

    .line 675
    invoke-virtual {v2, v3}, Ldefpackage/vm;->a(I)V

    .line 676
    .line 677
    .line 678
    goto :goto_a

    .line 679
    :cond_15
    iget-wide v0, v6, Ldefpackage/um;->e:J

    .line 680
    .line 681
    iput-wide v0, v2, Ldefpackage/vm;->h:J

    .line 682
    .line 683
    move-object/from16 v0, v26

    .line 684
    .line 685
    iget-wide v0, v0, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 686
    .line 687
    div-long v0, v0, v17

    .line 688
    .line 689
    iput-wide v0, v2, Ldefpackage/vm;->i:J

    .line 690
    .line 691
    goto :goto_a

    .line 692
    :cond_16
    const/4 v15, 0x0

    .line 693
    invoke-virtual {v2, v15}, Ldefpackage/vm;->a(I)V

    .line 694
    .line 695
    .line 696
    goto :goto_b

    .line 697
    :cond_17
    move-wide/from16 v27, v13

    .line 698
    .line 699
    move-object/from16 v0, v26

    .line 700
    .line 701
    const/4 v15, 0x0

    .line 702
    if-eqz v25, :cond_18

    .line 703
    .line 704
    iget-wide v0, v0, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 705
    .line 706
    div-long v3, v0, v17

    .line 707
    .line 708
    iget-wide v7, v2, Ldefpackage/vm;->e:J

    .line 709
    .line 710
    cmp-long v3, v3, v7

    .line 711
    .line 712
    if-ltz v3, :cond_1b

    .line 713
    .line 714
    iget-wide v3, v6, Ldefpackage/um;->e:J

    .line 715
    .line 716
    iput-wide v3, v2, Ldefpackage/vm;->h:J

    .line 717
    .line 718
    div-long v0, v0, v17

    .line 719
    .line 720
    iput-wide v0, v2, Ldefpackage/vm;->i:J

    .line 721
    .line 722
    const/4 v3, 0x1

    .line 723
    invoke-virtual {v2, v3}, Ldefpackage/vm;->a(I)V

    .line 724
    .line 725
    .line 726
    goto :goto_b

    .line 727
    :cond_18
    iget-wide v0, v2, Ldefpackage/vm;->e:J

    .line 728
    .line 729
    sub-long v13, v27, v0

    .line 730
    .line 731
    cmp-long v0, v13, v19

    .line 732
    .line 733
    if-lez v0, :cond_1b

    .line 734
    .line 735
    const/4 v3, 0x3

    .line 736
    invoke-virtual {v2, v3}, Ldefpackage/vm;->a(I)V

    .line 737
    .line 738
    .line 739
    goto :goto_b

    .line 740
    :cond_19
    move-object/from16 v23, v0

    .line 741
    .line 742
    move-object/from16 v24, v1

    .line 743
    .line 744
    move-object/from16 v31, v3

    .line 745
    .line 746
    move-wide/from16 v17, v6

    .line 747
    .line 748
    :goto_9
    move-wide/from16 v21, v8

    .line 749
    .line 750
    :cond_1a
    :goto_a
    const/4 v15, 0x0

    .line 751
    :cond_1b
    :goto_b
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 755
    .line 756
    .line 757
    move-result-wide v0

    .line 758
    div-long v0, v0, v17

    .line 759
    .line 760
    iget v3, v2, Ldefpackage/vm;->d:I

    .line 761
    .line 762
    const/4 v12, 0x2

    .line 763
    if-ne v3, v12, :cond_1c

    .line 764
    .line 765
    const/4 v10, 0x1

    .line 766
    goto :goto_c

    .line 767
    :cond_1c
    move v10, v15

    .line 768
    :goto_c
    if-eqz v10, :cond_1d

    .line 769
    .line 770
    move-object/from16 v3, v23

    .line 771
    .line 772
    iget v4, v3, Ldefpackage/en;->i:F

    .line 773
    .line 774
    iget-object v5, v2, Ldefpackage/vm;->a:Ldefpackage/um;

    .line 775
    .line 776
    iget-wide v6, v5, Ldefpackage/um;->e:J

    .line 777
    .line 778
    iget-object v5, v5, Ldefpackage/um;->b:Landroid/media/AudioTimestamp;

    .line 779
    .line 780
    iget-wide v8, v5, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 781
    .line 782
    div-long v8, v8, v17

    .line 783
    .line 784
    iget v5, v2, Ldefpackage/vm;->b:I

    .line 785
    .line 786
    invoke-static {v5, v6, v7}, Ldefpackage/f35;->Y(IJ)J

    .line 787
    .line 788
    .line 789
    move-result-wide v5

    .line 790
    sub-long v7, v0, v8

    .line 791
    .line 792
    invoke-static {v7, v8, v4}, Ldefpackage/f35;->A(JF)J

    .line 793
    .line 794
    .line 795
    move-result-wide v7

    .line 796
    add-long/2addr v7, v5

    .line 797
    goto :goto_d

    .line 798
    :cond_1d
    move-object/from16 v3, v23

    .line 799
    .line 800
    invoke-virtual {v3, v0, v1}, Ldefpackage/en;->b(J)J

    .line 801
    .line 802
    .line 803
    move-result-wide v7

    .line 804
    :goto_d
    invoke-virtual/range {v31 .. v31}, Landroid/media/AudioTrack;->getPlayState()I

    .line 805
    .line 806
    .line 807
    move-result v4

    .line 808
    const/4 v5, 0x3

    .line 809
    if-ne v4, v5, :cond_21

    .line 810
    .line 811
    if-nez v10, :cond_1e

    .line 812
    .line 813
    iget v2, v2, Ldefpackage/vm;->d:I

    .line 814
    .line 815
    if-eqz v2, :cond_1f

    .line 816
    .line 817
    const/4 v4, 0x1

    .line 818
    if-ne v2, v4, :cond_1e

    .line 819
    .line 820
    goto :goto_e

    .line 821
    :cond_1e
    invoke-virtual {v3, v7, v8}, Ldefpackage/en;->d(J)V

    .line 822
    .line 823
    .line 824
    :cond_1f
    :goto_e
    iget-wide v4, v3, Ldefpackage/en;->z:J

    .line 825
    .line 826
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    cmp-long v2, v4, v9

    .line 832
    .line 833
    if-eqz v2, :cond_20

    .line 834
    .line 835
    sub-long v4, v0, v4

    .line 836
    .line 837
    iget-wide v9, v3, Ldefpackage/en;->y:J

    .line 838
    .line 839
    sub-long v9, v7, v9

    .line 840
    .line 841
    iget v2, v3, Ldefpackage/en;->i:F

    .line 842
    .line 843
    invoke-static {v4, v5, v2}, Ldefpackage/f35;->A(JF)J

    .line 844
    .line 845
    .line 846
    move-result-wide v4

    .line 847
    iget-wide v11, v3, Ldefpackage/en;->y:J

    .line 848
    .line 849
    add-long/2addr v11, v4

    .line 850
    sub-long v13, v11, v7

    .line 851
    .line 852
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    .line 853
    .line 854
    .line 855
    move-result-wide v13

    .line 856
    cmp-long v2, v9, v21

    .line 857
    .line 858
    if-eqz v2, :cond_20

    .line 859
    .line 860
    const-wide/32 v9, 0xf4240

    .line 861
    .line 862
    .line 863
    cmp-long v2, v13, v9

    .line 864
    .line 865
    if-gez v2, :cond_20

    .line 866
    .line 867
    const-wide/16 v9, 0xa

    .line 868
    .line 869
    mul-long/2addr v4, v9

    .line 870
    const-wide/16 v9, 0x64

    .line 871
    .line 872
    div-long/2addr v4, v9

    .line 873
    sub-long v25, v11, v4

    .line 874
    .line 875
    add-long v27, v11, v4

    .line 876
    .line 877
    move-wide/from16 v23, v7

    .line 878
    .line 879
    invoke-static/range {v23 .. v28}, Ldefpackage/f35;->k(JJJ)J

    .line 880
    .line 881
    .line 882
    move-result-wide v7

    .line 883
    :cond_20
    iput-wide v0, v3, Ldefpackage/en;->z:J

    .line 884
    .line 885
    iput-wide v7, v3, Ldefpackage/en;->y:J

    .line 886
    .line 887
    goto :goto_f

    .line 888
    :cond_21
    const/4 v0, 0x1

    .line 889
    if-ne v4, v0, :cond_22

    .line 890
    .line 891
    invoke-virtual {v3, v7, v8}, Ldefpackage/en;->d(J)V

    .line 892
    .line 893
    .line 894
    :cond_22
    :goto_f
    return-wide v7
.end method

.method public final b()J
    .locals 6

    .line 1
    iget-boolean v0, p0, Ldefpackage/an;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Ldefpackage/an;->k:J

    .line 6
    .line 7
    iget p0, p0, Ldefpackage/an;->g:I

    .line 8
    .line 9
    int-to-long v2, p0

    .line 10
    sget-object p0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 11
    .line 12
    add-long/2addr v0, v2

    .line 13
    const-wide/16 v4, 0x1

    .line 14
    .line 15
    sub-long/2addr v0, v4

    .line 16
    div-long/2addr v0, v2

    .line 17
    return-wide v0

    .line 18
    :cond_0
    iget-wide v0, p0, Ldefpackage/an;->l:J

    .line 19
    .line 20
    return-wide v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 8
    .line 9
    invoke-static {p0}, Ldefpackage/z9;->x(Landroid/media/AudioTrack;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final d(IJLjava/nio/ByteBuffer;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Ldefpackage/an;->b:Ldefpackage/em;

    .line 2
    .line 3
    iget-boolean v1, p0, Ldefpackage/an;->f:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v2, p0, Ldefpackage/an;->p:I

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget v2, v0, Ldefpackage/em;->a:I

    .line 12
    .line 13
    invoke-static {v2, p4}, Ldefpackage/tj0;->k(ILjava/nio/ByteBuffer;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iput v2, p0, Ldefpackage/an;->p:I

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Ldefpackage/an;->b()J

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/media/AudioTrack;->getUnderrunCount()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget v4, p0, Ldefpackage/an;->q:I

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    const/4 v10, 0x1

    .line 32
    if-le v2, v4, :cond_1

    .line 33
    .line 34
    move v4, v10

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v4, v9

    .line 37
    :goto_0
    iput v2, p0, Ldefpackage/an;->q:I

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    new-instance v2, Ldefpackage/kf2;

    .line 42
    .line 43
    const/4 v4, 0x5

    .line 44
    invoke-direct {v2, v4}, Ldefpackage/kf2;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/4 v4, -0x1

    .line 48
    iget-object v5, p0, Ldefpackage/an;->i:Ldefpackage/tc2;

    .line 49
    .line 50
    invoke-virtual {v5, v4, v2}, Ldefpackage/tc2;->f(ILdefpackage/qc2;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {p4}, Ljava/nio/Buffer;->remaining()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    iget-boolean v0, v0, Ldefpackage/em;->d:Z

    .line 58
    .line 59
    if-eqz v0, :cond_a

    .line 60
    .line 61
    const-wide/high16 v4, -0x8000000000000000L

    .line 62
    .line 63
    cmp-long v0, p2, v4

    .line 64
    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    iget-wide p2, p0, Ldefpackage/an;->m:J

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iput-wide p2, p0, Ldefpackage/an;->m:J

    .line 71
    .line 72
    :goto_1
    invoke-virtual {p4}, Ljava/nio/Buffer;->remaining()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 77
    .line 78
    const/16 v4, 0x1a

    .line 79
    .line 80
    const-wide/16 v6, 0x3e8

    .line 81
    .line 82
    if-lt v0, v4, :cond_4

    .line 83
    .line 84
    move-wide v7, v6

    .line 85
    const/4 v6, 0x1

    .line 86
    mul-long/2addr v7, p2

    .line 87
    move-object v4, p4

    .line 88
    invoke-virtual/range {v3 .. v8}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v4, p4

    .line 94
    move-wide v7, v6

    .line 95
    iget-object p4, p0, Ldefpackage/an;->n:Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    if-nez p4, :cond_5

    .line 98
    .line 99
    const/16 p4, 0x10

    .line 100
    .line 101
    invoke-static {p4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 102
    .line 103
    .line 104
    move-result-object p4

    .line 105
    iput-object p4, p0, Ldefpackage/an;->n:Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 108
    .line 109
    invoke-virtual {p4, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 110
    .line 111
    .line 112
    iget-object p4, p0, Ldefpackage/an;->n:Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    const v0, 0x55550001

    .line 115
    .line 116
    .line 117
    invoke-virtual {p4, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    .line 120
    :cond_5
    iget p4, p0, Ldefpackage/an;->o:I

    .line 121
    .line 122
    if-nez p4, :cond_6

    .line 123
    .line 124
    iget-object p4, p0, Ldefpackage/an;->n:Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    const/4 v0, 0x4

    .line 127
    invoke-virtual {p4, v0, v5}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 128
    .line 129
    .line 130
    iget-object p4, p0, Ldefpackage/an;->n:Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    const/16 v0, 0x8

    .line 133
    .line 134
    mul-long/2addr p2, v7

    .line 135
    invoke-virtual {p4, v0, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    .line 138
    iget-object p2, p0, Ldefpackage/an;->n:Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    invoke-virtual {p2, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 141
    .line 142
    .line 143
    iput v5, p0, Ldefpackage/an;->o:I

    .line 144
    .line 145
    :cond_6
    iget-object p2, p0, Ldefpackage/an;->n:Ljava/nio/ByteBuffer;

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    if-lez p2, :cond_8

    .line 152
    .line 153
    iget-object p3, p0, Ldefpackage/an;->n:Ljava/nio/ByteBuffer;

    .line 154
    .line 155
    invoke-virtual {v3, p3, p2, v10}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 156
    .line 157
    .line 158
    move-result p3

    .line 159
    if-gez p3, :cond_7

    .line 160
    .line 161
    iput v9, p0, Ldefpackage/an;->o:I

    .line 162
    .line 163
    move p2, p3

    .line 164
    goto :goto_2

    .line 165
    :cond_7
    if-ge p3, p2, :cond_8

    .line 166
    .line 167
    move p2, v9

    .line 168
    goto :goto_2

    .line 169
    :cond_8
    invoke-virtual {v3, v4, v5, v10}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-gez p2, :cond_9

    .line 174
    .line 175
    iput v9, p0, Ldefpackage/an;->o:I

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_9
    iget p3, p0, Ldefpackage/an;->o:I

    .line 179
    .line 180
    sub-int/2addr p3, p2

    .line 181
    iput p3, p0, Ldefpackage/an;->o:I

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_a
    move-object v4, p4

    .line 185
    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    invoke-virtual {v3, v4, p2, v10}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    :goto_2
    if-gez p2, :cond_e

    .line 194
    .line 195
    const/4 p1, -0x6

    .line 196
    if-eq p2, p1, :cond_b

    .line 197
    .line 198
    const/16 p1, -0x20

    .line 199
    .line 200
    if-ne p2, p1, :cond_c

    .line 201
    .line 202
    :cond_b
    move v9, v10

    .line 203
    :cond_c
    if-eqz v9, :cond_d

    .line 204
    .line 205
    iget-object p0, p0, Ldefpackage/an;->c:Ldefpackage/zh0;

    .line 206
    .line 207
    if-eqz p0, :cond_d

    .line 208
    .line 209
    iget-object p0, p0, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p0, Ldefpackage/dn;

    .line 212
    .line 213
    iget-object p1, p0, Ldefpackage/dn;->h:Ldefpackage/ql;

    .line 214
    .line 215
    if-eqz p1, :cond_d

    .line 216
    .line 217
    sget-object p3, Ldefpackage/nl;->c:Ldefpackage/nl;

    .line 218
    .line 219
    iput-object p3, p0, Ldefpackage/dn;->g:Ldefpackage/nl;

    .line 220
    .line 221
    invoke-virtual {p1, p3}, Ldefpackage/ql;->a(Ldefpackage/nl;)V

    .line 222
    .line 223
    .line 224
    :cond_d
    new-instance p0, Landroidx/media3/exoplayer/audio/AudioOutput$WriteException;

    .line 225
    .line 226
    invoke-direct {p0, p2, v9}, Landroidx/media3/exoplayer/audio/AudioOutput$WriteException;-><init>(IZ)V

    .line 227
    .line 228
    .line 229
    throw p0

    .line 230
    :cond_e
    if-ne p2, v2, :cond_f

    .line 231
    .line 232
    move v9, v10

    .line 233
    :cond_f
    if-eqz v1, :cond_10

    .line 234
    .line 235
    iget-wide p3, p0, Ldefpackage/an;->k:J

    .line 236
    .line 237
    int-to-long p1, p2

    .line 238
    add-long/2addr p3, p1

    .line 239
    iput-wide p3, p0, Ldefpackage/an;->k:J

    .line 240
    .line 241
    return v9

    .line 242
    :cond_10
    if-eqz v9, :cond_11

    .line 243
    .line 244
    iget-wide p2, p0, Ldefpackage/an;->l:J

    .line 245
    .line 246
    iget p4, p0, Ldefpackage/an;->p:I

    .line 247
    .line 248
    int-to-long v0, p4

    .line 249
    int-to-long v2, p1

    .line 250
    mul-long/2addr v0, v2

    .line 251
    add-long/2addr v0, p2

    .line 252
    iput-wide v0, p0, Ldefpackage/an;->l:J

    .line 253
    .line 254
    :cond_11
    return v9
.end method
