.class public final synthetic Ldefpackage/a73;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/yf1;


# instance fields
.field public final synthetic n:Ldefpackage/lm0;

.field public final synthetic o:F

.field public final synthetic p:Ldefpackage/gf1;

.field public final synthetic q:Z

.field public final synthetic r:Landroid/net/Uri;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/lm0;FLdefpackage/gf1;ZLandroid/net/Uri;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/a73;->n:Ldefpackage/lm0;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/a73;->o:F

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/a73;->p:Ldefpackage/gf1;

    .line 9
    .line 10
    iput-boolean p4, p0, Ldefpackage/a73;->q:Z

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/a73;->r:Landroid/net/Uri;

    .line 13
    .line 14
    iput-object p6, p0, Ldefpackage/a73;->s:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Ldefpackage/a73;->t:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ldefpackage/rc3;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Ldefpackage/rg1;

    .line 10
    .line 11
    check-cast p4, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Ldefpackage/a73;->n:Ldefpackage/lm0;

    .line 21
    .line 22
    invoke-virtual {p1}, Ldefpackage/ad3;->k()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sub-int/2addr v0, p2

    .line 27
    int-to-float v0, v0

    .line 28
    invoke-virtual {p1}, Ldefpackage/ad3;->l()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-float/2addr v1, v0

    .line 33
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    const/high16 v2, 0x3f800000    # 1.0f

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Ldefpackage/gb;->l(FFF)F

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    sub-float v3, v2, v3

    .line 45
    .line 46
    sub-float v4, v2, v3

    .line 47
    .line 48
    const v5, 0x3f6b851f    # 0.92f

    .line 49
    .line 50
    .line 51
    mul-float/2addr v4, v5

    .line 52
    mul-float/2addr v3, v2

    .line 53
    add-float/2addr v3, v4

    .line 54
    invoke-static {v0, v1, v2}, Ldefpackage/gb;->l(FFF)F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sub-float v0, v2, v0

    .line 59
    .line 60
    sub-float v1, v2, v0

    .line 61
    .line 62
    const v4, 0x3f333333    # 0.7f

    .line 63
    .line 64
    .line 65
    mul-float/2addr v1, v4

    .line 66
    mul-float/2addr v0, v2

    .line 67
    add-float/2addr v0, v1

    .line 68
    sget-object v1, Ldefpackage/ji2;->b:Ldefpackage/d71;

    .line 69
    .line 70
    invoke-virtual {p3, v3}, Ldefpackage/rg1;->c(F)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {p3, v0}, Ldefpackage/rg1;->c(F)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    or-int/2addr v2, v4

    .line 79
    invoke-virtual {p3}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    sget-object v5, Ldefpackage/j80;->a:Ldefpackage/i80;

    .line 84
    .line 85
    if-nez v2, :cond_0

    .line 86
    .line 87
    if-ne v4, v5, :cond_1

    .line 88
    .line 89
    :cond_0
    new-instance v4, Ldefpackage/c73;

    .line 90
    .line 91
    invoke-direct {v4, v3, v0}, Ldefpackage/c73;-><init>(FF)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3, v4}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    check-cast v4, Ldefpackage/if1;

    .line 98
    .line 99
    invoke-static {v1, v4}, Ldefpackage/au0;->F(Ldefpackage/dx2;Ldefpackage/if1;)Ldefpackage/dx2;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget v1, Ldefpackage/l34;->a:I

    .line 104
    .line 105
    new-instance v1, Ldefpackage/lu0;

    .line 106
    .line 107
    iget v2, p0, Ldefpackage/a73;->o:F

    .line 108
    .line 109
    invoke-direct {v1, v2}, Ldefpackage/lu0;-><init>(F)V

    .line 110
    .line 111
    .line 112
    new-instance v2, Ldefpackage/k34;

    .line 113
    .line 114
    invoke-direct {v2, v1, v1, v1, v1}, Ldefpackage/k34;-><init>(Ldefpackage/lu0;Ldefpackage/lu0;Ldefpackage/lu0;Ldefpackage/lu0;)V

    .line 115
    .line 116
    .line 117
    const v1, 0xfe7ff

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v2, v1}, Ldefpackage/au0;->G(Ldefpackage/dx2;Ldefpackage/ac4;I)Ldefpackage/dx2;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    and-int/lit8 v1, p4, 0x70

    .line 125
    .line 126
    xor-int/lit8 v1, v1, 0x30

    .line 127
    .line 128
    const/16 v2, 0x20

    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    const/4 v4, 0x1

    .line 132
    if-le v1, v2, :cond_2

    .line 133
    .line 134
    invoke-virtual {p3, p2}, Ldefpackage/rg1;->d(I)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_3

    .line 139
    .line 140
    :cond_2
    and-int/lit8 p4, p4, 0x30

    .line 141
    .line 142
    if-ne p4, v2, :cond_4

    .line 143
    .line 144
    :cond_3
    move p4, v4

    .line 145
    goto :goto_0

    .line 146
    :cond_4
    move p4, v3

    .line 147
    :goto_0
    invoke-virtual {p3, p1}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    or-int/2addr p4, v1

    .line 152
    iget-object v1, p0, Ldefpackage/a73;->p:Ldefpackage/gf1;

    .line 153
    .line 154
    invoke-virtual {p3, v1}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    or-int/2addr p4, v2

    .line 159
    invoke-virtual {p3}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-nez p4, :cond_5

    .line 164
    .line 165
    if-ne v2, v5, :cond_6

    .line 166
    .line 167
    :cond_5
    new-instance v2, Ldefpackage/d73;

    .line 168
    .line 169
    invoke-direct {v2, p2, p1, v1}, Ldefpackage/d73;-><init>(ILdefpackage/lm0;Ldefpackage/gf1;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3, v2}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_6
    check-cast v2, Ldefpackage/gf1;

    .line 176
    .line 177
    invoke-static {v0, v2}, Ldefpackage/wr1;->j(Ldefpackage/dx2;Ldefpackage/gf1;)Ldefpackage/dx2;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    sget-object p4, Ldefpackage/fz0;->s:Ldefpackage/hs;

    .line 182
    .line 183
    sget-object v0, Ldefpackage/lu;->a:Ldefpackage/w03;

    .line 184
    .line 185
    invoke-virtual {v0, p4}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Ldefpackage/ui2;

    .line 190
    .line 191
    if-nez v0, :cond_7

    .line 192
    .line 193
    new-instance v0, Ldefpackage/ou;

    .line 194
    .line 195
    invoke-direct {v0, p4, v3}, Ldefpackage/ou;-><init>(Ldefpackage/hs;Z)V

    .line 196
    .line 197
    .line 198
    :cond_7
    iget-wide v1, p3, Ldefpackage/rg1;->T:J

    .line 199
    .line 200
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 201
    .line 202
    .line 203
    move-result p4

    .line 204
    invoke-virtual {p3}, Ldefpackage/rg1;->k()Ldefpackage/mf3;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {p3, p1}, Ldefpackage/j51;->E(Ldefpackage/rg1;Ldefpackage/dx2;)Ldefpackage/dx2;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    sget-object v2, Ldefpackage/e80;->e:Ldefpackage/fz0;

    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p3}, Ldefpackage/rg1;->U()V

    .line 218
    .line 219
    .line 220
    iget-boolean v2, p3, Ldefpackage/rg1;->S:Z

    .line 221
    .line 222
    if-eqz v2, :cond_8

    .line 223
    .line 224
    invoke-virtual {p3}, Ldefpackage/rg1;->j()V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_8
    invoke-virtual {p3}, Ldefpackage/rg1;->e0()V

    .line 229
    .line 230
    .line 231
    :goto_1
    sget-object v2, Ldefpackage/fz0;->I:Ldefpackage/d60;

    .line 232
    .line 233
    invoke-static {v2, p3, v0}, Ldefpackage/l93;->c0(Ldefpackage/wf1;Ldefpackage/rg1;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    sget-object v0, Ldefpackage/fz0;->H:Ldefpackage/d60;

    .line 237
    .line 238
    invoke-static {v0, p3, v1}, Ldefpackage/l93;->c0(Ldefpackage/wf1;Ldefpackage/rg1;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object p4

    .line 245
    sget-object v0, Ldefpackage/fz0;->J:Ldefpackage/d60;

    .line 246
    .line 247
    invoke-static {v0, p3, p4}, Ldefpackage/l93;->c0(Ldefpackage/wf1;Ldefpackage/rg1;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-static {p3}, Ldefpackage/l93;->a0(Ldefpackage/rg1;)V

    .line 251
    .line 252
    .line 253
    sget-object p4, Ldefpackage/fz0;->G:Ldefpackage/d60;

    .line 254
    .line 255
    invoke-static {p4, p3, p1}, Ldefpackage/l93;->c0(Ldefpackage/wf1;Ldefpackage/rg1;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    iget-boolean p1, p0, Ldefpackage/a73;->q:Z

    .line 259
    .line 260
    if-eqz p1, :cond_9

    .line 261
    .line 262
    const p1, -0x3a133573

    .line 263
    .line 264
    .line 265
    invoke-virtual {p3, p1}, Ldefpackage/rg1;->R(I)V

    .line 266
    .line 267
    .line 268
    iget-object p1, p0, Ldefpackage/a73;->r:Landroid/net/Uri;

    .line 269
    .line 270
    iget-object p0, p0, Ldefpackage/a73;->s:Ljava/lang/String;

    .line 271
    .line 272
    invoke-static {p1, p0, p3, v3}, Ldefpackage/e35;->f(Landroid/net/Uri;Ljava/lang/String;Ldefpackage/rg1;I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p3, v3}, Ldefpackage/rg1;->o(Z)V

    .line 276
    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_9
    iget-object p0, p0, Ldefpackage/a73;->t:Ljava/util/List;

    .line 280
    .line 281
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-lt p2, p1, :cond_a

    .line 286
    .line 287
    const p0, -0x3a1134fb

    .line 288
    .line 289
    .line 290
    invoke-virtual {p3, p0}, Ldefpackage/rg1;->R(I)V

    .line 291
    .line 292
    .line 293
    invoke-static {v3, p3}, Ldefpackage/e35;->d(ILdefpackage/rg1;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p3, v3}, Ldefpackage/rg1;->o(Z)V

    .line 297
    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_a
    const p1, -0x3a10581b

    .line 301
    .line 302
    .line 303
    invoke-virtual {p3, p1}, Ldefpackage/rg1;->R(I)V

    .line 304
    .line 305
    .line 306
    invoke-static {p0, p2}, Ldefpackage/q40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 311
    .line 312
    const/4 p1, 0x0

    .line 313
    if-eqz p0, :cond_b

    .line 314
    .line 315
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    goto :goto_2

    .line 320
    :cond_b
    move-object p2, p1

    .line 321
    :goto_2
    if-eqz p0, :cond_c

    .line 322
    .line 323
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    :cond_c
    invoke-static {p2, p1, p3, v3}, Ldefpackage/e35;->g(Ljava/lang/String;Ljava/lang/String;Ldefpackage/rg1;I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p3, v3}, Ldefpackage/rg1;->o(Z)V

    .line 331
    .line 332
    .line 333
    :goto_3
    invoke-virtual {p3, v4}, Ldefpackage/rg1;->o(Z)V

    .line 334
    .line 335
    .line 336
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 337
    .line 338
    return-object p0
.end method
