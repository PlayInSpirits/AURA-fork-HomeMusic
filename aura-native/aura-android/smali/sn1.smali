.class public final synthetic Lsn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p5, p0, Lsn1;->n:I

    iput-wide p1, p0, Lsn1;->o:J

    iput-object p3, p0, Lsn1;->p:Ljava/lang/Object;

    iput-object p4, p0, Lsn1;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lh62;JLg62;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lsn1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsn1;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iput-wide p2, p0, Lsn1;->o:J

    .line 10
    .line 11
    iput-object p4, p0, Lsn1;->q:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lrf2;Ljava/lang/Object;J)V
    .locals 1

    .line 15
    const/4 v0, 0x3

    iput v0, p0, Lsn1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn1;->p:Ljava/lang/Object;

    iput-object p2, p0, Lsn1;->q:Ljava/lang/Object;

    iput-wide p3, p0, Lsn1;->o:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lsn1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lsn1;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lrf2;

    .line 11
    .line 12
    iget-object v1, p0, Lsn1;->q:Ljava/lang/Object;

    .line 13
    .line 14
    iget-wide v2, p0, Lsn1;->o:J

    .line 15
    .line 16
    iget-object p0, v0, Lrf2;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lo55;

    .line 19
    .line 20
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p0, v2, v3, v1}, Lo55;->u(JLjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Lsn1;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lh62;

    .line 29
    .line 30
    iget-wide v3, p0, Lsn1;->o:J

    .line 31
    .line 32
    iget-object p0, p0, Lsn1;->q:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lg62;

    .line 35
    .line 36
    invoke-virtual {v0, v3, v4}, Lh62;->l0(J)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    iget-object v3, v0, Lh62;->H0:Lg62;

    .line 43
    .line 44
    if-ne v3, p0, :cond_0

    .line 45
    .line 46
    iput-object v2, v0, Lh62;->H0:Lg62;

    .line 47
    .line 48
    iget-boolean p0, v0, Lh62;->I0:Z

    .line 49
    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    iput-boolean v1, v0, Lh62;->I0:Z

    .line 53
    .line 54
    invoke-virtual {v0}, Lh62;->q0()V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void

    .line 58
    :pswitch_1
    iget-wide v0, p0, Lsn1;->o:J

    .line 59
    .line 60
    iget-object v2, p0, Lsn1;->p:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Lif1;

    .line 63
    .line 64
    iget-object p0, p0, Lsn1;->q:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lorg/json/JSONObject;

    .line 67
    .line 68
    sget-wide v3, Lu52;->i:J

    .line 69
    .line 70
    cmp-long v0, v3, v0

    .line 71
    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    invoke-interface {v2, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void

    .line 78
    :pswitch_2
    const-string v0, "Check failed."

    .line 79
    .line 80
    const-string v3, "Required value was null."

    .line 81
    .line 82
    iget-wide v5, p0, Lsn1;->o:J

    .line 83
    .line 84
    iget-object v4, p0, Lsn1;->p:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v7, v4

    .line 87
    check-cast v7, Ljava/lang/String;

    .line 88
    .line 89
    iget-object p0, p0, Lsn1;->q:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v8, p0

    .line 92
    check-cast v8, Ljava/util/function/Consumer;

    .line 93
    .line 94
    :try_start_0
    sget-object p0, Lvn1;->n:Lvn1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    :try_start_1
    invoke-static {}, Lcx;->h()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    if-eqz v7, :cond_2

    .line 103
    .line 104
    sget-object v4, Lrr1;->a:Lrr1;

    .line 105
    .line 106
    new-instance v4, Le90;

    .line 107
    .line 108
    const/4 v9, 0x7

    .line 109
    invoke-direct {v4, v9}, Le90;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v7, v4}, Lrr1;->B(Ljava/lang/String;Lgf1;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Ljava/util/List;

    .line 117
    .line 118
    :goto_0
    move-object v9, v4

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    invoke-direct {v4, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v4

    .line 126
    :cond_3
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    :catch_0
    :try_start_2
    invoke-virtual {p0}, Lvn1;->invoke()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide v9

    .line 142
    cmp-long v4, v9, v5

    .line 143
    .line 144
    if-eqz v4, :cond_4

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Lpn4;->a()Lxc5;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Lxc5;->s()Lretrofit2/Call;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {v1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Lretrofit2/Response;->isSuccessful()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_8

    .line 168
    .line 169
    invoke-virtual {v1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 174
    .line 175
    if-eqz v0, :cond_5

    .line 176
    .line 177
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-eqz v0, :cond_5

    .line 182
    .line 183
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStarred2()Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    :cond_5
    if-eqz v2, :cond_7

    .line 188
    .line 189
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Starred2;->getSongs()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-nez v0, :cond_6

    .line 194
    .line 195
    sget-object v0, Lu01;->n:Lu01;

    .line 196
    .line 197
    :cond_6
    move-object v4, v0

    .line 198
    goto :goto_0

    .line 199
    :goto_1
    invoke-virtual {p0}, Lvn1;->invoke()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    check-cast p0, Ljava/lang/Number;

    .line 204
    .line 205
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 206
    .line 207
    .line 208
    move-result-wide v0

    .line 209
    cmp-long p0, v0, v5

    .line 210
    .line 211
    if-nez p0, :cond_9

    .line 212
    .line 213
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    sget-object p0, Lio1;->b:Landroid/os/Handler;

    .line 217
    .line 218
    new-instance v4, Lun1;

    .line 219
    .line 220
    const/4 v10, 0x0

    .line 221
    invoke-direct/range {v4 .. v10}, Lun1;-><init>(JLjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 229
    .line 230
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw p0

    .line 234
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 235
    .line 236
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 240
    :catchall_0
    :cond_9
    :goto_2
    return-void

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
