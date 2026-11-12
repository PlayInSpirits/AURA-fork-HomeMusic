.class public final Lnt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static volatile l:Lnt0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:J

.field public h:J

.field public i:J

.field public j:F

.field public volatile k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnt0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lnt0;->c:I

    .line 13
    .line 14
    iput v0, p0, Lnt0;->d:I

    .line 15
    .line 16
    iput v0, p0, Lnt0;->e:I

    .line 17
    .line 18
    iput v0, p0, Lnt0;->f:I

    .line 19
    .line 20
    const-wide/16 v0, 0x0

    .line 21
    .line 22
    iput-wide v0, p0, Lnt0;->g:J

    .line 23
    .line 24
    iput-wide v0, p0, Lnt0;->h:J

    .line 25
    .line 26
    iput-wide v0, p0, Lnt0;->i:J

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lnt0;->j:F

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lnt0;->k:Ljava/lang/String;

    .line 33
    .line 34
    iput-boolean p1, p0, Lnt0;->b:Z

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 8

    .line 1
    iget v0, p0, Lnt0;->d:I

    .line 2
    .line 3
    iget v1, p0, Lnt0;->e:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    iget v1, p0, Lnt0;->f:I

    .line 7
    .line 8
    add-int/2addr v0, v1

    .line 9
    iget v1, p0, Lnt0;->c:I

    .line 10
    .line 11
    if-lt v0, v1, :cond_5

    .line 12
    .line 13
    if-lez v1, :cond_5

    .line 14
    .line 15
    iget-boolean v0, p0, Lnt0;->b:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    const-string v0, "notification"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/app/NotificationManager;

    .line 29
    .line 30
    const/16 v2, 0x3f4

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    iget v4, p0, Lnt0;->d:I

    .line 46
    .line 47
    const v5, 0x7f1303bf

    .line 48
    .line 49
    .line 50
    if-lez v4, :cond_1

    .line 51
    .line 52
    iget v6, p0, Lnt0;->e:I

    .line 53
    .line 54
    if-nez v6, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    iget v5, p0, Lnt0;->d:I

    .line 68
    .line 69
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const v7, 0x7f12000e

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v7, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    if-lez v4, :cond_2

    .line 89
    .line 90
    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget v4, p0, Lnt0;->d:I

    .line 98
    .line 99
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    iget v5, p0, Lnt0;->e:I

    .line 104
    .line 105
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    const v5, 0x7f1303ba

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v5, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    iget v4, p0, Lnt0;->e:I

    .line 125
    .line 126
    if-lez v4, :cond_4

    .line 127
    .line 128
    const v4, 0x7f1303b8

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    iget v5, p0, Lnt0;->e:I

    .line 143
    .line 144
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    const v7, 0x7f12000d

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v7, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    :goto_0
    new-instance v4, Ls63;

    .line 163
    .line 164
    const-string v5, "download_channel"

    .line 165
    .line 166
    invoke-direct {v4, p1, v5}, Ls63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-static {p1}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iput-object p1, v4, Ls63;->e:Ljava/lang/CharSequence;

    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {p1}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iput-object p1, v4, Ls63;->f:Ljava/lang/CharSequence;

    .line 188
    .line 189
    iget p1, p0, Lnt0;->e:I

    .line 190
    .line 191
    if-lez p1, :cond_3

    .line 192
    .line 193
    iget p1, p0, Lnt0;->d:I

    .line 194
    .line 195
    if-nez p1, :cond_3

    .line 196
    .line 197
    const p1, 0x7f080124

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_3
    const p1, 0x7f080118

    .line 202
    .line 203
    .line 204
    :goto_1
    iget-object v2, v4, Ls63;->v:Landroid/app/Notification;

    .line 205
    .line 206
    iput p1, v2, Landroid/app/Notification;->icon:I

    .line 207
    .line 208
    const/4 p1, 0x2

    .line 209
    invoke-virtual {v4, p1, v1}, Ls63;->c(IZ)V

    .line 210
    .line 211
    .line 212
    const/16 p1, 0x10

    .line 213
    .line 214
    invoke-virtual {v4, p1, v1}, Ls63;->c(IZ)V

    .line 215
    .line 216
    .line 217
    const/4 p1, 0x1

    .line 218
    iput-boolean p1, v4, Ls63;->w:Z

    .line 219
    .line 220
    iput v1, v4, Ls63;->i:I

    .line 221
    .line 222
    const/16 v2, 0x8

    .line 223
    .line 224
    invoke-virtual {v4, v2, p1}, Ls63;->c(IZ)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Ls63;->a()Landroid/app/Notification;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    const/16 v2, 0x3f5

    .line 232
    .line 233
    invoke-virtual {v0, v2, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 234
    .line 235
    .line 236
    :cond_4
    :goto_2
    iput v1, p0, Lnt0;->c:I

    .line 237
    .line 238
    iput v1, p0, Lnt0;->d:I

    .line 239
    .line 240
    iput v1, p0, Lnt0;->e:I

    .line 241
    .line 242
    iput v1, p0, Lnt0;->f:I

    .line 243
    .line 244
    const-wide/16 v0, 0x0

    .line 245
    .line 246
    iput-wide v0, p0, Lnt0;->g:J

    .line 247
    .line 248
    iput-wide v0, p0, Lnt0;->h:J

    .line 249
    .line 250
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 251
    .line 252
    .line 253
    move-result-wide v0

    .line 254
    iput-wide v0, p0, Lnt0;->i:J

    .line 255
    .line 256
    const/4 p1, 0x0

    .line 257
    iput p1, p0, Lnt0;->j:F

    .line 258
    .line 259
    const/4 p1, 0x0

    .line 260
    iput-object p1, p0, Lnt0;->k:Ljava/lang/String;

    .line 261
    .line 262
    return-void

    .line 263
    :cond_5
    invoke-virtual {p0, p1}, Lnt0;->d(Landroid/content/Context;)V

    .line 264
    .line 265
    .line 266
    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lnt0;->e:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    iput v1, p0, Lnt0;->e:I

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lnt0;->a(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public final c(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lnt0;->f:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    iput v1, p0, Lnt0;->f:I

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lnt0;->a(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public final d(Landroid/content/Context;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lnt0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lnt0;->d:I

    .line 7
    .line 8
    iget v1, p0, Lnt0;->e:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    iget v1, p0, Lnt0;->f:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    iget v1, p0, Lnt0;->c:I

    .line 15
    .line 16
    iget-object v2, p0, Lnt0;->k:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Lnt0;->k:Ljava/lang/String;

    .line 21
    .line 22
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const v3, 0x7f1303be

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const v2, 0x7f1303bc

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :goto_0
    if-lez v1, :cond_5

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const v4, 0x7f1303bb

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v3}, Lxa3;->i(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget p0, p0, Lnt0;->j:F

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    cmpl-float v4, p0, v4

    .line 70
    .line 71
    if-lez v4, :cond_4

    .line 72
    .line 73
    const v4, 0x49742400    # 1000000.0f

    .line 74
    .line 75
    .line 76
    cmpl-float v5, p0, v4

    .line 77
    .line 78
    if-ltz v5, :cond_2

    .line 79
    .line 80
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 81
    .line 82
    div-float/2addr p0, v4

    .line 83
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const-string v4, "%.1f MB/s"

    .line 92
    .line 93
    invoke-static {v5, v4, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    const/high16 v4, 0x447a0000    # 1000.0f

    .line 99
    .line 100
    cmpl-float v5, p0, v4

    .line 101
    .line 102
    if-ltz v5, :cond_3

    .line 103
    .line 104
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 105
    .line 106
    div-float/2addr p0, v4

    .line 107
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const-string v4, "%.0f KB/s"

    .line 116
    .line 117
    invoke-static {v5, v4, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    goto :goto_1

    .line 122
    :cond_3
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 123
    .line 124
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const-string v5, "%.0f B/s"

    .line 133
    .line 134
    invoke-static {v4, v5, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    :goto_1
    const-string v4, " \u2022 "

    .line 139
    .line 140
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    goto :goto_2

    .line 145
    :cond_4
    const-string p0, " \u2022 ? KB/s"

    .line 146
    .line 147
    :goto_2
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    goto :goto_3

    .line 155
    :cond_5
    const p0, 0x7f1303c1

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    :goto_3
    new-instance v3, Ls63;

    .line 163
    .line 164
    const-string v4, "download_channel"

    .line 165
    .line 166
    invoke-direct {v3, p1, v4}, Ls63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v2}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    iput-object v2, v3, Ls63;->e:Ljava/lang/CharSequence;

    .line 174
    .line 175
    invoke-static {p0}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    iput-object p0, v3, Ls63;->f:Ljava/lang/CharSequence;

    .line 180
    .line 181
    const p0, 0x7f080121

    .line 182
    .line 183
    .line 184
    iget-object v2, v3, Ls63;->v:Landroid/app/Notification;

    .line 185
    .line 186
    iput p0, v2, Landroid/app/Notification;->icon:I

    .line 187
    .line 188
    iput v1, v3, Ls63;->m:I

    .line 189
    .line 190
    iput v0, v3, Ls63;->n:I

    .line 191
    .line 192
    const/4 p0, 0x2

    .line 193
    const/4 v0, 0x1

    .line 194
    invoke-virtual {v3, p0, v0}, Ls63;->c(IZ)V

    .line 195
    .line 196
    .line 197
    iput-boolean v0, v3, Ls63;->w:Z

    .line 198
    .line 199
    const/4 p0, -0x1

    .line 200
    iput p0, v3, Ls63;->i:I

    .line 201
    .line 202
    const/16 p0, 0x8

    .line 203
    .line 204
    invoke-virtual {v3, p0, v0}, Ls63;->c(IZ)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Ls63;->a()Landroid/app/Notification;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    const-string v0, "notification"

    .line 212
    .line 213
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, Landroid/app/NotificationManager;

    .line 218
    .line 219
    const/16 v0, 0x3f4

    .line 220
    .line 221
    invoke-virtual {p1, v0, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 222
    .line 223
    .line 224
    return-void
.end method
