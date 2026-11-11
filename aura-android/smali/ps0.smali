.class public final synthetic Lps0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lps0;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lps0;->o:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lps0;->p:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lps0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v5, p0, Lps0;->p:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lps0;->o:Ljava/lang/String;

    .line 10
    .line 11
    check-cast p1, Lx34;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const-string v0, "INSERT OR IGNORE INTO synced_playlist (playlistId, serverId) VALUES (?, ?)"

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    :try_start_0
    invoke-interface {p1, v4}, Lz34;->e(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-interface {p1, v4, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-interface {p1, v3, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lz34;->O()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :pswitch_0
    const-string v0, "DELETE FROM synced_playlist WHERE playlistId = ? AND serverId = ?"

    .line 48
    .line 49
    invoke-interface {p1, v0}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    :try_start_1
    invoke-interface {p1, v4}, Lz34;->e(I)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception p0

    .line 60
    goto :goto_4

    .line 61
    :cond_1
    invoke-interface {p1, v4, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_2
    if-nez v5, :cond_2

    .line 65
    .line 66
    invoke-interface {p1, v3}, Lz34;->e(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    invoke-interface {p1, v3, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_3
    invoke-interface {p1}, Lz34;->O()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :goto_4
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :pswitch_1
    const-string v0, "SELECT EXISTS(SELECT 1 FROM synced_playlist WHERE playlistId = ? AND serverId = ?)"

    .line 85
    .line 86
    invoke-interface {p1, v0}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-nez p0, :cond_3

    .line 91
    .line 92
    :try_start_2
    invoke-interface {p1, v4}, Lz34;->e(I)V

    .line 93
    .line 94
    .line 95
    goto :goto_5

    .line 96
    :catchall_2
    move-exception p0

    .line 97
    goto :goto_8

    .line 98
    :cond_3
    invoke-interface {p1, v4, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_5
    invoke-interface {p1, v3, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1}, Lz34;->O()Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_7

    .line 109
    .line 110
    invoke-interface {p1, v1}, Lz34;->isNull(I)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_4

    .line 115
    .line 116
    move-object p0, v2

    .line 117
    goto :goto_6

    .line 118
    :cond_4
    invoke-interface {p1, v1}, Lz34;->getLong(I)J

    .line 119
    .line 120
    .line 121
    move-result-wide v5

    .line 122
    long-to-int p0, v5

    .line 123
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :goto_6
    if-nez p0, :cond_5

    .line 128
    .line 129
    goto :goto_7

    .line 130
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_6

    .line 135
    .line 136
    move v1, v4

    .line 137
    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 141
    :cond_7
    :goto_7
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 142
    .line 143
    .line 144
    return-object v2

    .line 145
    :goto_8
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 146
    .line 147
    .line 148
    throw p0

    .line 149
    :pswitch_2
    const-string v0, "UPDATE playlist SET name = ? WHERE id = ?"

    .line 150
    .line 151
    invoke-interface {p1, v0}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-nez p0, :cond_8

    .line 156
    .line 157
    :try_start_3
    invoke-interface {p1, v4}, Lz34;->e(I)V

    .line 158
    .line 159
    .line 160
    goto :goto_9

    .line 161
    :catchall_3
    move-exception p0

    .line 162
    goto :goto_b

    .line 163
    :cond_8
    invoke-interface {p1, v4, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :goto_9
    if-nez v5, :cond_9

    .line 167
    .line 168
    invoke-interface {p1, v3}, Lz34;->e(I)V

    .line 169
    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_9
    invoke-interface {p1, v3, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :goto_a
    invoke-interface {p1}, Lz34;->O()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 176
    .line 177
    .line 178
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 179
    .line 180
    .line 181
    return-object v2

    .line 182
    :goto_b
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 183
    .line 184
    .line 185
    throw p0

    .line 186
    :pswitch_3
    const-string v0, "SELECT COUNT(*) FROM download WHERE album_id = ? AND NULLIF(album_artist, \'\') IS NULL AND NULLIF(album, \'\') <> ? AND download_state = 1"

    .line 187
    .line 188
    invoke-interface {p1, v0}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    if-nez p0, :cond_a

    .line 193
    .line 194
    :try_start_4
    invoke-interface {p1, v4}, Lz34;->e(I)V

    .line 195
    .line 196
    .line 197
    goto :goto_c

    .line 198
    :catchall_4
    move-exception p0

    .line 199
    goto :goto_d

    .line 200
    :cond_a
    invoke-interface {p1, v4, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :goto_c
    invoke-interface {p1, v3, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-interface {p1}, Lz34;->O()Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-eqz p0, :cond_b

    .line 211
    .line 212
    invoke-interface {p1, v1}, Lz34;->getLong(I)J

    .line 213
    .line 214
    .line 215
    move-result-wide v0

    .line 216
    long-to-int v1, v0

    .line 217
    :cond_b
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 221
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 222
    .line 223
    .line 224
    return-object p0

    .line 225
    :goto_d
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 226
    .line 227
    .line 228
    throw p0

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
