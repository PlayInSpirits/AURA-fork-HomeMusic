.class public final synthetic Le82;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxf1;


# instance fields
.field public final synthetic n:Lq82;

.field public final synthetic o:Ldx2;

.field public final synthetic p:Lpc3;

.field public final synthetic q:Lb13;


# direct methods
.method public synthetic constructor <init>(Lq82;Ldx2;Lpc3;Lb13;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le82;->n:Lq82;

    .line 5
    .line 6
    iput-object p2, p0, Le82;->o:Ldx2;

    .line 7
    .line 8
    iput-object p3, p0, Le82;->p:Lpc3;

    .line 9
    .line 10
    iput-object p4, p0, Le82;->q:Lb13;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Lu44;

    .line 2
    .line 3
    check-cast p2, Lrg1;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lrg1;->H()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    sget-object v0, Lj80;->a:Li80;

    .line 15
    .line 16
    if-ne p3, v0, :cond_0

    .line 17
    .line 18
    new-instance p3, Lc82;

    .line 19
    .line 20
    new-instance v1, Lwc;

    .line 21
    .line 22
    const/16 v2, 0xc

    .line 23
    .line 24
    iget-object v3, p0, Le82;->q:Lb13;

    .line 25
    .line 26
    invoke-direct {v1, v2, v3}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p3, p1, v1}, Lc82;-><init>(Lu44;Lwc;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p3}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    move-object v3, p3

    .line 36
    check-cast v3, Lc82;

    .line 37
    .line 38
    invoke-virtual {p2}, Lrg1;->H()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_1

    .line 43
    .line 44
    new-instance p1, Lkn4;

    .line 45
    .line 46
    new-instance p3, Lwo0;

    .line 47
    .line 48
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v3, p3, Lwo0;->n:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object v1, Lr73;->a:Lp03;

    .line 54
    .line 55
    new-instance v1, Lp03;

    .line 56
    .line 57
    invoke-direct {v1}, Lp03;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v1, p3, Lwo0;->o:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-direct {p1, p3}, Lkn4;-><init>(Lwo0;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p1}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    move-object v4, p1

    .line 69
    check-cast v4, Lkn4;

    .line 70
    .line 71
    const/4 p1, 0x4

    .line 72
    iget-object v2, p0, Le82;->n:Lq82;

    .line 73
    .line 74
    const/4 p3, 0x0

    .line 75
    if-eqz v2, :cond_d

    .line 76
    .line 77
    const v1, 0x67eb8deb

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v1}, Lrg1;->R(I)V

    .line 81
    .line 82
    .line 83
    const v1, 0x34e696b7

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v1}, Lrg1;->R(I)V

    .line 87
    .line 88
    .line 89
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    const-string v5, "robolectric"

    .line 94
    .line 95
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    const v1, 0x503371a7

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, v1}, Lrg1;->R(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Lrg1;->H()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-ne v1, v0, :cond_2

    .line 112
    .line 113
    new-instance v1, Lxp3;

    .line 114
    .line 115
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, v1}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_2
    check-cast v1, Lxp3;

    .line 122
    .line 123
    invoke-virtual {p2, p3}, Lrg1;->o(Z)V

    .line 124
    .line 125
    .line 126
    :goto_0
    move-object v5, v1

    .line 127
    goto :goto_2

    .line 128
    :cond_3
    const v1, 0x503633a1

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v1}, Lrg1;->R(I)V

    .line 132
    .line 133
    .line 134
    sget-object v1, Lhb;->f:Lwl4;

    .line 135
    .line 136
    invoke-virtual {p2, v1}, Lrg1;->i(Lqr3;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Landroid/view/View;

    .line 141
    .line 142
    invoke-virtual {p2, v1}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-virtual {p2}, Lrg1;->H()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    if-nez v5, :cond_4

    .line 151
    .line 152
    if-ne v6, v0, :cond_7

    .line 153
    .line 154
    :cond_4
    const v5, 0x7f0a0161

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    instance-of v7, v6, Lwp3;

    .line 162
    .line 163
    if-eqz v7, :cond_5

    .line 164
    .line 165
    check-cast v6, Lwp3;

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_5
    const/4 v6, 0x0

    .line 169
    :goto_1
    if-nez v6, :cond_6

    .line 170
    .line 171
    new-instance v6, Lsc;

    .line 172
    .line 173
    invoke-direct {v6, v1}, Lsc;-><init>(Landroid/view/View;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_6
    invoke-virtual {p2, v6}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_7
    move-object v1, v6

    .line 183
    check-cast v1, Lwp3;

    .line 184
    .line 185
    invoke-virtual {p2, p3}, Lrg1;->o(Z)V

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :goto_2
    invoke-virtual {p2, p3}, Lrg1;->o(Z)V

    .line 190
    .line 191
    .line 192
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-virtual {p2, v2}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-virtual {p2, v3}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    or-int/2addr v1, v6

    .line 205
    invoke-virtual {p2, v4}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    or-int/2addr v1, v6

    .line 210
    invoke-virtual {p2, v5}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    or-int/2addr v1, v6

    .line 215
    invoke-virtual {p2}, Lrg1;->H()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    if-nez v1, :cond_8

    .line 220
    .line 221
    if-ne v6, v0, :cond_9

    .line 222
    .line 223
    :cond_8
    new-instance v1, Lry1;

    .line 224
    .line 225
    const/4 v6, 0x1

    .line 226
    invoke-direct/range {v1 .. v6}, Lry1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, v1}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    move-object v6, v1

    .line 233
    :cond_9
    check-cast v6, Lif1;

    .line 234
    .line 235
    invoke-static {v7, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    array-length v5, v1

    .line 240
    invoke-virtual {p2, v5}, Lrg1;->d(I)Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    array-length v7, v1

    .line 245
    move v8, p3

    .line 246
    :goto_3
    if-ge v8, v7, :cond_a

    .line 247
    .line 248
    aget-object v9, v1, v8

    .line 249
    .line 250
    invoke-virtual {p2, v9}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    or-int/2addr v5, v9

    .line 255
    add-int/lit8 v8, v8, 0x1

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_a
    invoke-virtual {p2}, Lrg1;->H()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-nez v5, :cond_b

    .line 263
    .line 264
    if-ne v1, v0, :cond_c

    .line 265
    .line 266
    :cond_b
    new-instance v1, Lwr0;

    .line 267
    .line 268
    invoke-direct {v1, v6}, Lwr0;-><init>(Lif1;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p2, v1}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_c
    invoke-virtual {p2, p3}, Lrg1;->o(Z)V

    .line 275
    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_d
    const v1, 0x67f47fcd

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2, v1}, Lrg1;->R(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p2, p3}, Lrg1;->o(Z)V

    .line 285
    .line 286
    .line 287
    :goto_4
    sget p3, Lr82;->a:I

    .line 288
    .line 289
    iget-object p3, p0, Le82;->o:Ldx2;

    .line 290
    .line 291
    if-eqz v2, :cond_f

    .line 292
    .line 293
    new-instance v1, Lsx4;

    .line 294
    .line 295
    invoke-direct {v1, v2}, Lsx4;-><init>(Lq82;)V

    .line 296
    .line 297
    .line 298
    invoke-interface {p3, v1}, Ldx2;->c(Ldx2;)Ldx2;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    if-nez v1, :cond_e

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_e
    move-object p3, v1

    .line 306
    :cond_f
    :goto_5
    invoke-virtual {p2, v3}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    iget-object p0, p0, Le82;->p:Lpc3;

    .line 311
    .line 312
    invoke-virtual {p2, p0}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    or-int/2addr v1, v2

    .line 317
    invoke-virtual {p2}, Lrg1;->H()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    if-nez v1, :cond_10

    .line 322
    .line 323
    if-ne v2, v0, :cond_11

    .line 324
    .line 325
    :cond_10
    new-instance v2, Lib;

    .line 326
    .line 327
    invoke-direct {v2, p1, v3, p0}, Lib;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p2, v2}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :cond_11
    check-cast v2, Lwf1;

    .line 334
    .line 335
    const/16 p0, 0x8

    .line 336
    .line 337
    invoke-static {v4, p3, v2, p2, p0}, Lgn4;->a(Lkn4;Ldx2;Lwf1;Lrg1;I)V

    .line 338
    .line 339
    .line 340
    sget-object p0, Lj15;->a:Lj15;

    .line 341
    .line 342
    return-object p0
.end method
