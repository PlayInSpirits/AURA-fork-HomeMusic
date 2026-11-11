.class public final synthetic Lus1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:J

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IJI)V
    .locals 0

    .line 16
    iput p6, p0, Lus1;->n:I

    iput-object p1, p0, Lus1;->q:Ljava/lang/Object;

    iput-object p2, p0, Lus1;->r:Ljava/lang/Object;

    iput p3, p0, Lus1;->o:I

    iput-wide p4, p0, Lus1;->p:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lvb4;ILandroidx/preference/Preference;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lus1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lus1;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lus1;->o:I

    .line 10
    .line 11
    iput-object p3, p0, Lus1;->r:Ljava/lang/Object;

    .line 12
    .line 13
    iput-wide p4, p0, Lus1;->p:J

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lus1;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lus1;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lus1;->q:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Ljava/util/List;

    .line 11
    .line 12
    move-object v4, v1

    .line 13
    check-cast v4, Lbj2;

    .line 14
    .line 15
    invoke-static {v2}, Lgi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    new-instance v0, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lwn2;

    .line 29
    .line 30
    const/4 v9, 0x1

    .line 31
    iget v6, p0, Lus1;->o:I

    .line 32
    .line 33
    iget-wide v7, p0, Lus1;->p:J

    .line 34
    .line 35
    invoke-direct/range {v3 .. v9}, Lwn2;-><init>(Lbj2;Ljava/util/ArrayList;IJI)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lu52;->c()Lv52;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-boolean p0, p0, Lv52;->a:Z

    .line 46
    .line 47
    if-nez p0, :cond_0

    .line 48
    .line 49
    new-instance p0, Lvs3;

    .line 50
    .line 51
    invoke-direct {p0}, Lvs3;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-virtual {p0, v2, v0, v1}, Lvs3;->c(Ljava/util/List;ZI)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void

    .line 60
    :pswitch_0
    check-cast v2, Lic2;

    .line 61
    .line 62
    move-object v4, v1

    .line 63
    check-cast v4, Ljava/util/List;

    .line 64
    .line 65
    iget v6, p0, Lus1;->o:I

    .line 66
    .line 67
    iget-wide v7, p0, Lus1;->p:J

    .line 68
    .line 69
    :try_start_0
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_1

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    move-object v5, p0

    .line 80
    check-cast v5, Lbj2;

    .line 81
    .line 82
    sget-object p0, Lbo2;->d:Ljava/util/concurrent/ExecutorService;

    .line 83
    .line 84
    new-instance v3, Lus1;

    .line 85
    .line 86
    const/4 v9, 0x2

    .line 87
    invoke-direct/range {v3 .. v9}, Lus1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IJI)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_0
    move-exception v0

    .line 95
    move-object p0, v0

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v1, "Error in startQueue: "

    .line 99
    .line 100
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v1, "MediaManager"

    .line 115
    .line 116
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 117
    .line 118
    .line 119
    :cond_1
    :goto_0
    return-void

    .line 120
    :pswitch_1
    check-cast v2, Lvb4;

    .line 121
    .line 122
    check-cast v1, Landroidx/preference/Preference;

    .line 123
    .line 124
    invoke-virtual {v2}, Lkc1;->y()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    iget v0, p0, Lus1;->o:I

    .line 131
    .line 132
    if-nez v0, :cond_2

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_2
    const v3, 0x7f13021e

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    const-wide/32 v5, 0x40000000

    .line 151
    .line 152
    .line 153
    iget-wide v7, p0, Lus1;->p:J

    .line 154
    .line 155
    cmp-long p0, v7, v5

    .line 156
    .line 157
    if-ltz p0, :cond_3

    .line 158
    .line 159
    long-to-double v5, v7

    .line 160
    const-wide/high16 v7, 0x41d0000000000000L    # 1.073741824E9

    .line 161
    .line 162
    div-double/2addr v5, v7

    .line 163
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    const v5, 0x7f130232

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v5, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_3
    long-to-double v5, v7

    .line 183
    const-wide/high16 v7, 0x4130000000000000L    # 1048576.0

    .line 184
    .line 185
    div-double/2addr v5, v7

    .line 186
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    const v5, 0x7f130233

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v5, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    :goto_1
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    const v0, 0x7f13021d

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v0, p0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v2, "\n"

    .line 224
    .line 225
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {v1, p0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 236
    .line 237
    .line 238
    :cond_4
    :goto_2
    return-void

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
