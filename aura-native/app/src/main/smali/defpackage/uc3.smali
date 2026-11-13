.class public final synthetic Ldefpackage/uc3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/ad3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ad3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/uc3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/uc3;->o:Ldefpackage/ad3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Ldefpackage/uc3;->n:I

    .line 2
    .line 3
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Ldefpackage/uc3;->o:Ldefpackage/ad3;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ldefpackage/o82;

    .line 12
    .line 13
    invoke-static {}, Ldefpackage/ya4;->t()Ldefpackage/ch4;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v3}, Ldefpackage/ch4;->e()Ldefpackage/if1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v4, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v4, v2

    .line 26
    :goto_0
    invoke-static {v3}, Ldefpackage/ya4;->z(Ldefpackage/ch4;)Ldefpackage/ch4;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    :try_start_0
    iget p0, p0, Ldefpackage/ad3;->e:I

    .line 31
    .line 32
    iget-object v0, p1, Ldefpackage/o82;->b:Ldefpackage/q82;

    .line 33
    .line 34
    iget-object v6, v0, Ldefpackage/q82;->c:Ldefpackage/ll;

    .line 35
    .line 36
    if-nez v6, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iget-object p1, p1, Ldefpackage/o82;->a:Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object v0, v0, Ldefpackage/q82;->b:Ldefpackage/rm3;

    .line 42
    .line 43
    new-instance v7, Ldefpackage/vp3;

    .line 44
    .line 45
    invoke-direct {v7, v6, p0, v0, v2}, Ldefpackage/vp3;-><init>(Ldefpackage/ll;ILdefpackage/rm3;Ldefpackage/if1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-static {v3, v5, v4}, Ldefpackage/ya4;->H(Ldefpackage/ch4;Ldefpackage/ch4;Ldefpackage/if1;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    invoke-static {v3, v5, v4}, Ldefpackage/ya4;->H(Ldefpackage/ch4;Ldefpackage/ch4;Ldefpackage/if1;)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {p0}, Ldefpackage/e35;->t(Ldefpackage/ad3;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    iget v5, p0, Ldefpackage/ad3;->i:F

    .line 72
    .line 73
    add-float/2addr v5, v0

    .line 74
    invoke-static {v5}, Ldefpackage/ji2;->M(F)J

    .line 75
    .line 76
    .line 77
    move-result-wide v6

    .line 78
    long-to-float v8, v6

    .line 79
    sub-float/2addr v5, v8

    .line 80
    iput v5, p0, Ldefpackage/ad3;->i:F

    .line 81
    .line 82
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    const v8, 0x38d1b717    # 1.0E-4f

    .line 87
    .line 88
    .line 89
    cmpg-float v5, v5, v8

    .line 90
    .line 91
    if-gez v5, :cond_2

    .line 92
    .line 93
    goto/16 :goto_6

    .line 94
    .line 95
    :cond_2
    add-long v8, v3, v6

    .line 96
    .line 97
    iget-wide v10, p0, Ldefpackage/ad3;->h:J

    .line 98
    .line 99
    iget-wide v12, p0, Ldefpackage/ad3;->g:J

    .line 100
    .line 101
    invoke-static/range {v8 .. v13}, Ldefpackage/gb;->n(JJJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    cmp-long v0, v8, v5

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/4 v8, 0x1

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    move v0, v8

    .line 112
    goto :goto_2

    .line 113
    :cond_3
    move v0, v7

    .line 114
    :goto_2
    sub-long/2addr v5, v3

    .line 115
    long-to-float v3, v5

    .line 116
    iput v3, p0, Ldefpackage/ad3;->j:F

    .line 117
    .line 118
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v9

    .line 122
    const-wide/16 v11, 0x0

    .line 123
    .line 124
    cmp-long v4, v9, v11

    .line 125
    .line 126
    const/4 v9, 0x0

    .line 127
    if-eqz v4, :cond_6

    .line 128
    .line 129
    iget-object v4, p0, Ldefpackage/ad3;->E:Ldefpackage/zd3;

    .line 130
    .line 131
    cmpl-float v10, v3, v9

    .line 132
    .line 133
    if-lez v10, :cond_4

    .line 134
    .line 135
    move v10, v8

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    move v10, v7

    .line 138
    :goto_3
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    invoke-virtual {v4, v10}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object v4, p0, Ldefpackage/ad3;->F:Ldefpackage/zd3;

    .line 146
    .line 147
    cmpg-float v3, v3, v9

    .line 148
    .line 149
    if-gez v3, :cond_5

    .line 150
    .line 151
    move v7, v8

    .line 152
    :cond_5
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v4, v3}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_6
    iget-object v3, p0, Ldefpackage/ad3;->m:Ldefpackage/zd3;

    .line 160
    .line 161
    invoke-virtual {v3}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Ldefpackage/qc3;

    .line 166
    .line 167
    long-to-int v4, v5

    .line 168
    neg-int v7, v4

    .line 169
    invoke-virtual {v3, v7}, Ldefpackage/qc3;->h(I)Ldefpackage/qc3;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-eqz v3, :cond_7

    .line 174
    .line 175
    iget-object v10, p0, Ldefpackage/ad3;->b:Ldefpackage/qc3;

    .line 176
    .line 177
    if-eqz v10, :cond_7

    .line 178
    .line 179
    invoke-virtual {v10, v7}, Ldefpackage/qc3;->h(I)Ldefpackage/qc3;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    if-eqz v7, :cond_8

    .line 184
    .line 185
    iput-object v7, p0, Ldefpackage/ad3;->b:Ldefpackage/qc3;

    .line 186
    .line 187
    :cond_7
    move-object v2, v3

    .line 188
    :cond_8
    if-eqz v2, :cond_9

    .line 189
    .line 190
    iget-boolean v3, p0, Ldefpackage/ad3;->a:Z

    .line 191
    .line 192
    invoke-virtual {p0, v2, v3, v8}, Ldefpackage/ad3;->h(Ldefpackage/qc3;ZZ)V

    .line 193
    .line 194
    .line 195
    iget-object p0, p0, Ldefpackage/ad3;->A:Ldefpackage/b13;

    .line 196
    .line 197
    invoke-interface {p0, v1}, Ldefpackage/b13;->setValue(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    iget-object v1, p0, Ldefpackage/ad3;->d:Ldefpackage/nq;

    .line 202
    .line 203
    iget-object v2, v1, Ldefpackage/nq;->o:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, Ldefpackage/ad3;

    .line 206
    .line 207
    iget-object v1, v1, Ldefpackage/nq;->q:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Ldefpackage/vd3;

    .line 210
    .line 211
    invoke-virtual {v2}, Ldefpackage/ad3;->p()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-nez v3, :cond_a

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_a
    int-to-float v3, v4

    .line 219
    invoke-virtual {v2}, Ldefpackage/ad3;->p()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    int-to-float v2, v2

    .line 224
    div-float v9, v3, v2

    .line 225
    .line 226
    :goto_4
    invoke-virtual {v1}, Ldefpackage/vd3;->g()F

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    add-float/2addr v2, v9

    .line 231
    invoke-virtual {v1, v2}, Ldefpackage/vd3;->h(F)V

    .line 232
    .line 233
    .line 234
    iget-object p0, p0, Ldefpackage/ad3;->x:Ldefpackage/zd3;

    .line 235
    .line 236
    invoke-virtual {p0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    check-cast p0, Ldefpackage/c72;

    .line 241
    .line 242
    if-eqz p0, :cond_b

    .line 243
    .line 244
    invoke-virtual {p0}, Ldefpackage/c72;->l()V

    .line 245
    .line 246
    .line 247
    :cond_b
    :goto_5
    if-eqz v0, :cond_c

    .line 248
    .line 249
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    :goto_6
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
