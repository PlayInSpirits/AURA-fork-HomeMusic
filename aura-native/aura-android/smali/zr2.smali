.class public final synthetic Lzr2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwc0;
.implements Lit2;
.implements Lht2;
.implements Leg1;
.implements Lkv1;
.implements Loz2;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lzr2;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    iput p1, p0, Lzr2;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljn2;)V
    .locals 0

    .line 10
    const/16 p1, 0x13

    iput p1, p0, Lzr2;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(ILjava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method


# virtual methods
.method public a(Landroid/animation/ValueAnimator;Landroid/view/View;)V
    .locals 0

    .line 1
    iget p0, p0, Lzr2;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/lang/Float;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {p2, p0}, Landroid/view/View;->setTranslationY(F)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Float;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {p2, p0}, Landroid/view/View;->setTranslationX(F)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p0, p0, Lzr2;->n:I

    .line 2
    .line 3
    check-cast p1, Lal3;

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    invoke-virtual {p1}, Lal3;->r()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_1
    invoke-virtual {p1}, Lal3;->b()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_2
    invoke-virtual {p1}, Lal3;->C()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_3
    invoke-virtual {p1}, Lal3;->a0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_4
    invoke-virtual {p1}, Lal3;->stop()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_5
    invoke-virtual {p1}, Lal3;->G()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_6
    invoke-virtual {p1}, Lal3;->H0()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_7
    invoke-virtual {p1}, Lal3;->I0()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_8
    invoke-virtual {p1}, Lal3;->A()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_9
    invoke-virtual {p1}, Lal3;->S()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_a
    invoke-virtual {p1}, Lal3;->J0()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_b
    invoke-virtual {p1}, Lal3;->C0()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_c
    invoke-virtual {p1}, Lal3;->c0()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_d
    invoke-virtual {p1}, Lal3;->c()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_e
    invoke-virtual {p1}, Lal3;->A0()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget p0, p0, Lzr2;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lpv4;

    .line 9
    .line 10
    return-object p1

    .line 11
    :pswitch_0
    check-cast p1, Lno2;

    .line 12
    .line 13
    invoke-interface {p1}, Lno2;->n()Ltv4;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object p0, p0, Ltv4;->b:Lgy3;

    .line 18
    .line 19
    new-instance p1, Ltb4;

    .line 20
    .line 21
    const/16 v0, 0xa

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ltb4;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p0}, Lhw;->P(Leg1;Ljava/util/List;)Ljava/util/AbstractList;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_1
    check-cast p1, Llg0;

    .line 36
    .line 37
    iget-wide p0, p1, Llg0;->c:J

    .line 38
    .line 39
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_2
    check-cast p1, Llg0;

    .line 45
    .line 46
    iget-wide p0, p1, Llg0;->b:J

    .line 47
    .line 48
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_3
    check-cast p1, Ljava/util/Collection;

    .line 54
    .line 55
    sget p0, Lhx1;->q:I

    .line 56
    .line 57
    instance-of p0, p1, Lhx1;

    .line 58
    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    check-cast p1, Lhx1;

    .line 62
    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_0
    new-instance p0, Lfx1;

    .line 66
    .line 67
    instance-of v2, p1, Lhx1;

    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    move-object v3, p1

    .line 72
    check-cast v3, Lhx1;

    .line 73
    .line 74
    check-cast v3, Lmy3;

    .line 75
    .line 76
    invoke-virtual {v3}, Lmy3;->i()Ljx1;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lgx1;

    .line 81
    .line 82
    invoke-virtual {v3}, Lgx1;->size()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const/16 v3, 0xb

    .line 88
    .line 89
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-boolean v0, p0, Lfx1;->b:Z

    .line 93
    .line 94
    new-instance v4, Lq73;

    .line 95
    .line 96
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v3}, Lq73;->d(I)V

    .line 100
    .line 101
    .line 102
    iput-object v4, p0, Lfx1;->a:Lq73;

    .line 103
    .line 104
    if-eqz v2, :cond_6

    .line 105
    .line 106
    check-cast p1, Lhx1;

    .line 107
    .line 108
    instance-of v2, p1, Lmy3;

    .line 109
    .line 110
    if-eqz v2, :cond_2

    .line 111
    .line 112
    move-object v2, p1

    .line 113
    check-cast v2, Lmy3;

    .line 114
    .line 115
    iget-object v2, v2, Lmy3;->r:Lq73;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    const/4 v2, 0x0

    .line 119
    :goto_1
    if-eqz v2, :cond_5

    .line 120
    .line 121
    iget p1, v4, Lq73;->c:I

    .line 122
    .line 123
    iget v3, v2, Lq73;->c:I

    .line 124
    .line 125
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-virtual {v4, p1}, Lq73;->a(I)V

    .line 130
    .line 131
    .line 132
    iget p1, v2, Lq73;->c:I

    .line 133
    .line 134
    const/4 v3, -0x1

    .line 135
    if-nez p1, :cond_4

    .line 136
    .line 137
    :cond_3
    move v0, v3

    .line 138
    :cond_4
    :goto_2
    if-ltz v0, :cond_7

    .line 139
    .line 140
    iget p1, v2, Lq73;->c:I

    .line 141
    .line 142
    invoke-static {v0, p1}, Lrr2;->q(II)V

    .line 143
    .line 144
    .line 145
    iget-object p1, v2, Lq73;->a:[Ljava/lang/Object;

    .line 146
    .line 147
    aget-object p1, p1, v0

    .line 148
    .line 149
    iget v4, v2, Lq73;->c:I

    .line 150
    .line 151
    invoke-static {v0, v4}, Lrr2;->q(II)V

    .line 152
    .line 153
    .line 154
    iget-object v4, v2, Lq73;->b:[I

    .line 155
    .line 156
    aget v4, v4, v0

    .line 157
    .line 158
    invoke-virtual {p0, v4, p1}, Lfx1;->c(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v0, v0, 0x1

    .line 162
    .line 163
    iget p1, v2, Lq73;->c:I

    .line 164
    .line 165
    if-ge v0, p1, :cond_3

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_5
    invoke-virtual {p1}, Lhx1;->j()Ljx1;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iget-object v2, p0, Lfx1;->a:Lq73;

    .line 173
    .line 174
    iget v3, v2, Lq73;->c:I

    .line 175
    .line 176
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-virtual {v2, v0}, Lq73;->a(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Lhx1;->j()Ljx1;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_7

    .line 200
    .line 201
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Lp73;

    .line 206
    .line 207
    iget-object v2, v0, Lp73;->a:Ljava/lang/Object;

    .line 208
    .line 209
    invoke-virtual {v0}, Lp73;->a()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    invoke-virtual {p0, v0, v2}, Lfx1;->c(ILjava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_7

    .line 226
    .line 227
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {p0, v0}, Lfx1;->a(Ljava/lang/Object;)Lqw1;

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_7
    iget-object p1, p0, Lfx1;->a:Lq73;

    .line 236
    .line 237
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    iget-object p1, p0, Lfx1;->a:Lq73;

    .line 241
    .line 242
    iget p1, p1, Lq73;->c:I

    .line 243
    .line 244
    if-nez p1, :cond_8

    .line 245
    .line 246
    sget-object p1, Lmy3;->u:Lmy3;

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_8
    iput-boolean v1, p0, Lfx1;->b:Z

    .line 250
    .line 251
    new-instance p1, Lmy3;

    .line 252
    .line 253
    iget-object p0, p0, Lfx1;->a:Lq73;

    .line 254
    .line 255
    invoke-direct {p1, p0}, Lmy3;-><init>(Lq73;)V

    .line 256
    .line 257
    .line 258
    :goto_5
    return-object p1

    .line 259
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 260
    .line 261
    sget-object p0, Liu2;->g:Ln10;

    .line 262
    .line 263
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    sub-int/2addr v2, v1

    .line 271
    :goto_6
    if-ltz v2, :cond_a

    .line 272
    .line 273
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    invoke-virtual {p0, v3}, Ln10;->c(C)Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-nez v3, :cond_9

    .line 282
    .line 283
    move v1, v0

    .line 284
    goto :goto_7

    .line 285
    :cond_9
    add-int/lit8 v2, v2, -0x1

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_a
    :goto_7
    if-eqz v1, :cond_b

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result p0

    .line 294
    if-nez p0, :cond_b

    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    add-int/lit8 v1, v1, 0x10

    .line 304
    .line 305
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 306
    .line 307
    .line 308
    const/16 v1, 0x22

    .line 309
    .line 310
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    :goto_8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-ge v0, v2, :cond_e

    .line 318
    .line 319
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    const/16 v3, 0xd

    .line 324
    .line 325
    const/16 v4, 0x5c

    .line 326
    .line 327
    if-eq v2, v3, :cond_c

    .line 328
    .line 329
    if-eq v2, v4, :cond_c

    .line 330
    .line 331
    if-ne v2, v1, :cond_d

    .line 332
    .line 333
    :cond_c
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    :cond_d
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    add-int/lit8 v0, v0, 0x1

    .line 340
    .line 341
    goto :goto_8

    .line 342
    :cond_e
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    :goto_9
    return-object p1

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lal3;Lfr2;Ljava/util/List;)V
    .locals 0

    .line 1
    iget p0, p0, Lzr2;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p3}, Lal3;->w0(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1, p3}, Lal3;->w0(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public d(IIIII)Z
    .locals 2

    .line 1
    const/16 p0, 0x43

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x4d

    .line 5
    .line 6
    if-ne p2, p0, :cond_0

    .line 7
    .line 8
    const/16 p0, 0x4f

    .line 9
    .line 10
    if-ne p3, p0, :cond_0

    .line 11
    .line 12
    if-ne p4, v1, :cond_0

    .line 13
    .line 14
    if-eq p5, v1, :cond_1

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    :cond_0
    if-ne p2, v1, :cond_2

    .line 19
    .line 20
    const/16 p0, 0x4c

    .line 21
    .line 22
    if-ne p3, p0, :cond_2

    .line 23
    .line 24
    if-ne p4, p0, :cond_2

    .line 25
    .line 26
    const/16 p0, 0x54

    .line 27
    .line 28
    if-eq p5, p0, :cond_1

    .line 29
    .line 30
    if-ne p1, v0, :cond_2

    .line 31
    .line 32
    :cond_1
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_2
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public h(Ltn2;Lfr2;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lzr2;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Ltn2;->w(Lfr2;)Lmw1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p1, Ltn2;->D:Lpq;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ltn2;->B(Lfr2;)Lfr2;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 p0, -0x6

    .line 20
    invoke-static {p0}, Lm92;->b(I)Lm92;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance p3, Lmw1;

    .line 25
    .line 26
    invoke-direct {p3, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lsn2;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, p1, p3, p2, v0}, Lsn2;-><init>(Ltn2;Lmw1;Lfr2;I)V

    .line 33
    .line 34
    .line 35
    new-instance p2, Lrn2;

    .line 36
    .line 37
    invoke-direct {p2, p1, v0}, Lrn2;-><init>(Ltn2;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3, p0, p2}, Lmw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 41
    .line 42
    .line 43
    return-object p3

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method
