.class public final Lhf4;
.super Lbq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final h:Lii0;

.field public final i:Lbi0;

.field public final j:Ltb1;

.field public final k:J

.field public final l:Li80;

.field public final m:Z

.field public final n:Lbf4;

.field public final o:Lgn2;

.field public p:Lrw4;


# direct methods
.method public constructor <init>(Lfn2;Lbi0;Li80;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Lbq;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p2

    .line 9
    .line 10
    iput-object v2, v0, Lhf4;->i:Lbi0;

    .line 11
    .line 12
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iput-wide v6, v0, Lhf4;->k:J

    .line 18
    .line 19
    move-object/from16 v2, p3

    .line 20
    .line 21
    iput-object v2, v0, Lhf4;->l:Li80;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iput-boolean v2, v0, Lhf4;->m:Z

    .line 25
    .line 26
    new-instance v3, Lum2;

    .line 27
    .line 28
    invoke-direct {v3}, Lum2;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lxm2;

    .line 32
    .line 33
    invoke-direct {v4}, Lxm2;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object v13, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 37
    .line 38
    sget-object v5, Lgy3;->r:Lgy3;

    .line 39
    .line 40
    new-instance v5, Lzm2;

    .line 41
    .line 42
    invoke-direct {v5}, Lzm2;-><init>()V

    .line 43
    .line 44
    .line 45
    sget-object v20, Lcn2;->d:Lcn2;

    .line 46
    .line 47
    sget-object v9, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 48
    .line 49
    iget-object v8, v1, Lfn2;->a:Landroid/net/Uri;

    .line 50
    .line 51
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v18

    .line 55
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-static {v8}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 63
    .line 64
    .line 65
    move-result-object v15

    .line 66
    iget-object v8, v4, Lxm2;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v8, Landroid/net/Uri;

    .line 69
    .line 70
    if-eqz v8, :cond_1

    .line 71
    .line 72
    iget-object v8, v4, Lxm2;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v8, Ljava/util/UUID;

    .line 75
    .line 76
    if-eqz v8, :cond_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const/4 v2, 0x0

    .line 80
    :cond_1
    :goto_0
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    if-eqz v9, :cond_3

    .line 85
    .line 86
    new-instance v8, Lbn2;

    .line 87
    .line 88
    iget-object v10, v4, Lxm2;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v10, Ljava/util/UUID;

    .line 91
    .line 92
    if-eqz v10, :cond_2

    .line 93
    .line 94
    new-instance v10, Lym2;

    .line 95
    .line 96
    invoke-direct {v10, v4}, Lym2;-><init>(Lxm2;)V

    .line 97
    .line 98
    .line 99
    move-object v11, v10

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move-object v11, v2

    .line 102
    :goto_1
    const/4 v10, 0x0

    .line 103
    const/4 v12, 0x0

    .line 104
    const/4 v14, 0x0

    .line 105
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-direct/range {v8 .. v17}, Lbn2;-><init>(Landroid/net/Uri;Ljava/lang/String;Lym2;Lsm2;Ljava/util/List;Ljava/lang/String;Lyw1;J)V

    .line 111
    .line 112
    .line 113
    move-object/from16 v17, v8

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    move-object/from16 v17, v2

    .line 117
    .line 118
    :goto_2
    new-instance v14, Lgn2;

    .line 119
    .line 120
    new-instance v4, Lwm2;

    .line 121
    .line 122
    invoke-direct {v4, v3}, Lvm2;-><init>(Lum2;)V

    .line 123
    .line 124
    .line 125
    new-instance v3, Lan2;

    .line 126
    .line 127
    invoke-direct {v3, v5}, Lan2;-><init>(Lzm2;)V

    .line 128
    .line 129
    .line 130
    sget-object v19, Ldo2;->K:Ldo2;

    .line 131
    .line 132
    move-object/from16 v16, v4

    .line 133
    .line 134
    move-object/from16 v15, v18

    .line 135
    .line 136
    move-object/from16 v18, v3

    .line 137
    .line 138
    invoke-direct/range {v14 .. v20}, Lgn2;-><init>(Ljava/lang/String;Lwm2;Lbn2;Lan2;Ldo2;Lcn2;)V

    .line 139
    .line 140
    .line 141
    iput-object v14, v0, Lhf4;->o:Lgn2;

    .line 142
    .line 143
    new-instance v3, Lsb1;

    .line 144
    .line 145
    invoke-direct {v3}, Lsb1;-><init>()V

    .line 146
    .line 147
    .line 148
    iget-object v4, v1, Lfn2;->b:Ljava/lang/String;

    .line 149
    .line 150
    if-eqz v4, :cond_4

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_4
    const-string v4, "text/x-unknown"

    .line 154
    .line 155
    :goto_3
    invoke-static {v4}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    iput-object v4, v3, Lsb1;->m:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v4, v1, Lfn2;->c:Ljava/lang/String;

    .line 162
    .line 163
    iput-object v4, v3, Lsb1;->d:Ljava/lang/String;

    .line 164
    .line 165
    iget v4, v1, Lfn2;->d:I

    .line 166
    .line 167
    iput v4, v3, Lsb1;->e:I

    .line 168
    .line 169
    iget v4, v1, Lfn2;->e:I

    .line 170
    .line 171
    iput v4, v3, Lsb1;->f:I

    .line 172
    .line 173
    iget-object v4, v1, Lfn2;->f:Ljava/lang/String;

    .line 174
    .line 175
    iput-object v4, v3, Lsb1;->b:Ljava/lang/String;

    .line 176
    .line 177
    iget-object v4, v1, Lfn2;->g:Ljava/lang/String;

    .line 178
    .line 179
    if-eqz v4, :cond_5

    .line 180
    .line 181
    move-object v2, v4

    .line 182
    :cond_5
    iput-object v2, v3, Lsb1;->a:Ljava/lang/String;

    .line 183
    .line 184
    new-instance v2, Ltb1;

    .line 185
    .line 186
    invoke-direct {v2, v3}, Ltb1;-><init>(Lsb1;)V

    .line 187
    .line 188
    .line 189
    iput-object v2, v0, Lhf4;->j:Ltb1;

    .line 190
    .line 191
    sget-object v21, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 192
    .line 193
    iget-object v1, v1, Lfn2;->a:Landroid/net/Uri;

    .line 194
    .line 195
    const-string v2, "The uri must be set."

    .line 196
    .line 197
    invoke-static {v1, v2}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    new-instance v15, Lii0;

    .line 201
    .line 202
    const-wide/16 v17, 0x0

    .line 203
    .line 204
    const/16 v19, 0x1

    .line 205
    .line 206
    const/16 v20, 0x0

    .line 207
    .line 208
    const-wide/16 v22, 0x0

    .line 209
    .line 210
    const-wide/16 v24, -0x1

    .line 211
    .line 212
    const/16 v26, 0x0

    .line 213
    .line 214
    const/16 v27, 0x1

    .line 215
    .line 216
    move-object/from16 v16, v1

    .line 217
    .line 218
    invoke-direct/range {v15 .. v27}, Lii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 219
    .line 220
    .line 221
    iput-object v15, v0, Lhf4;->h:Lii0;

    .line 222
    .line 223
    new-instance v1, Lbf4;

    .line 224
    .line 225
    const/16 v16, 0x0

    .line 226
    .line 227
    const/16 v19, 0x0

    .line 228
    .line 229
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    const-wide/16 v10, 0x0

    .line 240
    .line 241
    const-wide/16 v12, 0x0

    .line 242
    .line 243
    move-object/from16 v18, v14

    .line 244
    .line 245
    const/4 v14, 0x1

    .line 246
    const/4 v15, 0x0

    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    move-wide v8, v6

    .line 250
    invoke-direct/range {v1 .. v19}, Lbf4;-><init>(JJJJJJZZZLy41;Lgn2;Lan2;)V

    .line 251
    .line 252
    .line 253
    iput-object v1, v0, Lhf4;->n:Lbf4;

    .line 254
    .line 255
    return-void
.end method


# virtual methods
.method public final b(Lmt2;Ln9;J)Lno2;
    .locals 11

    .line 1
    new-instance v0, Lgf4;

    .line 2
    .line 3
    iget-object v3, p0, Lhf4;->p:Lrw4;

    .line 4
    .line 5
    new-instance v8, Lue1;

    .line 6
    .line 7
    iget-object p2, p0, Lbq;->c:Lue1;

    .line 8
    .line 9
    iget-object p2, p2, Lue1;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    const/16 p3, 0x8

    .line 14
    .line 15
    const/4 p4, 0x0

    .line 16
    invoke-direct {v8, p2, p4, p1, p3}, Lue1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    iget-boolean v9, p0, Lhf4;->m:Z

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    iget-object v1, p0, Lhf4;->h:Lii0;

    .line 23
    .line 24
    iget-object v2, p0, Lhf4;->i:Lbi0;

    .line 25
    .line 26
    iget-object v4, p0, Lhf4;->j:Ltb1;

    .line 27
    .line 28
    iget-wide v5, p0, Lhf4;->k:J

    .line 29
    .line 30
    iget-object v7, p0, Lhf4;->l:Li80;

    .line 31
    .line 32
    invoke-direct/range {v0 .. v10}, Lgf4;-><init>(Lii0;Lbi0;Lrw4;Ltb1;JLi80;Lue1;ZLty3;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public final h()Lgn2;
    .locals 0

    .line 1
    iget-object p0, p0, Lhf4;->o:Lgn2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final l(Lrw4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhf4;->p:Lrw4;

    .line 2
    .line 3
    iget-object p1, p0, Lhf4;->n:Lbf4;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lbq;->m(Lcu4;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(Lno2;)V
    .locals 0

    .line 1
    check-cast p1, Lgf4;

    .line 2
    .line 3
    iget-object p0, p1, Lgf4;->v:Li61;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Li61;->p(Lkd2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final p()V
    .locals 0

    .line 1
    return-void
.end method
