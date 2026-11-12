.class public final Lwq1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lej4;


# instance fields
.field public final n:J

.field public o:Z

.field public final p:Ltv;

.field public final q:Ltv;

.field public r:Ltl1;

.field public s:Z

.field public final synthetic t:Lyq1;


# direct methods
.method public constructor <init>(Lyq1;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwq1;->t:Lyq1;

    .line 5
    .line 6
    iput-wide p2, p0, Lwq1;->n:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lwq1;->o:Z

    .line 9
    .line 10
    new-instance p1, Ltv;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lwq1;->p:Ltv;

    .line 16
    .line 17
    new-instance p1, Ltv;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lwq1;->q:Ltv;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lwq1;->t:Lyq1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lwq1;->s:Z

    .line 6
    .line 7
    iget-object v1, p0, Lwq1;->q:Ltv;

    .line 8
    .line 9
    iget-wide v2, v1, Ltv;->o:J

    .line 10
    .line 11
    invoke-virtual {v1}, Ltv;->b()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v0, v2, v0

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lwq1;->t:Lyq1;

    .line 25
    .line 26
    sget-object v1, Lze5;->a:Ltl1;

    .line 27
    .line 28
    iget-object v0, v0, Lyq1;->b:Lrq1;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Lrq1;->s(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p0, p0, Lwq1;->t:Lyq1;

    .line 34
    .line 35
    invoke-virtual {p0}, Lyq1;->a()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    monitor-exit v0

    .line 41
    throw p0
.end method

.method public final read(Ltv;J)J
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v5, v1, v3

    .line 11
    .line 12
    if-ltz v5, :cond_f

    .line 13
    .line 14
    :goto_0
    iget-object v5, v0, Lwq1;->t:Lyq1;

    .line 15
    .line 16
    monitor-enter v5

    .line 17
    :try_start_0
    iget-object v6, v5, Lyq1;->b:Lrq1;

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v6, v5, Lyq1;->i:Lvq1;

    .line 23
    .line 24
    iget-boolean v7, v6, Lvq1;->p:Z

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    const/4 v9, 0x0

    .line 28
    if-nez v7, :cond_1

    .line 29
    .line 30
    iget-boolean v6, v6, Lvq1;->n:Z

    .line 31
    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v6, v9

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :goto_1
    move v6, v8

    .line 38
    :goto_2
    if-eqz v6, :cond_2

    .line 39
    .line 40
    iget-object v7, v5, Lyq1;->j:Lxq1;

    .line 41
    .line 42
    invoke-virtual {v7}, Luk;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_9

    .line 48
    .line 49
    :cond_2
    :goto_3
    :try_start_1
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    :try_start_2
    iget-object v7, v5, Lyq1;->l:Lb21;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 51
    .line 52
    :try_start_3
    monitor-exit v5

    .line 53
    if-eqz v7, :cond_3

    .line 54
    .line 55
    iget-boolean v7, v0, Lwq1;->o:Z

    .line 56
    .line 57
    if-nez v7, :cond_3

    .line 58
    .line 59
    iget-object v7, v5, Lyq1;->m:Ljava/io/IOException;

    .line 60
    .line 61
    if-nez v7, :cond_4

    .line 62
    .line 63
    new-instance v7, Lokhttp3/internal/http2/StreamResetException;

    .line 64
    .line 65
    monitor-enter v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 66
    :try_start_4
    iget-object v10, v5, Lyq1;->l:Lb21;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 67
    .line 68
    :try_start_5
    monitor-exit v5

    .line 69
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-direct {v7, v10}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lb21;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 73
    .line 74
    .line 75
    goto :goto_4

    .line 76
    :catchall_1
    move-exception v0

    .line 77
    goto/16 :goto_8

    .line 78
    .line 79
    :catchall_2
    move-exception v0

    .line 80
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 81
    :try_start_7
    throw v0

    .line 82
    :cond_3
    const/4 v7, 0x0

    .line 83
    :cond_4
    :goto_4
    iget-boolean v10, v0, Lwq1;->s:Z

    .line 84
    .line 85
    if-nez v10, :cond_d

    .line 86
    .line 87
    iget-object v10, v0, Lwq1;->q:Ltv;

    .line 88
    .line 89
    iget-wide v11, v10, Ltv;->o:J

    .line 90
    .line 91
    cmp-long v13, v11, v3

    .line 92
    .line 93
    const-wide/16 v14, -0x1

    .line 94
    .line 95
    if-lez v13, :cond_7

    .line 96
    .line 97
    invoke-static {v1, v2, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide v11

    .line 101
    move-object/from16 v13, p1

    .line 102
    .line 103
    invoke-virtual {v10, v13, v11, v12}, Ltv;->read(Ltv;J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v17

    .line 107
    iget-object v8, v5, Lyq1;->c:Los;

    .line 108
    .line 109
    const-wide/16 v19, 0x0

    .line 110
    .line 111
    const/16 v21, 0x2

    .line 112
    .line 113
    move-object/from16 v16, v8

    .line 114
    .line 115
    invoke-static/range {v16 .. v21}, Los;->c(Los;JJI)V

    .line 116
    .line 117
    .line 118
    iget-object v8, v5, Lyq1;->c:Los;

    .line 119
    .line 120
    invoke-virtual {v8}, Los;->b()J

    .line 121
    .line 122
    .line 123
    move-result-wide v10

    .line 124
    if-nez v7, :cond_5

    .line 125
    .line 126
    iget-object v8, v5, Lyq1;->b:Lrq1;

    .line 127
    .line 128
    iget-object v8, v8, Lrq1;->D:Lpb4;

    .line 129
    .line 130
    invoke-virtual {v8}, Lpb4;->a()I

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    div-int/lit8 v8, v8, 0x2

    .line 135
    .line 136
    move-wide/from16 v25, v3

    .line 137
    .line 138
    int-to-long v3, v8

    .line 139
    cmp-long v3, v10, v3

    .line 140
    .line 141
    if-ltz v3, :cond_6

    .line 142
    .line 143
    iget-object v3, v5, Lyq1;->b:Lrq1;

    .line 144
    .line 145
    iget v4, v5, Lyq1;->a:I

    .line 146
    .line 147
    invoke-virtual {v3, v4, v10, v11}, Lrq1;->F(IJ)V

    .line 148
    .line 149
    .line 150
    iget-object v3, v5, Lyq1;->c:Los;

    .line 151
    .line 152
    const-wide/16 v20, 0x0

    .line 153
    .line 154
    const/16 v24, 0x1

    .line 155
    .line 156
    move-object/from16 v19, v3

    .line 157
    .line 158
    move-wide/from16 v22, v10

    .line 159
    .line 160
    invoke-static/range {v19 .. v24}, Los;->c(Los;JJI)V

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_5
    move-wide/from16 v25, v3

    .line 165
    .line 166
    :cond_6
    :goto_5
    move v8, v9

    .line 167
    goto :goto_7

    .line 168
    :cond_7
    move-object/from16 v13, p1

    .line 169
    .line 170
    move-wide/from16 v25, v3

    .line 171
    .line 172
    iget-boolean v3, v0, Lwq1;->o:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 173
    .line 174
    if-nez v3, :cond_8

    .line 175
    .line 176
    if-nez v7, :cond_8

    .line 177
    .line 178
    :try_start_8
    invoke-virtual {v5}, Ljava/lang/Object;->wait()V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 179
    .line 180
    .line 181
    :goto_6
    move-wide/from16 v17, v14

    .line 182
    .line 183
    goto :goto_7

    .line 184
    :catch_0
    :try_start_9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 189
    .line 190
    .line 191
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 192
    .line 193
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 194
    .line 195
    .line 196
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 197
    :cond_8
    move v8, v9

    .line 198
    goto :goto_6

    .line 199
    :goto_7
    if-eqz v6, :cond_9

    .line 200
    .line 201
    :try_start_a
    iget-object v3, v5, Lyq1;->j:Lxq1;

    .line 202
    .line 203
    invoke-virtual {v3}, Lxq1;->k()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 204
    .line 205
    .line 206
    :cond_9
    monitor-exit v5

    .line 207
    iget-object v3, v0, Lwq1;->t:Lyq1;

    .line 208
    .line 209
    iget-object v3, v3, Lyq1;->b:Lrq1;

    .line 210
    .line 211
    iget-object v3, v3, Lrq1;->C:Lr81;

    .line 212
    .line 213
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    if-eqz v8, :cond_a

    .line 217
    .line 218
    move-wide/from16 v3, v25

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_a
    cmp-long v0, v17, v14

    .line 223
    .line 224
    if-eqz v0, :cond_b

    .line 225
    .line 226
    return-wide v17

    .line 227
    :cond_b
    if-nez v7, :cond_c

    .line 228
    .line 229
    return-wide v14

    .line 230
    :cond_c
    throw v7

    .line 231
    :cond_d
    :try_start_b
    new-instance v0, Ljava/io/IOException;

    .line 232
    .line 233
    const-string v1, "stream closed"

    .line 234
    .line 235
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 239
    :catchall_3
    move-exception v0

    .line 240
    :try_start_c
    monitor-exit v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 241
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 242
    :goto_8
    if-eqz v6, :cond_e

    .line 243
    .line 244
    :try_start_e
    iget-object v1, v5, Lyq1;->j:Lxq1;

    .line 245
    .line 246
    invoke-virtual {v1}, Lxq1;->k()V

    .line 247
    .line 248
    .line 249
    :cond_e
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 250
    :goto_9
    monitor-exit v5

    .line 251
    throw v0

    .line 252
    :cond_f
    move-wide/from16 v25, v3

    .line 253
    .line 254
    const-string v0, "byteCount < 0: "

    .line 255
    .line 256
    invoke-static {v0, v1, v2}, Lb11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-static {v0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    return-wide v25
.end method

.method public final timeout()Lfu4;
    .locals 0

    .line 1
    iget-object p0, p0, Lwq1;->t:Lyq1;

    .line 2
    .line 3
    iget-object p0, p0, Lyq1;->j:Lxq1;

    .line 4
    .line 5
    return-object p0
.end method
