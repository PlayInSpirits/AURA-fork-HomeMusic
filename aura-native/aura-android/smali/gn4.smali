.class public abstract Lgn4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lxi4;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxi4;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxi4;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lgn4;->a:Lxi4;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/Object;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lgn4;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public static final a(Lkn4;Ldx2;Lwf1;Lrg1;I)V
    .locals 14

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v5, p3

    .line 4
    .line 5
    const v0, -0x1e845847

    .line 6
    .line 7
    .line 8
    invoke-virtual {v5, v0}, Lrg1;->S(I)Lrg1;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v5, p0}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int v0, p4, v0

    .line 21
    .line 22
    invoke-virtual {v5, p1}, Lrg1;->e(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 v1, 0x10

    .line 32
    .line 33
    :goto_1
    or-int/2addr v0, v1

    .line 34
    invoke-virtual {v5, v3}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/16 v1, 0x100

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v1, 0x80

    .line 44
    .line 45
    :goto_2
    or-int/2addr v0, v1

    .line 46
    and-int/lit16 v1, v0, 0x93

    .line 47
    .line 48
    const/16 v4, 0x92

    .line 49
    .line 50
    const/4 v11, 0x1

    .line 51
    const/4 v12, 0x0

    .line 52
    if-eq v1, v4, :cond_3

    .line 53
    .line 54
    move v1, v11

    .line 55
    goto :goto_3

    .line 56
    :cond_3
    move v1, v12

    .line 57
    :goto_3
    and-int/2addr v0, v11

    .line 58
    invoke-virtual {v5, v0, v1}, Lrg1;->K(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_b

    .line 63
    .line 64
    iget-wide v0, v5, Lrg1;->T:J

    .line 65
    .line 66
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/16 v1, 0xce

    .line 71
    .line 72
    sget-object v4, Ll80;->e:Lk93;

    .line 73
    .line 74
    invoke-virtual {v5, v1, v4}, Lrg1;->P(ILk93;)V

    .line 75
    .line 76
    .line 77
    iget-boolean v1, v5, Lrg1;->S:Z

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    iget-object v1, v5, Lrg1;->I:Llg4;

    .line 82
    .line 83
    invoke-static {v1}, Llg4;->z(Llg4;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-virtual {v5}, Lrg1;->z()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    instance-of v4, v1, Lwg1;

    .line 91
    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    check-cast v1, Lwg1;

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_5
    const/4 v1, 0x0

    .line 98
    :goto_4
    if-nez v1, :cond_6

    .line 99
    .line 100
    new-instance v1, La24;

    .line 101
    .line 102
    new-instance v13, Log1;

    .line 103
    .line 104
    new-instance v4, Lpg1;

    .line 105
    .line 106
    iget-wide v6, v5, Lrg1;->T:J

    .line 107
    .line 108
    iget-boolean v8, v5, Lrg1;->q:Z

    .line 109
    .line 110
    iget-boolean v9, v5, Lrg1;->C:Z

    .line 111
    .line 112
    iget-object v10, v5, Lrg1;->h:Lz80;

    .line 113
    .line 114
    iget-object v10, v10, Lz80;->G:Lzg5;

    .line 115
    .line 116
    invoke-direct/range {v4 .. v10}, Lpg1;-><init>(Lrg1;JZZLzg5;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {v13, v4}, Log1;-><init>(Lpg1;)V

    .line 120
    .line 121
    .line 122
    const/4 v4, -0x1

    .line 123
    invoke-direct {v1, v13, v4}, Lwg1;-><init>(Lvy3;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v1}, Lrg1;->c0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    iget-object v1, v1, Lwg1;->a:Lvy3;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    check-cast v1, Log1;

    .line 135
    .line 136
    iget-object v1, v1, Log1;->n:Lpg1;

    .line 137
    .line 138
    invoke-virtual {v5}, Lrg1;->k()Lmf3;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    iget-object v6, v1, Lpg1;->f:Lzd3;

    .line 143
    .line 144
    invoke-virtual {v6, v4}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v12}, Lrg1;->o(Z)V

    .line 148
    .line 149
    .line 150
    invoke-static {v5, p1}, Lj51;->E(Lrg1;Ldx2;)Ldx2;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v5}, Lrg1;->k()Lmf3;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {v5}, Lrg1;->U()V

    .line 159
    .line 160
    .line 161
    iget-boolean v7, v5, Lrg1;->S:Z

    .line 162
    .line 163
    if-eqz v7, :cond_7

    .line 164
    .line 165
    invoke-virtual {v5}, Lrg1;->j()V

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_7
    invoke-virtual {v5}, Lrg1;->e0()V

    .line 170
    .line 171
    .line 172
    :goto_5
    iget-object v7, p0, Lkn4;->c:Lhn4;

    .line 173
    .line 174
    invoke-static {v7, v5, p0}, Ll93;->c0(Lwf1;Lrg1;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget-object v7, p0, Lkn4;->d:Lhn4;

    .line 178
    .line 179
    invoke-static {v7, v5, v1}, Ll93;->c0(Lwf1;Lrg1;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lkn4;->e:Lhn4;

    .line 183
    .line 184
    invoke-static {v1, v5, v3}, Ll93;->c0(Lwf1;Lrg1;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object v1, Le80;->e:Lfz0;

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    sget-object v1, Lfz0;->H:Ld60;

    .line 193
    .line 194
    invoke-static {v1, v5, v6}, Ll93;->c0(Lwf1;Lrg1;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v5}, Ll93;->a0(Lrg1;)V

    .line 198
    .line 199
    .line 200
    sget-object v1, Lfz0;->G:Ld60;

    .line 201
    .line 202
    invoke-static {v1, v5, v4}, Ll93;->c0(Lwf1;Lrg1;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    sget-object v1, Lfz0;->J:Ld60;

    .line 210
    .line 211
    invoke-static {v1, v5, v0}, Ll93;->c0(Lwf1;Lrg1;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5, v11}, Lrg1;->o(Z)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5}, Lrg1;->w()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_a

    .line 222
    .line 223
    const v0, -0x4b0e9154

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5, v0}, Lrg1;->R(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5, p0}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-virtual {v5}, Lrg1;->H()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    if-nez v0, :cond_8

    .line 238
    .line 239
    sget-object v0, Lj80;->a:Li80;

    .line 240
    .line 241
    if-ne v1, v0, :cond_9

    .line 242
    .line 243
    :cond_8
    new-instance v1, Lwc;

    .line 244
    .line 245
    const/16 v0, 0x1b

    .line 246
    .line 247
    invoke-direct {v1, v0, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v5, v1}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_9
    check-cast v1, Lgf1;

    .line 254
    .line 255
    iget-object v0, v5, Lrg1;->M:Lk80;

    .line 256
    .line 257
    iget-object v0, v0, Lk80;->b:Lw00;

    .line 258
    .line 259
    iget-object v0, v0, Lw00;->n:Lya3;

    .line 260
    .line 261
    sget-object v4, Lma3;->f:Lma3;

    .line 262
    .line 263
    invoke-virtual {v0, v4}, Lya3;->x0(Le22;)V

    .line 264
    .line 265
    .line 266
    invoke-static {v0, v12, v1}, Lrr2;->R(Lya3;ILjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5, v12}, Lrg1;->o(Z)V

    .line 270
    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_a
    const v0, -0x4b0dac57

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5, v0}, Lrg1;->R(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5, v12}, Lrg1;->o(Z)V

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_b
    invoke-virtual {v5}, Lrg1;->N()V

    .line 284
    .line 285
    .line 286
    :goto_6
    invoke-virtual {v5}, Lrg1;->p()Llv3;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    if-eqz v6, :cond_c

    .line 291
    .line 292
    new-instance v0, Ld90;

    .line 293
    .line 294
    const/4 v5, 0x2

    .line 295
    move-object v1, p0

    .line 296
    move-object v2, p1

    .line 297
    move/from16 v4, p4

    .line 298
    .line 299
    invoke-direct/range {v0 .. v5}, Ld90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf1;II)V

    .line 300
    .line 301
    .line 302
    iput-object v0, v6, Llv3;->d:Lwf1;

    .line 303
    .line 304
    :cond_c
    return-void
.end method
