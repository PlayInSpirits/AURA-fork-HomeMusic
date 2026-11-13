.class public abstract Lcom/eddyizm/tempus/homemusic/b;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static a:Ljava/lang/ref/WeakReference;

.field public static b:Lcom/eddyizm/tempus/homemusic/WaveSession;

.field public static c:Ldefpackage/u6;

.field public static d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Ldefpackage/qi3;Lcom/eddyizm/tempus/homemusic/WaveSession;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-interface {p0}, Ldefpackage/qi3;->o0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-gez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    invoke-interface {p0}, Ldefpackage/qi3;->Q0()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v0, v2}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v3, 0xa

    .line 22
    .line 23
    invoke-static {v0, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    move-object v3, v0

    .line 35
    check-cast v3, Ldefpackage/i02;

    .line 36
    .line 37
    iget-boolean v3, v3, Ldefpackage/i02;->p:Z

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    move-object v3, v0

    .line 42
    check-cast v3, Ldefpackage/b02;

    .line 43
    .line 44
    invoke-virtual {v3}, Ldefpackage/b02;->nextInt()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {p0, v3}, Ldefpackage/qi3;->Y(I)Ldefpackage/gn2;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v3, v3, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v5, Ldefpackage/kd3;

    .line 59
    .line 60
    invoke-direct {v5, v4, v3}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    :cond_2
    :goto_1
    if-ge v1, v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    move-object v4, v3

    .line 85
    check-cast v4, Ldefpackage/kd3;

    .line 86
    .line 87
    iget-object v4, v4, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p1, v4}, Lcom/eddyizm/tempus/homemusic/WaveSession;->isWave(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_2

    .line 96
    .line 97
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    return-object p0
.end method

.method public static b(Lcom/eddyizm/tempus/homemusic/WaveSession;Ljava/util/List;)V
    .locals 12

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/ao2;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_d

    .line 12
    .line 13
    :cond_0
    invoke-static {p0}, Lcom/eddyizm/tempus/homemusic/b;->j(Lcom/eddyizm/tempus/homemusic/WaveSession;)Ldefpackage/qi3;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    goto/16 :goto_d

    .line 20
    .line 21
    :cond_1
    invoke-static {v1, p0}, Lcom/eddyizm/tempus/homemusic/b;->a(Ldefpackage/qi3;Lcom/eddyizm/tempus/homemusic/WaveSession;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v3, Lcom/eddyizm/tempus/homemusic/WavePlan;->Companion:Lcom/eddyizm/tempus/homemusic/WavePlan$Companion;

    .line 26
    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/16 v5, 0xa

    .line 30
    .line 31
    invoke-static {v2, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, 0x0

    .line 43
    move v8, v7

    .line 44
    :goto_0
    const-string v9, ""

    .line 45
    .line 46
    if-ge v8, v6, :cond_3

    .line 47
    .line 48
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    add-int/lit8 v8, v8, 0x1

    .line 53
    .line 54
    check-cast v10, Ldefpackage/kd3;

    .line 55
    .line 56
    iget-object v10, v10, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v10, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p0, v10}, Lcom/eddyizm/tempus/homemusic/WaveSession;->refOf(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    if-nez v10, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move-object v9, v10

    .line 68
    :goto_1
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-static {p1, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-eqz v10, :cond_5

    .line 90
    .line 91
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    check-cast v10, Ldefpackage/ut1;

    .line 96
    .line 97
    iget-object v10, v10, Ldefpackage/ut1;->a:Lcom/eddyizm/tempus/homemusic/WaveTrack;

    .line 98
    .line 99
    invoke-virtual {v10}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->getRef()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    if-nez v10, :cond_4

    .line 104
    .line 105
    move-object v10, v9

    .line 106
    :cond_4
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    invoke-virtual {v3, v4, v6}, Lcom/eddyizm/tempus/homemusic/WavePlan$Companion;->of(Ljava/util/List;Ljava/util/List;)Lcom/eddyizm/tempus/homemusic/WavePlan;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/WavePlan;->getAdd()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    new-instance v6, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-static {v4, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-eqz v8, :cond_6

    .line 136
    .line 137
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    check-cast v8, Ljava/lang/Number;

    .line 142
    .line 143
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    check-cast v8, Ldefpackage/ut1;

    .line 152
    .line 153
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_6
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getId()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    new-instance v8, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-static {v2, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    move v10, v7

    .line 175
    :goto_4
    if-ge v10, v9, :cond_7

    .line 176
    .line 177
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    add-int/lit8 v10, v10, 0x1

    .line 182
    .line 183
    check-cast v11, Ldefpackage/kd3;

    .line 184
    .line 185
    iget-object v11, v11, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v11, Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {p0, v11}, Lcom/eddyizm/tempus/homemusic/WaveSession;->refOf(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_7
    new-instance v9, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-static {p1, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    if-eqz v10, :cond_8

    .line 215
    .line 216
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    check-cast v10, Ldefpackage/ut1;

    .line 221
    .line 222
    iget-object v10, v10, Ldefpackage/ut1;->a:Lcom/eddyizm/tempus/homemusic/WaveTrack;

    .line 223
    .line 224
    invoke-virtual {v10}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->getRef()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_8
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/WavePlan;->getKeep()I

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    new-instance v10, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    const-string v11, "next "

    .line 239
    .line 240
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v4, ": ahead "

    .line 247
    .line 248
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v4, " \u2192 "

    .line 255
    .line 256
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string v4, " (kept "

    .line 263
    .line 264
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string p1, ")"

    .line 271
    .line 272
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    const-string v4, "HubWave"

    .line 280
    .line 281
    invoke-static {v4, p1}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/WavePlan;->getRemove()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    if-eqz p1, :cond_9

    .line 293
    .line 294
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    if-eqz p1, :cond_9

    .line 299
    .line 300
    goto/16 :goto_d

    .line 301
    .line 302
    :cond_9
    new-instance p1, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-static {v2, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    invoke-direct {p1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    move v8, v7

    .line 316
    :goto_6
    if-ge v8, v4, :cond_a

    .line 317
    .line 318
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    add-int/lit8 v8, v8, 0x1

    .line 323
    .line 324
    check-cast v9, Ldefpackage/kd3;

    .line 325
    .line 326
    iget-object v9, v9, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v9, Ljava/lang/Number;

    .line 329
    .line 330
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v9

    .line 338
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_a
    invoke-interface {v1}, Ldefpackage/qi3;->Q0()I

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    invoke-virtual {v3, p1, v4}, Lcom/eddyizm/tempus/homemusic/WavePlan;->insertAt(Ljava/util/List;I)I

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/WavePlan;->getRemove()Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-static {v3}, Ldefpackage/q40;->H0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_b

    .line 367
    .line 368
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, Ljava/lang/Number;

    .line 373
    .line 374
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    check-cast v4, Ldefpackage/kd3;

    .line 383
    .line 384
    iget-object v4, v4, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v4, Ljava/lang/Number;

    .line 387
    .line 388
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    add-int/lit8 v8, v4, 0x1

    .line 393
    .line 394
    invoke-static {v0, v4, v8}, Ldefpackage/bo2;->k(Ldefpackage/ao2;II)V

    .line 395
    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    if-eqz v2, :cond_c

    .line 403
    .line 404
    goto/16 :goto_d

    .line 405
    .line 406
    :cond_c
    new-instance v2, Ljava/util/ArrayList;

    .line 407
    .line 408
    invoke-static {v6, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    move v4, v7

    .line 420
    :goto_8
    if-ge v4, v3, :cond_d

    .line 421
    .line 422
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v8

    .line 426
    add-int/lit8 v4, v4, 0x1

    .line 427
    .line 428
    check-cast v8, Ldefpackage/ut1;

    .line 429
    .line 430
    iget-object v8, v8, Ldefpackage/ut1;->a:Lcom/eddyizm/tempus/homemusic/WaveTrack;

    .line 431
    .line 432
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    goto :goto_8

    .line 436
    :cond_d
    invoke-virtual {p0, v2}, Lcom/eddyizm/tempus/homemusic/WaveSession;->register(Ljava/util/List;)Ljava/util/List;

    .line 437
    .line 438
    .line 439
    sget-object v2, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 440
    .line 441
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->ids()Ljava/util/Set;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    check-cast v2, Ljava/lang/Iterable;

    .line 446
    .line 447
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 448
    .line 449
    invoke-static {v2, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    invoke-static {v4}, Ldefpackage/lg2;->W(I)I

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    const/16 v8, 0x10

    .line 458
    .line 459
    if-ge v4, v8, :cond_e

    .line 460
    .line 461
    move v4, v8

    .line 462
    :cond_e
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 463
    .line 464
    .line 465
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    if-eqz v4, :cond_f

    .line 474
    .line 475
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    move-object v8, v4

    .line 480
    check-cast v8, Ljava/lang/String;

    .line 481
    .line 482
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getContext()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v8

    .line 486
    invoke-interface {v3, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    goto :goto_9

    .line 490
    :cond_f
    invoke-static {p0}, Lcom/eddyizm/tempus/homemusic/b;->g(Lcom/eddyizm/tempus/homemusic/WaveSession;)Ljava/util/Map;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    invoke-static {v3, p0}, Ldefpackage/rs1;->b(Ljava/util/LinkedHashMap;Ljava/util/Map;)V

    .line 495
    .line 496
    .line 497
    invoke-interface {v1}, Ldefpackage/qi3;->g()I

    .line 498
    .line 499
    .line 500
    move-result p0

    .line 501
    const/4 v2, 0x4

    .line 502
    if-ne p0, v2, :cond_10

    .line 503
    .line 504
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 505
    .line 506
    .line 507
    move-result-wide v2

    .line 508
    sget-wide v8, Lcom/eddyizm/tempus/homemusic/b;->d:J

    .line 509
    .line 510
    sub-long/2addr v2, v8

    .line 511
    const-wide/32 v8, 0x493e0

    .line 512
    .line 513
    .line 514
    cmp-long p0, v2, v8

    .line 515
    .line 516
    if-lez p0, :cond_10

    .line 517
    .line 518
    const/4 p0, 0x1

    .line 519
    goto :goto_a

    .line 520
    :cond_10
    move p0, v7

    .line 521
    :goto_a
    new-instance v2, Ljava/util/ArrayList;

    .line 522
    .line 523
    invoke-static {v6, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    move v4, v7

    .line 535
    :goto_b
    if-ge v4, v3, :cond_11

    .line 536
    .line 537
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    add-int/lit8 v4, v4, 0x1

    .line 542
    .line 543
    check-cast v8, Ldefpackage/ut1;

    .line 544
    .line 545
    iget-object v8, v8, Ldefpackage/ut1;->b:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 546
    .line 547
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    goto :goto_b

    .line 551
    :cond_11
    new-instance v3, Ljava/util/ArrayList;

    .line 552
    .line 553
    invoke-static {v6, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    :goto_c
    if-ge v7, v4, :cond_12

    .line 565
    .line 566
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    add-int/lit8 v7, v7, 0x1

    .line 571
    .line 572
    check-cast v5, Ldefpackage/ut1;

    .line 573
    .line 574
    iget-object v5, v5, Ldefpackage/ut1;->c:Ldefpackage/gn2;

    .line 575
    .line 576
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    goto :goto_c

    .line 580
    :cond_12
    invoke-static {v0, p1, v2, v3}, Ldefpackage/bo2;->h(Ldefpackage/ao2;ILjava/util/List;Ljava/util/List;)V

    .line 581
    .line 582
    .line 583
    if-nez p0, :cond_13

    .line 584
    .line 585
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 586
    .line 587
    .line 588
    move-result p0

    .line 589
    invoke-static {v1, p1, p0}, Ldefpackage/is3;->b(Ldefpackage/qi3;II)V

    .line 590
    .line 591
    .line 592
    :cond_13
    :goto_d
    return-void
.end method

.method public static c()V
    .locals 9

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->b:Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getInFlight()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setAgain(Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-static {v0}, Lcom/eddyizm/tempus/homemusic/b;->j(Lcom/eddyizm/tempus/homemusic/WaveSession;)Ldefpackage/qi3;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_2
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->e()V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Lcom/eddyizm/tempus/homemusic/b;->a(Ldefpackage/qi3;Lcom/eddyizm/tempus/homemusic/WaveSession;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    new-instance v4, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/16 v5, 0xa

    .line 34
    .line 35
    invoke-static {v3, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const/4 v6, 0x0

    .line 47
    move v7, v6

    .line 48
    :goto_1
    if-ge v7, v5, :cond_3

    .line 49
    .line 50
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    add-int/lit8 v7, v7, 0x1

    .line 55
    .line 56
    check-cast v8, Ldefpackage/kd3;

    .line 57
    .line 58
    iget-object v8, v8, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v8, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {v0, v4}, Lcom/eddyizm/tempus/homemusic/WaveSession;->snapshot(Ljava/util/List;)Lcom/eddyizm/tempus/homemusic/WaveNextIn;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getId()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-interface {v1}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    iget-object v1, v1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    const/4 v1, 0x0

    .line 84
    :goto_2
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setAskedFor(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setInFlight(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v6}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setAgain(Z)V

    .line 91
    .line 92
    .line 93
    sget-object v1, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 94
    .line 95
    new-instance v2, Ldefpackage/v6;

    .line 96
    .line 97
    const/16 v5, 0x14

    .line 98
    .line 99
    invoke-direct {v2, v3, v4, v0, v5}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public static d(Landroid/view/View;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/Runnable;ZZ)V
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-eqz p3, :cond_1

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/eddyizm/tempus/homemusic/WaveSeeds;->INSTANCE:Lcom/eddyizm/tempus/homemusic/WaveSeeds;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/eddyizm/tempus/homemusic/WaveSeeds;->artist(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v0, Lcom/eddyizm/tempus/homemusic/WaveSeeds;->INSTANCE:Lcom/eddyizm/tempus/homemusic/WaveSeeds;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/WaveSeeds;->track(Ljava/lang/String;)Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-static {p1}, Ldefpackage/ur1;->b(Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Ldefpackage/tt1;

    .line 51
    .line 52
    invoke-direct {p1, p2, v0, p3, p4}, Ldefpackage/tt1;-><init>(Ljava/lang/Runnable;Ljava/util/Map;ZZ)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    :goto_1
    const/16 p1, 0x8

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static e()V
    .locals 2

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->c:Ldefpackage/u6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sput-object v0, Lcom/eddyizm/tempus/homemusic/b;->c:Ldefpackage/u6;

    .line 12
    .line 13
    return-void
.end method

.method public static f(Lcom/eddyizm/tempus/homemusic/WaveSession;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/eddyizm/tempus/homemusic/b;->j(Lcom/eddyizm/tempus/homemusic/WaveSession;)Ldefpackage/qi3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Ldefpackage/rs3;->a:Ldefpackage/rs3;

    .line 9
    .line 10
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, p0}, Ldefpackage/rs3;->c(Landroid/content/Context;Ldefpackage/qi3;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static g(Lcom/eddyizm/tempus/homemusic/WaveSession;)Ljava/util/Map;
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/k62;->c:Ldefpackage/ux3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getContext()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "wave"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ldefpackage/gi1;->P(Ljava/lang/String;Ljava/lang/String;)Ldefpackage/k62;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->ids()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/Iterable;

    .line 23
    .line 24
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    const/16 v2, 0xa

    .line 27
    .line 28
    invoke-static {p0, v2}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v2}, Ldefpackage/lg2;->W(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/16 v3, 0x10

    .line 37
    .line 38
    if-ge v2, v3, :cond_1

    .line 39
    .line 40
    move v2, v3

    .line 41
    :cond_1
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    move-object v3, v2

    .line 59
    check-cast v3, Ljava/lang/String;

    .line 60
    .line 61
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return-object v1
.end method

.method public static final h(Ldefpackage/qi3;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->b:Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-interface {p0}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->isWave(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 v0, 0x1

    .line 24
    if-ne p0, v0, :cond_1

    .line 25
    .line 26
    return v0

    .line 27
    :cond_1
    return v1
.end method

.method public static i(Lcom/eddyizm/tempus/ui/activity/MainActivity;Lcom/eddyizm/tempus/homemusic/WaveOut;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/WaveOut;->getSessionId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v0, v1

    .line 22
    :goto_0
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/WaveOut;->getTracks()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    sget-object v2, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 29
    .line 30
    :cond_1
    const/4 v3, 0x0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->e()V

    .line 41
    .line 42
    .line 43
    new-instance v4, Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/WaveOut;->getTitle()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/WaveOut;->getSeed()Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/WaveOut;->getMode()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {v4, v0, v5, v6, p1}, Lcom/eddyizm/tempus/homemusic/WaveSession;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v2}, Lcom/eddyizm/tempus/homemusic/WaveSession;->register(Ljava/util/List;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    sput-object v4, Lcom/eddyizm/tempus/homemusic/b;->b:Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 64
    .line 65
    sget-object p1, Ldefpackage/ms1;->a:Ljava/util/concurrent/ExecutorService;

    .line 66
    .line 67
    new-instance p1, Ljava/util/ArrayList;

    .line 68
    .line 69
    const/16 v0, 0xa

    .line 70
    .line 71
    invoke-static {v2, v0}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Lcom/eddyizm/tempus/homemusic/WaveTrack;

    .line 93
    .line 94
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getContext()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v2, v5}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->item(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-static {p0, p1, v3, v1}, Ldefpackage/ms1;->a(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/util/List;ILjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_4
    :goto_2
    const p1, 0x7f13025f

    .line 111
    .line 112
    .line 113
    invoke-static {p0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public static j(Lcom/eddyizm/tempus/homemusic/WaveSession;)Ldefpackage/qi3;
    .locals 3

    .line 1
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ldefpackage/ao2;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-interface {v0}, Ldefpackage/ao2;->b()Ldefpackage/qi3;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-interface {v0}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget-object v2, v2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object v2, v1

    .line 38
    :goto_0
    invoke-virtual {p0, v2}, Lcom/eddyizm/tempus/homemusic/WaveSession;->isWave(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_3
    :goto_1
    return-object v1
.end method

.method public static k(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p1, v1}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/eddyizm/tempus/homemusic/WaveTrack;

    .line 27
    .line 28
    invoke-virtual {v2, p0}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->item(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget-object p0, Ldefpackage/ms1;->a:Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    invoke-static {v0}, Ldefpackage/ms1;->b(Ljava/util/List;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x0

    .line 52
    move v3, v2

    .line 53
    :goto_1
    if-ge v3, v1, :cond_5

    .line 54
    .line 55
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    add-int/lit8 v5, v2, 0x1

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    if-ltz v2, :cond_4

    .line 65
    .line 66
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 67
    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_1
    invoke-static {v4}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-static {v7}, Ldefpackage/gi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-static {v7}, Ldefpackage/q40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, Ldefpackage/gn2;

    .line 84
    .line 85
    if-nez v7, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    new-instance v6, Ldefpackage/ut1;

    .line 89
    .line 90
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Lcom/eddyizm/tempus/homemusic/WaveTrack;

    .line 95
    .line 96
    invoke-direct {v6, v2, v4, v7}, Ldefpackage/ut1;-><init>(Lcom/eddyizm/tempus/homemusic/WaveTrack;Lcom/eddyizm/tempus/subsonic/models/Child;Ldefpackage/gn2;)V

    .line 97
    .line 98
    .line 99
    :goto_2
    if-eqz v6, :cond_3

    .line 100
    .line 101
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_3
    move v2, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_4
    invoke-static {}, Ldefpackage/gb;->c0()V

    .line 107
    .line 108
    .line 109
    throw v6

    .line 110
    :cond_5
    return-object v0
.end method

.method public static l(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/util/Map;Ldefpackage/k6;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, 0x7f130261

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 13
    .line 14
    .line 15
    sget-object v0, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    new-instance v1, Ldefpackage/t6;

    .line 18
    .line 19
    const/16 v6, 0xa

    .line 20
    .line 21
    move-object v4, p0

    .line 22
    move-object v2, p1

    .line 23
    move-object v5, p2

    .line 24
    move-object v3, p3

    .line 25
    invoke-direct/range {v1 .. v6}, Ldefpackage/t6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final m(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "nd_artist_id"

    .line 11
    .line 12
    invoke-static {v0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-static {p0, p1, v0, p2}, Lcom/eddyizm/tempus/homemusic/b;->l(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/util/Map;Ldefpackage/k6;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
