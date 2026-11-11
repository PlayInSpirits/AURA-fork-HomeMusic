.class public final Lyi0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/util/List;

.field public final c:Ld14;

.field public final d:Lio3;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Ld14;Lio3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyi0;->a:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p4, p0, Lyi0;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p5, p0, Lyi0;->c:Ld14;

    .line 9
    .line 10
    iput-object p6, p0, Lyi0;->d:Lio3;

    .line 11
    .line 12
    new-instance p4, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string p5, "Failed DecodePath{"

    .line 15
    .line 16
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, "->"

    .line 27
    .line 28
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p1, "}"

    .line 49
    .line 50
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lyi0;->e:Ljava/lang/String;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final a(IILx7;Lyh0;Ldb3;)Lq04;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p3

    .line 4
    .line 5
    iget-object v7, v0, Lyi0;->d:Lio3;

    .line 6
    .line 7
    invoke-interface {v7}, Lio3;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "Argument must not be null"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v5, v1

    .line 17
    check-cast v5, Ljava/util/List;

    .line 18
    .line 19
    move/from16 v2, p1

    .line 20
    .line 21
    move/from16 v3, p2

    .line 22
    .line 23
    move-object/from16 v1, p4

    .line 24
    .line 25
    move-object/from16 v4, p5

    .line 26
    .line 27
    :try_start_0
    invoke-virtual/range {v0 .. v5}, Lyi0;->b(Lyh0;IILdb3;Ljava/util/List;)Lq04;

    .line 28
    .line 29
    .line 30
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    invoke-interface {v7, v5}, Lio3;->a(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object v2, v6, Lx7;->p:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lxi0;

    .line 37
    .line 38
    iget v3, v6, Lx7;->o:I

    .line 39
    .line 40
    iget-object v4, v2, Lxi0;->n:Lwi0;

    .line 41
    .line 42
    invoke-interface {v1}, Lq04;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v13

    .line 50
    const/4 v5, 0x4

    .line 51
    if-eq v3, v5, :cond_0

    .line 52
    .line 53
    invoke-virtual {v4, v13}, Lwi0;->e(Ljava/lang/Class;)Luw4;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    iget-object v8, v2, Lxi0;->u:Lii1;

    .line 58
    .line 59
    iget v9, v2, Lxi0;->y:I

    .line 60
    .line 61
    iget v10, v2, Lxi0;->z:I

    .line 62
    .line 63
    invoke-interface {v7, v8, v1, v9, v10}, Luw4;->a(Landroid/content/Context;Lq04;II)Lq04;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    move-object v12, v7

    .line 68
    move-object v15, v8

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object v15, v1

    .line 71
    const/4 v12, 0x0

    .line 72
    :goto_0
    invoke-virtual {v1, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-nez v7, :cond_1

    .line 77
    .line 78
    invoke-interface {v1}, Lq04;->b()V

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v1, v4, Lwi0;->c:Lii1;

    .line 82
    .line 83
    invoke-virtual {v1}, Lii1;->a()Ley3;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v1, v1, Ley3;->d:Lb52;

    .line 88
    .line 89
    invoke-interface {v15}, Lq04;->e()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v1, v7}, Lb52;->a(Ljava/lang/Class;)Lw04;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const/4 v7, 0x3

    .line 98
    if-eqz v1, :cond_3

    .line 99
    .line 100
    iget-object v1, v4, Lwi0;->c:Lii1;

    .line 101
    .line 102
    invoke-virtual {v1}, Lii1;->a()Ley3;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v1, v1, Ley3;->d:Lb52;

    .line 107
    .line 108
    invoke-interface {v15}, Lq04;->e()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-virtual {v1, v8}, Lb52;->a(Ljava/lang/Class;)Lw04;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    if-eqz v1, :cond_2

    .line 117
    .line 118
    iget-object v8, v2, Lxi0;->B:Ldb3;

    .line 119
    .line 120
    invoke-interface {v1, v8}, Lw04;->l(Ldb3;)I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    goto :goto_1

    .line 125
    :cond_2
    new-instance v0, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    .line 126
    .line 127
    invoke-interface {v15}, Lq04;->e()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v0, v1}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    .line 132
    .line 133
    .line 134
    throw v0

    .line 135
    :cond_3
    move v8, v7

    .line 136
    const/4 v1, 0x0

    .line 137
    :goto_1
    iget-object v9, v2, Lxi0;->I:Lf42;

    .line 138
    .line 139
    invoke-virtual {v4}, Lwi0;->b()Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    const/16 p1, 0x0

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    :goto_2
    const/4 v5, 0x1

    .line 151
    if-ge v6, v11, :cond_5

    .line 152
    .line 153
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v16

    .line 157
    move-object/from16 v14, v16

    .line 158
    .line 159
    check-cast v14, Ltw2;

    .line 160
    .line 161
    iget-object v14, v14, Ltw2;->a:Lf42;

    .line 162
    .line 163
    invoke-interface {v14, v9}, Lf42;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_4

    .line 168
    .line 169
    move v6, v5

    .line 170
    goto :goto_3

    .line 171
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_5
    const/4 v6, 0x0

    .line 175
    :goto_3
    iget-object v9, v2, Lxi0;->A:Lxq0;

    .line 176
    .line 177
    iget v9, v9, Lxq0;->a:I

    .line 178
    .line 179
    const/4 v10, 0x2

    .line 180
    packed-switch v9, :pswitch_data_0

    .line 181
    .line 182
    .line 183
    if-nez v6, :cond_6

    .line 184
    .line 185
    if-eq v3, v7, :cond_7

    .line 186
    .line 187
    :cond_6
    if-ne v3, v5, :cond_8

    .line 188
    .line 189
    :cond_7
    if-ne v8, v10, :cond_8

    .line 190
    .line 191
    :goto_4
    move v3, v5

    .line 192
    goto :goto_5

    .line 193
    :cond_8
    :pswitch_0
    const/4 v3, 0x0

    .line 194
    goto :goto_5

    .line 195
    :pswitch_1
    const/4 v6, 0x4

    .line 196
    if-eq v3, v6, :cond_8

    .line 197
    .line 198
    const/4 v6, 0x5

    .line 199
    if-eq v3, v6, :cond_8

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :goto_5
    if-eqz v3, :cond_f

    .line 203
    .line 204
    if-eqz v1, :cond_e

    .line 205
    .line 206
    invoke-static {v8}, Lxa3;->w(I)I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-eqz v3, :cond_d

    .line 211
    .line 212
    if-ne v3, v5, :cond_9

    .line 213
    .line 214
    new-instance v6, Ls04;

    .line 215
    .line 216
    iget-object v3, v4, Lwi0;->c:Lii1;

    .line 217
    .line 218
    iget-object v7, v3, Lii1;->a:Lqj0;

    .line 219
    .line 220
    iget-object v8, v2, Lxi0;->I:Lf42;

    .line 221
    .line 222
    iget-object v9, v2, Lxi0;->v:Lf42;

    .line 223
    .line 224
    iget v10, v2, Lxi0;->y:I

    .line 225
    .line 226
    iget v11, v2, Lxi0;->z:I

    .line 227
    .line 228
    iget-object v14, v2, Lxi0;->B:Ldb3;

    .line 229
    .line 230
    const/4 v3, 0x0

    .line 231
    invoke-direct/range {v6 .. v14}, Ls04;-><init>(Lqj0;Lf42;Lf42;IILuw4;Ljava/lang/Class;Ldb3;)V

    .line 232
    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_9
    if-eq v8, v5, :cond_c

    .line 236
    .line 237
    if-eq v8, v10, :cond_b

    .line 238
    .line 239
    if-eq v8, v7, :cond_a

    .line 240
    .line 241
    const-string v0, "null"

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_a
    const-string v0, "NONE"

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_b
    const-string v0, "TRANSFORMED"

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_c
    const-string v0, "SOURCE"

    .line 251
    .line 252
    :goto_6
    const-string v1, "Unknown strategy: "

    .line 253
    .line 254
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return-object p1

    .line 262
    :cond_d
    const/4 v3, 0x0

    .line 263
    new-instance v6, Lqh0;

    .line 264
    .line 265
    iget-object v4, v2, Lxi0;->I:Lf42;

    .line 266
    .line 267
    iget-object v7, v2, Lxi0;->v:Lf42;

    .line 268
    .line 269
    invoke-direct {v6, v4, v7}, Lqh0;-><init>(Lf42;Lf42;)V

    .line 270
    .line 271
    .line 272
    :goto_7
    sget-object v4, Lde2;->r:Li61;

    .line 273
    .line 274
    invoke-virtual {v4}, Li61;->b()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    check-cast v4, Lde2;

    .line 279
    .line 280
    iput-boolean v3, v4, Lde2;->q:Z

    .line 281
    .line 282
    iput-boolean v5, v4, Lde2;->p:Z

    .line 283
    .line 284
    iput-object v15, v4, Lde2;->o:Lq04;

    .line 285
    .line 286
    iget-object v2, v2, Lxi0;->s:Ljv3;

    .line 287
    .line 288
    iput-object v6, v2, Ljv3;->n:Ljava/lang/Object;

    .line 289
    .line 290
    iput-object v1, v2, Ljv3;->o:Ljava/lang/Object;

    .line 291
    .line 292
    iput-object v4, v2, Ljv3;->p:Ljava/lang/Object;

    .line 293
    .line 294
    move-object v15, v4

    .line 295
    goto :goto_8

    .line 296
    :cond_e
    new-instance v0, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    .line 297
    .line 298
    invoke-interface {v15}, Lq04;->get()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-direct {v0, v1}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    .line 307
    .line 308
    .line 309
    throw v0

    .line 310
    :cond_f
    :goto_8
    iget-object v0, v0, Lyi0;->c:Ld14;

    .line 311
    .line 312
    move-object/from16 v4, p5

    .line 313
    .line 314
    invoke-interface {v0, v15, v4}, Ld14;->q(Lq04;Ldb3;)Lq04;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    return-object v0

    .line 319
    :catchall_0
    move-exception v0

    .line 320
    invoke-interface {v7, v5}, Lio3;->a(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    throw v0

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lyh0;IILdb3;Ljava/util/List;)Lq04;
    .locals 9

    .line 1
    iget-object v0, p0, Lyi0;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_3

    .line 10
    .line 11
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lt04;

    .line 16
    .line 17
    :try_start_0
    invoke-interface {p1}, Lyh0;->l()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-interface {v4, v5, p4}, Lt04;->a(Ljava/lang/Object;Ldb3;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    invoke-interface {p1}, Lyh0;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-interface {v4, v5, p2, p3, p4}, Lt04;->b(Ljava/lang/Object;IILdb3;)Lq04;

    .line 32
    .line 33
    .line 34
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    goto :goto_2

    .line 36
    :catch_0
    move-exception v5

    .line 37
    goto :goto_1

    .line 38
    :catch_1
    move-exception v5

    .line 39
    goto :goto_1

    .line 40
    :catch_2
    move-exception v5

    .line 41
    :goto_1
    const/4 v6, 0x2

    .line 42
    const-string v7, "DecodePath"

    .line 43
    .line 44
    invoke-static {v7, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    new-instance v6, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v8, "Failed to decode data for "

    .line 53
    .line 54
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v7, v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-interface {p5, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    :goto_3
    if-eqz v2, :cond_4

    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_4
    new-instance p1, Lcom/bumptech/glide/load/engine/GlideException;

    .line 80
    .line 81
    new-instance p2, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {p2, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lyi0;->e:Ljava/lang/String;

    .line 87
    .line 88
    invoke-direct {p1, p0, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DecodePath{ dataClass="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyi0;->a:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", decoders="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lyi0;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", transcoder="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lyi0;->c:Ld14;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x7d

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
