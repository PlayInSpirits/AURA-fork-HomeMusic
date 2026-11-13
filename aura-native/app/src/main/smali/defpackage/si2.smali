.class public final synthetic Ldefpackage/si2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/ti2;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ti2;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/si2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/si2;->o:Ldefpackage/ti2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/si2;->n:I

    .line 2
    .line 3
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/si2;->o:Ldefpackage/ti2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/ti2;->s:Ldefpackage/f72;

    .line 11
    .line 12
    invoke-virtual {v0}, Ldefpackage/f72;->a()Ldefpackage/f63;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v2, v2, Ldefpackage/f63;->J:Ldefpackage/f63;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget-object v2, v2, Ldefpackage/cf2;->C:Ldefpackage/df2;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v2, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 25
    .line 26
    invoke-static {v2}, Ldefpackage/h12;->L(Ldefpackage/c72;)Ldefpackage/ub3;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ldefpackage/ra;

    .line 31
    .line 32
    invoke-virtual {v2}, Ldefpackage/ra;->getPlacementScope()Ldefpackage/ig3;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :cond_1
    iget-object v3, p0, Ldefpackage/ti2;->Q:Ldefpackage/if1;

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Ldefpackage/f72;->a()Ldefpackage/f63;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-wide v3, p0, Ldefpackage/ti2;->R:J

    .line 45
    .line 46
    iget p0, p0, Ldefpackage/ti2;->S:F

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v0}, Ldefpackage/ig3;->a(Ldefpackage/ig3;Ldefpackage/jg3;)V

    .line 52
    .line 53
    .line 54
    iget-wide v5, v0, Ldefpackage/jg3;->r:J

    .line 55
    .line 56
    invoke-static {v3, v4, v5, v6}, Ldefpackage/g02;->c(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-virtual {v0, v2, v3, p0, v4}, Ldefpackage/jg3;->N(JFLdefpackage/if1;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v0}, Ldefpackage/f72;->a()Ldefpackage/f63;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-wide v4, p0, Ldefpackage/ti2;->R:J

    .line 70
    .line 71
    iget p0, p0, Ldefpackage/ti2;->S:F

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v0}, Ldefpackage/ig3;->a(Ldefpackage/ig3;Ldefpackage/jg3;)V

    .line 77
    .line 78
    .line 79
    iget-wide v6, v0, Ldefpackage/jg3;->r:J

    .line 80
    .line 81
    invoke-static {v4, v5, v6, v7}, Ldefpackage/g02;->c(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    invoke-virtual {v0, v4, v5, p0, v3}, Ldefpackage/jg3;->N(JFLdefpackage/if1;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    return-object v1

    .line 89
    :pswitch_0
    iget-object v0, p0, Ldefpackage/ti2;->s:Ldefpackage/f72;

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    iput v2, v0, Ldefpackage/f72;->i:I

    .line 93
    .line 94
    iget-object v0, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 95
    .line 96
    invoke-virtual {v0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget-object v4, v3, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 101
    .line 102
    iget v3, v3, Ldefpackage/f13;->p:I

    .line 103
    .line 104
    move v5, v2

    .line 105
    :goto_1
    const v6, 0x7fffffff

    .line 106
    .line 107
    .line 108
    if-ge v5, v3, :cond_4

    .line 109
    .line 110
    aget-object v7, v4, v5

    .line 111
    .line 112
    check-cast v7, Ldefpackage/c72;

    .line 113
    .line 114
    iget-object v7, v7, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 115
    .line 116
    iget-object v7, v7, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 117
    .line 118
    iget v8, v7, Ldefpackage/ti2;->v:I

    .line 119
    .line 120
    iput v8, v7, Ldefpackage/ti2;->u:I

    .line 121
    .line 122
    iput v6, v7, Ldefpackage/ti2;->v:I

    .line 123
    .line 124
    iput-boolean v2, v7, Ldefpackage/ti2;->D:Z

    .line 125
    .line 126
    iget-object v6, v7, Ldefpackage/ti2;->y:Ldefpackage/a72;

    .line 127
    .line 128
    sget-object v8, Ldefpackage/a72;->o:Ldefpackage/a72;

    .line 129
    .line 130
    if-ne v6, v8, :cond_3

    .line 131
    .line 132
    sget-object v6, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 133
    .line 134
    iput-object v6, v7, Ldefpackage/ti2;->y:Ldefpackage/a72;

    .line 135
    .line 136
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    invoke-virtual {v0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iget-object v4, v3, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 144
    .line 145
    iget v3, v3, Ldefpackage/f13;->p:I

    .line 146
    .line 147
    move v5, v2

    .line 148
    :goto_2
    if-ge v5, v3, :cond_5

    .line 149
    .line 150
    aget-object v7, v4, v5

    .line 151
    .line 152
    check-cast v7, Ldefpackage/c72;

    .line 153
    .line 154
    iget-object v7, v7, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 155
    .line 156
    iget-object v7, v7, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 157
    .line 158
    iget-object v7, v7, Ldefpackage/ti2;->H:Ldefpackage/d72;

    .line 159
    .line 160
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    add-int/lit8 v5, v5, 0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_5
    invoke-virtual {p0}, Ldefpackage/ti2;->c()Ldefpackage/iz1;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    iget-boolean v3, v3, Ldefpackage/cf2;->B:Z

    .line 171
    .line 172
    if-eqz v3, :cond_6

    .line 173
    .line 174
    invoke-virtual {v0}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, Ldefpackage/c13;

    .line 179
    .line 180
    iget-object v4, v3, Ldefpackage/c13;->n:Ldefpackage/f13;

    .line 181
    .line 182
    iget v4, v4, Ldefpackage/f13;->p:I

    .line 183
    .line 184
    move v5, v2

    .line 185
    :goto_3
    if-ge v5, v4, :cond_6

    .line 186
    .line 187
    invoke-virtual {v3, v5}, Ldefpackage/c13;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    check-cast v7, Ldefpackage/c72;

    .line 192
    .line 193
    iget-object v7, v7, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 194
    .line 195
    iget-object v7, v7, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v7, Ldefpackage/f63;

    .line 198
    .line 199
    const/4 v8, 0x1

    .line 200
    iput-boolean v8, v7, Ldefpackage/cf2;->B:Z

    .line 201
    .line 202
    add-int/lit8 v5, v5, 0x1

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_6
    invoke-virtual {p0}, Ldefpackage/ti2;->c()Ldefpackage/iz1;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {v3}, Ldefpackage/f63;->h0()Ldefpackage/vi2;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-interface {v3}, Ldefpackage/vi2;->c()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Ldefpackage/ti2;->c()Ldefpackage/iz1;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    iget-boolean p0, p0, Ldefpackage/cf2;->B:Z

    .line 221
    .line 222
    if-eqz p0, :cond_7

    .line 223
    .line 224
    invoke-virtual {v0}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    check-cast p0, Ldefpackage/c13;

    .line 229
    .line 230
    iget-object v3, p0, Ldefpackage/c13;->n:Ldefpackage/f13;

    .line 231
    .line 232
    iget v3, v3, Ldefpackage/f13;->p:I

    .line 233
    .line 234
    move v4, v2

    .line 235
    :goto_4
    if-ge v4, v3, :cond_7

    .line 236
    .line 237
    invoke-virtual {p0, v4}, Ldefpackage/c13;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    check-cast v5, Ldefpackage/c72;

    .line 242
    .line 243
    iget-object v5, v5, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 244
    .line 245
    iget-object v5, v5, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v5, Ldefpackage/f63;

    .line 248
    .line 249
    iput-boolean v2, v5, Ldefpackage/cf2;->B:Z

    .line 250
    .line 251
    add-int/lit8 v4, v4, 0x1

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_7
    invoke-virtual {v0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    iget-object v3, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 259
    .line 260
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 261
    .line 262
    move v4, v2

    .line 263
    :goto_5
    if-ge v4, p0, :cond_b

    .line 264
    .line 265
    aget-object v5, v3, v4

    .line 266
    .line 267
    check-cast v5, Ldefpackage/c72;

    .line 268
    .line 269
    iget-object v7, v5, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 270
    .line 271
    iget-object v8, v7, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 272
    .line 273
    iget v8, v8, Ldefpackage/ti2;->u:I

    .line 274
    .line 275
    invoke-virtual {v5}, Ldefpackage/c72;->u()I

    .line 276
    .line 277
    .line 278
    move-result v9

    .line 279
    if-eq v8, v9, :cond_a

    .line 280
    .line 281
    invoke-virtual {v0}, Ldefpackage/c72;->N()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Ldefpackage/c72;->B()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5}, Ldefpackage/c72;->u()I

    .line 288
    .line 289
    .line 290
    move-result v8

    .line 291
    if-ne v8, v6, :cond_a

    .line 292
    .line 293
    iget-boolean v8, v7, Ldefpackage/f72;->c:Z

    .line 294
    .line 295
    if-nez v8, :cond_8

    .line 296
    .line 297
    invoke-static {v5}, Ldefpackage/h12;->A(Ldefpackage/c72;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-eqz v5, :cond_9

    .line 302
    .line 303
    :cond_8
    iget-object v5, v7, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 304
    .line 305
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v5, v2}, Ldefpackage/if2;->X(Z)V

    .line 309
    .line 310
    .line 311
    :cond_9
    iget-object v5, v7, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 312
    .line 313
    invoke-virtual {v5}, Ldefpackage/ti2;->Z()V

    .line 314
    .line 315
    .line 316
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_b
    invoke-virtual {v0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    iget-object v0, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 324
    .line 325
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 326
    .line 327
    move v3, v2

    .line 328
    :goto_6
    if-ge v3, p0, :cond_c

    .line 329
    .line 330
    aget-object v4, v0, v3

    .line 331
    .line 332
    check-cast v4, Ldefpackage/c72;

    .line 333
    .line 334
    iget-object v4, v4, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 335
    .line 336
    iget-object v4, v4, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 337
    .line 338
    iget-object v4, v4, Ldefpackage/ti2;->H:Ldefpackage/d72;

    .line 339
    .line 340
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    iput-boolean v2, v4, Ldefpackage/d72;->c:Z

    .line 344
    .line 345
    add-int/lit8 v3, v3, 0x1

    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_c
    return-object v1

    .line 349
    :pswitch_1
    iget-object v0, p0, Ldefpackage/ti2;->s:Ldefpackage/f72;

    .line 350
    .line 351
    invoke-virtual {v0}, Ldefpackage/f72;->a()Ldefpackage/f63;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    iget-wide v2, p0, Ldefpackage/ti2;->L:J

    .line 356
    .line 357
    invoke-interface {v0, v2, v3}, Ldefpackage/pi2;->r(J)Ldefpackage/jg3;

    .line 358
    .line 359
    .line 360
    return-object v1

    .line 361
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
