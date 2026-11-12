.class public final Lft0;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:Ljava/util/List;

.field public v:Ljava/util/List;

.field public w:Ljava/util/List;

.field public final x:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lft0;->x:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lft0;->q:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 12
    .line 13
    const-string p1, "download_type_track"

    .line 14
    .line 15
    iput-object p1, p0, Lft0;->r:Ljava/lang/String;

    .line 16
    .line 17
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    iput-object p1, p0, Lft0;->u:Ljava/util/List;

    .line 20
    .line 21
    iput-object p1, p0, Lft0;->w:Ljava/util/List;

    .line 22
    .line 23
    return-void
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 5

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x5

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, -0x1

    .line 11
    sparse-switch v0, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :sswitch_0
    const-string v0, "download_type_track"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v4, v1

    .line 25
    goto :goto_0

    .line 26
    :sswitch_1
    const-string v0, "download_type_genre"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v4, 0x4

    .line 36
    goto :goto_0

    .line 37
    :sswitch_2
    const-string v0, "download_type_album"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v4, 0x3

    .line 47
    goto :goto_0

    .line 48
    :sswitch_3
    const-string v0, "download_type_playlist"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 v4, 0x2

    .line 58
    goto :goto_0

    .line 59
    :sswitch_4
    const-string v0, "download_type_year"

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    move v4, v2

    .line 69
    goto :goto_0

    .line 70
    :sswitch_5
    const-string v0, "download_type_artist"

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    move v4, v3

    .line 80
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :pswitch_0
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    new-instance p2, Lat0;

    .line 90
    .line 91
    invoke-direct {p2, v3, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-interface {p0}, Ljava/util/stream/Stream;->count()J

    .line 99
    .line 100
    .line 101
    move-result-wide p0

    .line 102
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :pswitch_1
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance p2, Lat0;

    .line 112
    .line 113
    invoke-direct {p2, v1, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-interface {p0}, Ljava/util/stream/Stream;->count()J

    .line 121
    .line 122
    .line 123
    move-result-wide p0

    .line 124
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :pswitch_2
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    new-instance p2, Lat0;

    .line 134
    .line 135
    invoke-direct {p2, v2, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-interface {p0}, Ljava/util/stream/Stream;->count()J

    .line 143
    .line 144
    .line 145
    move-result-wide p0

    .line 146
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_3
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    new-instance p2, Lat0;

    .line 156
    .line 157
    const/16 v0, 0xb

    .line 158
    .line 159
    invoke-direct {p2, v0, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-interface {p0}, Ljava/util/stream/Stream;->count()J

    .line 167
    .line 168
    .line 169
    move-result-wide p0

    .line 170
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_4
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    new-instance p2, Lat0;

    .line 180
    .line 181
    const/16 v0, 0x9

    .line 182
    .line 183
    invoke-direct {p2, v0, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-interface {p0}, Ljava/util/stream/Stream;->count()J

    .line 191
    .line 192
    .line 193
    move-result-wide p0

    .line 194
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0

    .line 199
    :pswitch_5
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    new-instance p2, Lat0;

    .line 204
    .line 205
    const/16 v0, 0xa

    .line 206
    .line 207
    invoke-direct {p2, v0, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-interface {p0}, Ljava/util/stream/Stream;->count()J

    .line 215
    .line 216
    .line 217
    move-result-wide p0

    .line 218
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :cond_6
    :goto_1
    const-string p0, "0"

    .line 224
    .line 225
    return-object p0

    .line 226
    nop

    .line 227
    :sswitch_data_0
    .sparse-switch
        -0x7eb7cd4b -> :sswitch_5
        -0x380820d5 -> :sswitch_4
        0x944b1c0 -> :sswitch_3
        0x35b50541 -> :sswitch_2
        0x36069055 -> :sswitch_1
        0x36c3781d -> :sswitch_0
    .end sparse-switch

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 5

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x4

    .line 11
    const/4 v2, 0x3

    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, -0x1

    .line 14
    sparse-switch v0, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :sswitch_0
    const-string v0, "download_type_track"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v4, 0x5

    .line 28
    goto :goto_0

    .line 29
    :sswitch_1
    const-string v0, "download_type_genre"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v4, v1

    .line 39
    goto :goto_0

    .line 40
    :sswitch_2
    const-string v0, "download_type_album"

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move v4, v2

    .line 50
    goto :goto_0

    .line 51
    :sswitch_3
    const-string v0, "download_type_playlist"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    move v4, v3

    .line 61
    goto :goto_0

    .line 62
    :sswitch_4
    const-string v0, "download_type_year"

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_4

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    const/4 v4, 0x1

    .line 72
    goto :goto_0

    .line 73
    :sswitch_5
    const-string v0, "download_type_artist"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-nez p0, :cond_5

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    const/4 v4, 0x0

    .line 83
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 84
    .line 85
    .line 86
    goto/16 :goto_1

    .line 87
    .line 88
    :pswitch_0
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    new-instance p2, Lat0;

    .line 93
    .line 94
    invoke-direct {p2, v3, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, Ljava/util/List;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_1
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    new-instance p2, Lat0;

    .line 117
    .line 118
    invoke-direct {p2, v1, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Ljava/util/List;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_2
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    new-instance p2, Lat0;

    .line 141
    .line 142
    invoke-direct {p2, v2, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    check-cast p0, Ljava/util/List;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_3
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    new-instance p2, Lat0;

    .line 165
    .line 166
    const/16 v0, 0x8

    .line 167
    .line 168
    invoke-direct {p2, v0, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    check-cast p0, Ljava/util/List;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_4
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance p2, Lat0;

    .line 191
    .line 192
    const/4 v0, 0x6

    .line 193
    invoke-direct {p2, v0, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    check-cast p0, Ljava/util/List;

    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_5
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    new-instance p2, Lat0;

    .line 216
    .line 217
    const/4 v0, 0x7

    .line 218
    invoke-direct {p2, v0, p1}, Lat0;-><init>(ILjava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    check-cast p0, Ljava/util/List;

    .line 234
    .line 235
    return-object p0

    .line 236
    :cond_6
    :goto_1
    return-object p2

    .line 237
    :sswitch_data_0
    .sparse-switch
        -0x7eb7cd4b -> :sswitch_5
        -0x380820d5 -> :sswitch_4
        0x944b1c0 -> :sswitch_3
        0x35b50541 -> :sswitch_2
        0x36069055 -> :sswitch_1
        0x36c3781d -> :sswitch_0
    .end sparse-switch

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static r(Lcom/eddyizm/tempus/subsonic/models/Child;Lcom/eddyizm/tempus/subsonic/models/Child;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lft0;->w:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final g(Lcx3;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, Let0;

    .line 8
    .line 9
    iget-object v3, v2, Lcx3;->a:Landroid/view/View;

    .line 10
    .line 11
    iget-object v4, v2, Let0;->u:Llv4;

    .line 12
    .line 13
    iget-object v5, v0, Lft0;->r:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    const-string v7, "download_type_genre"

    .line 23
    .line 24
    const-string v8, "download_type_album"

    .line 25
    .line 26
    const-string v9, "download_type_playlist"

    .line 27
    .line 28
    const-string v10, "download_type_year"

    .line 29
    .line 30
    const-string v11, "download_type_artist"

    .line 31
    .line 32
    const/4 v12, 0x0

    .line 33
    const/4 v13, -0x1

    .line 34
    sparse-switch v6, :sswitch_data_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :sswitch_0
    const-string v6, "download_type_track"

    .line 39
    .line 40
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v13, 0x5

    .line 48
    goto :goto_0

    .line 49
    :sswitch_1
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/4 v13, 0x4

    .line 57
    goto :goto_0

    .line 58
    :sswitch_2
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v13, 0x3

    .line 66
    goto :goto_0

    .line 67
    :sswitch_3
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 v13, 0x2

    .line 75
    goto :goto_0

    .line 76
    :sswitch_4
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-nez v5, :cond_4

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    const/4 v13, 0x1

    .line 84
    goto :goto_0

    .line 85
    :sswitch_5
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_5

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    move v13, v12

    .line 93
    :goto_0
    const v5, 0x7f07032f

    .line 94
    .line 95
    .line 96
    const/16 v14, 0x9

    .line 97
    .line 98
    const v15, 0x7f1300e8

    .line 99
    .line 100
    .line 101
    const/16 v6, 0x8

    .line 102
    .line 103
    packed-switch v13, :pswitch_data_0

    .line 104
    .line 105
    .line 106
    goto/16 :goto_a

    .line 107
    .line 108
    :pswitch_0
    iget-object v2, v0, Lft0;->w:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 115
    .line 116
    iget-object v7, v4, Llv4;->s:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v7, Landroid/widget/TextView;

    .line 119
    .line 120
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    iget-object v7, v4, Llv4;->r:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v7, Landroid/widget/TextView;

    .line 130
    .line 131
    iget-object v8, v4, Llv4;->t:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v8, Landroid/widget/ImageView;

    .line 134
    .line 135
    iget-object v9, v4, Llv4;->o:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v9, Landroid/widget/LinearLayout;

    .line 138
    .line 139
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-static {v13}, Le03;->g(Ljava/lang/Integer;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    invoke-static {v2}, Le03;->f(Lcom/eddyizm/tempus/subsonic/models/Child;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v15

    .line 159
    filled-new-array {v11, v13, v15}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    const v13, 0x7f13054d

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10, v13, v11}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    iget-object v7, v4, Llv4;->p:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v7, Landroid/widget/TextView;

    .line 176
    .line 177
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-static {v7}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    if-eqz v2, :cond_6

    .line 197
    .line 198
    invoke-static {}, Lud3;->t()I

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    invoke-static {v11, v2}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    goto :goto_1

    .line 207
    :cond_6
    const/4 v11, 0x0

    .line 208
    :goto_1
    invoke-static {v7, v2, v14, v10, v11}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-virtual {v2, v7}, Lvz3;->T(Lxv0;)Lvz3;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-static {}, Lud3;->R()Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-eqz v7, :cond_7

    .line 225
    .line 226
    invoke-virtual {v2}, Llq;->l()Llq;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    check-cast v2, Lvz3;

    .line 231
    .line 232
    :cond_7
    invoke-virtual {v2, v8}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v8, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 236
    .line 237
    .line 238
    iget-object v2, v4, Llv4;->q:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Landroid/widget/FrameLayout;

    .line 241
    .line 242
    invoke-virtual {v2, v12}, Landroid/view/View;->setVisibility(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v9, v12}, Landroid/view/View;->setVisibility(I)V

    .line 246
    .line 247
    .line 248
    if-lez v1, :cond_8

    .line 249
    .line 250
    iget-object v2, v0, Lft0;->w:Ljava/util/List;

    .line 251
    .line 252
    add-int/lit8 v4, v1, -0x1

    .line 253
    .line 254
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    if-eqz v2, :cond_8

    .line 259
    .line 260
    iget-object v2, v0, Lft0;->w:Ljava/util/List;

    .line 261
    .line 262
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 267
    .line 268
    iget-object v0, v0, Lft0;->w:Ljava/util/List;

    .line 269
    .line 270
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 275
    .line 276
    invoke-static {v2, v0}, Lft0;->r(Lcom/eddyizm/tempus/subsonic/models/Child;Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-nez v0, :cond_8

    .line 281
    .line 282
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    float-to-int v0, v0

    .line 295
    invoke-virtual {v9, v12, v0, v12, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :cond_8
    if-lez v1, :cond_15

    .line 300
    .line 301
    invoke-virtual {v9, v6}, Landroid/view/View;->setVisibility(I)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_1
    iget-object v2, v0, Lft0;->w:Ljava/util/List;

    .line 306
    .line 307
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 312
    .line 313
    iget-object v2, v4, Llv4;->s:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v2, Landroid/widget/TextView;

    .line 316
    .line 317
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    .line 323
    .line 324
    iget-object v2, v4, Llv4;->r:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v2, Landroid/widget/TextView;

    .line 327
    .line 328
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    iget-object v0, v0, Lft0;->u:Ljava/util/List;

    .line 337
    .line 338
    invoke-static {v7, v1, v0}, Lft0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v3, v15, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    .line 352
    .line 353
    iget-object v0, v4, Llv4;->t:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, Landroid/widget/ImageView;

    .line 356
    .line 357
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 358
    .line 359
    .line 360
    iget-object v0, v4, Llv4;->q:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Landroid/widget/FrameLayout;

    .line 363
    .line 364
    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    .line 365
    .line 366
    .line 367
    iget-object v0, v4, Llv4;->o:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, Landroid/widget/LinearLayout;

    .line 370
    .line 371
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 372
    .line 373
    .line 374
    return-void

    .line 375
    :pswitch_2
    iget-object v2, v0, Lft0;->w:Ljava/util/List;

    .line 376
    .line 377
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 382
    .line 383
    iget-object v7, v4, Llv4;->s:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v7, Landroid/widget/TextView;

    .line 386
    .line 387
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v9

    .line 391
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 392
    .line 393
    .line 394
    iget-object v7, v4, Llv4;->r:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v7, Landroid/widget/TextView;

    .line 397
    .line 398
    iget-object v9, v4, Llv4;->t:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v9, Landroid/widget/ImageView;

    .line 401
    .line 402
    iget-object v10, v4, Llv4;->o:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v10, Landroid/widget/LinearLayout;

    .line 405
    .line 406
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 407
    .line 408
    .line 409
    move-result-object v11

    .line 410
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v13

    .line 414
    iget-object v6, v0, Lft0;->u:Ljava/util/List;

    .line 415
    .line 416
    invoke-static {v8, v13, v6}, Lft0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    invoke-virtual {v11, v15, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v6

    .line 428
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    .line 430
    .line 431
    iget-object v6, v4, Llv4;->p:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v6, Landroid/widget/TextView;

    .line 434
    .line 435
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    if-eqz v7, :cond_9

    .line 440
    .line 441
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    if-nez v8, :cond_9

    .line 446
    .line 447
    goto :goto_2

    .line 448
    :cond_9
    const/4 v7, 0x0

    .line 449
    :goto_2
    if-eqz v7, :cond_a

    .line 450
    .line 451
    goto :goto_3

    .line 452
    :cond_a
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    :goto_3
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    invoke-static {v6}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    if-eqz v2, :cond_b

    .line 472
    .line 473
    invoke-static {}, Lud3;->t()I

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    invoke-static {v8, v2}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    goto :goto_4

    .line 482
    :cond_b
    const/4 v8, 0x0

    .line 483
    :goto_4
    invoke-static {v6, v2, v14, v7, v8}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 488
    .line 489
    .line 490
    move-result-object v6

    .line 491
    invoke-virtual {v2, v6}, Lvz3;->T(Lxv0;)Lvz3;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    invoke-static {}, Lud3;->R()Z

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    if-eqz v6, :cond_c

    .line 500
    .line 501
    invoke-virtual {v2}, Llq;->l()Llq;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    check-cast v2, Lvz3;

    .line 506
    .line 507
    :cond_c
    invoke-virtual {v2, v9}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v9, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 511
    .line 512
    .line 513
    iget-object v2, v4, Llv4;->q:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v2, Landroid/widget/FrameLayout;

    .line 516
    .line 517
    invoke-virtual {v2, v12}, Landroid/view/View;->setVisibility(I)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v10, v12}, Landroid/view/View;->setVisibility(I)V

    .line 521
    .line 522
    .line 523
    if-lez v1, :cond_11

    .line 524
    .line 525
    iget-object v2, v0, Lft0;->w:Ljava/util/List;

    .line 526
    .line 527
    add-int/lit8 v4, v1, -0x1

    .line 528
    .line 529
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    if-eqz v2, :cond_11

    .line 534
    .line 535
    iget-object v2, v0, Lft0;->w:Ljava/util/List;

    .line 536
    .line 537
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 542
    .line 543
    iget-object v0, v0, Lft0;->w:Ljava/util/List;

    .line 544
    .line 545
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 550
    .line 551
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v4

    .line 555
    if-eqz v4, :cond_d

    .line 556
    .line 557
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    if-nez v6, :cond_d

    .line 562
    .line 563
    goto :goto_5

    .line 564
    :cond_d
    const/4 v4, 0x0

    .line 565
    :goto_5
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    if-eqz v6, :cond_e

    .line 570
    .line 571
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 572
    .line 573
    .line 574
    move-result v7

    .line 575
    if-nez v7, :cond_e

    .line 576
    .line 577
    goto :goto_6

    .line 578
    :cond_e
    const/4 v6, 0x0

    .line 579
    :goto_6
    if-nez v4, :cond_10

    .line 580
    .line 581
    if-eqz v6, :cond_f

    .line 582
    .line 583
    goto :goto_7

    .line 584
    :cond_f
    invoke-static {v2, v0}, Lft0;->r(Lcom/eddyizm/tempus/subsonic/models/Child;Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    goto :goto_8

    .line 589
    :cond_10
    :goto_7
    invoke-static {v4, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    :goto_8
    if-nez v0, :cond_11

    .line 594
    .line 595
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    float-to-int v0, v0

    .line 608
    invoke-virtual {v10, v12, v0, v12, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 609
    .line 610
    .line 611
    return-void

    .line 612
    :cond_11
    if-lez v1, :cond_15

    .line 613
    .line 614
    const/16 v0, 0x8

    .line 615
    .line 616
    invoke-virtual {v10, v0}, Landroid/view/View;->setVisibility(I)V

    .line 617
    .line 618
    .line 619
    return-void

    .line 620
    :pswitch_3
    iget-object v5, v0, Lft0;->w:Ljava/util/List;

    .line 621
    .line 622
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v5

    .line 626
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 627
    .line 628
    instance-of v6, v5, Lcom/eddyizm/tempus/model/Download;

    .line 629
    .line 630
    if-eqz v6, :cond_15

    .line 631
    .line 632
    check-cast v5, Lcom/eddyizm/tempus/model/Download;

    .line 633
    .line 634
    iget-object v6, v4, Llv4;->s:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v6, Landroid/widget/TextView;

    .line 637
    .line 638
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Download;->getPlaylistName()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v7

    .line 642
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 643
    .line 644
    .line 645
    iget-object v6, v4, Llv4;->r:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v6, Landroid/widget/TextView;

    .line 648
    .line 649
    iget-object v7, v4, Llv4;->t:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v7, Landroid/widget/ImageView;

    .line 652
    .line 653
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 654
    .line 655
    .line 656
    move-result-object v8

    .line 657
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v10

    .line 661
    iget-object v11, v0, Lft0;->u:Ljava/util/List;

    .line 662
    .line 663
    invoke-static {v9, v10, v11}, Lft0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v9

    .line 667
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v9

    .line 671
    invoke-virtual {v8, v15, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v8

    .line 675
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v6

    .line 682
    iget-object v8, v0, Lft0;->x:Ljava/util/HashMap;

    .line 683
    .line 684
    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v8

    .line 688
    check-cast v8, Ljava/lang/String;

    .line 689
    .line 690
    if-nez v8, :cond_12

    .line 691
    .line 692
    new-instance v8, Ljava/lang/Thread;

    .line 693
    .line 694
    new-instance v9, Lct0;

    .line 695
    .line 696
    invoke-direct {v9, v0, v6, v2, v1}, Lct0;-><init>(Lft0;Ljava/lang/String;Let0;I)V

    .line 697
    .line 698
    .line 699
    invoke-direct {v8, v9}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v8}, Ljava/lang/Thread;->start()V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v8

    .line 709
    :cond_12
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-static {v0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    if-eqz v8, :cond_13

    .line 718
    .line 719
    invoke-static {}, Lud3;->t()I

    .line 720
    .line 721
    .line 722
    move-result v2

    .line 723
    invoke-static {v2, v8}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v6

    .line 727
    goto :goto_9

    .line 728
    :cond_13
    const/4 v6, 0x0

    .line 729
    :goto_9
    invoke-static {v0, v8, v14, v1, v6}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    invoke-virtual {v0, v1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    invoke-static {}, Lud3;->R()Z

    .line 742
    .line 743
    .line 744
    move-result v1

    .line 745
    if-eqz v1, :cond_14

    .line 746
    .line 747
    invoke-virtual {v0}, Llq;->l()Llq;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    check-cast v0, Lvz3;

    .line 752
    .line 753
    :cond_14
    invoke-virtual {v0, v7}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v7, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 757
    .line 758
    .line 759
    iget-object v0, v4, Llv4;->q:Ljava/lang/Object;

    .line 760
    .line 761
    check-cast v0, Landroid/widget/FrameLayout;

    .line 762
    .line 763
    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    .line 764
    .line 765
    .line 766
    iget-object v0, v4, Llv4;->o:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v0, Landroid/widget/LinearLayout;

    .line 769
    .line 770
    const/16 v1, 0x8

    .line 771
    .line 772
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 773
    .line 774
    .line 775
    :cond_15
    :goto_a
    return-void

    .line 776
    :pswitch_4
    iget-object v2, v0, Lft0;->w:Ljava/util/List;

    .line 777
    .line 778
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 783
    .line 784
    iget-object v2, v4, Llv4;->s:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v2, Landroid/widget/TextView;

    .line 787
    .line 788
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 789
    .line 790
    .line 791
    move-result-object v5

    .line 792
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v5

    .line 796
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 797
    .line 798
    .line 799
    iget-object v2, v4, Llv4;->r:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v2, Landroid/widget/TextView;

    .line 802
    .line 803
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    iget-object v0, v0, Lft0;->u:Ljava/util/List;

    .line 816
    .line 817
    invoke-static {v10, v1, v0}, Lft0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    invoke-virtual {v3, v15, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 830
    .line 831
    .line 832
    iget-object v0, v4, Llv4;->t:Ljava/lang/Object;

    .line 833
    .line 834
    check-cast v0, Landroid/widget/ImageView;

    .line 835
    .line 836
    const/16 v1, 0x8

    .line 837
    .line 838
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 839
    .line 840
    .line 841
    iget-object v0, v4, Llv4;->q:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v0, Landroid/widget/FrameLayout;

    .line 844
    .line 845
    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    .line 846
    .line 847
    .line 848
    iget-object v0, v4, Llv4;->o:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v0, Landroid/widget/LinearLayout;

    .line 851
    .line 852
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 853
    .line 854
    .line 855
    return-void

    .line 856
    :pswitch_5
    iget-object v2, v0, Lft0;->w:Ljava/util/List;

    .line 857
    .line 858
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 863
    .line 864
    iget-object v2, v4, Llv4;->s:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v2, Landroid/widget/TextView;

    .line 867
    .line 868
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v5

    .line 872
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 873
    .line 874
    .line 875
    iget-object v2, v4, Llv4;->r:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v2, Landroid/widget/TextView;

    .line 878
    .line 879
    iget-object v5, v4, Llv4;->t:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v5, Landroid/widget/ImageView;

    .line 882
    .line 883
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 884
    .line 885
    .line 886
    move-result-object v6

    .line 887
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v7

    .line 891
    iget-object v0, v0, Lft0;->u:Ljava/util/List;

    .line 892
    .line 893
    invoke-static {v11, v7, v0}, Lft0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-virtual {v6, v15, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v1

    .line 916
    invoke-static {v0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    if-eqz v1, :cond_16

    .line 921
    .line 922
    invoke-static {}, Lud3;->t()I

    .line 923
    .line 924
    .line 925
    move-result v3

    .line 926
    invoke-static {v3, v1}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v6

    .line 930
    goto :goto_b

    .line 931
    :cond_16
    const/4 v6, 0x0

    .line 932
    :goto_b
    invoke-static {v0, v1, v14, v2, v6}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    invoke-virtual {v0, v1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    invoke-static {}, Lud3;->R()Z

    .line 945
    .line 946
    .line 947
    move-result v1

    .line 948
    if-eqz v1, :cond_17

    .line 949
    .line 950
    invoke-virtual {v0}, Llq;->l()Llq;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    check-cast v0, Lvz3;

    .line 955
    .line 956
    :cond_17
    invoke-virtual {v0, v5}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v5, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 960
    .line 961
    .line 962
    iget-object v0, v4, Llv4;->q:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast v0, Landroid/widget/FrameLayout;

    .line 965
    .line 966
    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    .line 967
    .line 968
    .line 969
    iget-object v0, v4, Llv4;->o:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v0, Landroid/widget/LinearLayout;

    .line 972
    .line 973
    const/16 v1, 0x8

    .line 974
    .line 975
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 976
    .line 977
    .line 978
    return-void

    .line 979
    :sswitch_data_0
    .sparse-switch
        -0x7eb7cd4b -> :sswitch_5
        -0x380820d5 -> :sswitch_4
        0x944b1c0 -> :sswitch_3
        0x35b50541 -> :sswitch_2
        0x36069055 -> :sswitch_1
        0x36c3781d -> :sswitch_0
    .end sparse-switch

    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 9

    .line 1
    const p2, 0x7f0d00a0

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {p1, p2, p1, v0}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x7f0a01bf

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Landroid/widget/LinearLayout;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const p2, 0x7f0a01ca

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, Landroid/widget/FrameLayout;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const p2, 0x7f0a01cb

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v5, v0

    .line 41
    check-cast v5, Landroid/widget/TextView;

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    const p2, 0x7f0a01cc

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v6, v0

    .line 53
    check-cast v6, Landroid/widget/TextView;

    .line 54
    .line 55
    if-eqz v6, :cond_0

    .line 56
    .line 57
    const p2, 0x7f0a01cd

    .line 58
    .line 59
    .line 60
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v7, v0

    .line 65
    check-cast v7, Landroid/widget/TextView;

    .line 66
    .line 67
    if-eqz v7, :cond_0

    .line 68
    .line 69
    const p2, 0x7f0a0325

    .line 70
    .line 71
    .line 72
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v8, v0

    .line 77
    check-cast v8, Landroid/widget/ImageView;

    .line 78
    .line 79
    if-eqz v8, :cond_0

    .line 80
    .line 81
    new-instance v1, Llv4;

    .line 82
    .line 83
    move-object v2, p1

    .line 84
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 85
    .line 86
    invoke-direct/range {v1 .. v8}, Llv4;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, Let0;

    .line 90
    .line 91
    invoke-direct {p1, p0, v1}, Let0;-><init>(Lft0;Llv4;)V

    .line 92
    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const-string p1, "Missing required view with ID: "

    .line 104
    .line 105
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 p0, 0x0

    .line 113
    return-object p0
.end method

.method public final s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object/from16 v3, p1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v3, p2

    .line 13
    .line 14
    :goto_0
    iput-object v3, v0, Lft0;->r:Ljava/lang/String;

    .line 15
    .line 16
    move-object/from16 v4, p2

    .line 17
    .line 18
    iput-object v4, v0, Lft0;->s:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v1, v0, Lft0;->t:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v2, v0, Lft0;->u:Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const-string v4, "download_type_track"

    .line 32
    .line 33
    const-string v5, "download_type_genre"

    .line 34
    .line 35
    const-string v6, "download_type_album"

    .line 36
    .line 37
    const-string v7, "download_type_playlist"

    .line 38
    .line 39
    const-string v8, "download_type_year"

    .line 40
    .line 41
    const-string v9, "download_type_artist"

    .line 42
    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v14, 0x5

    .line 45
    const/4 v15, 0x4

    .line 46
    const/4 v10, 0x3

    .line 47
    sparse-switch v1, :sswitch_data_0

    .line 48
    .line 49
    .line 50
    :goto_1
    const/4 v1, -0x1

    .line 51
    goto :goto_2

    .line 52
    :sswitch_0
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move v1, v14

    .line 60
    goto :goto_2

    .line 61
    :sswitch_1
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v1, v15

    .line 69
    goto :goto_2

    .line 70
    :sswitch_2
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move v1, v10

    .line 78
    goto :goto_2

    .line 79
    :sswitch_3
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    const/4 v1, 0x2

    .line 87
    goto :goto_2

    .line 88
    :sswitch_4
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_5

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    const/4 v1, 0x1

    .line 96
    goto :goto_2

    .line 97
    :sswitch_5
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_6

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    move v1, v13

    .line 105
    :goto_2
    packed-switch v1, :pswitch_data_0

    .line 106
    .line 107
    .line 108
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 109
    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    :pswitch_0
    iget-object v1, v0, Lft0;->s:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v3, v0, Lft0;->t:Ljava/lang/String;

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    new-instance v12, Lc7;

    .line 121
    .line 122
    invoke-direct {v12, v10}, Lc7;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v11, v12}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    new-instance v12, Lm7;

    .line 130
    .line 131
    const/16 v10, 0x11

    .line 132
    .line 133
    invoke-direct {v12, v10}, Lm7;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-static {v12}, Lq05;->j(Ljava/util/function/Function;)Lb35;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    invoke-interface {v11, v10}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    check-cast v10, Ljava/util/List;

    .line 153
    .line 154
    invoke-static {v1, v3, v10}, Lft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    goto/16 :goto_3

    .line 159
    .line 160
    :pswitch_1
    iget-object v1, v0, Lft0;->s:Ljava/lang/String;

    .line 161
    .line 162
    iget-object v3, v0, Lft0;->t:Ljava/lang/String;

    .line 163
    .line 164
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    new-instance v11, Lc7;

    .line 169
    .line 170
    const/4 v12, 0x7

    .line 171
    invoke-direct {v11, v12}, Lc7;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    new-instance v11, Lm7;

    .line 179
    .line 180
    const/16 v12, 0x15

    .line 181
    .line 182
    invoke-direct {v11, v12}, Lm7;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-static {v11}, Lq05;->j(Ljava/util/function/Function;)Lb35;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    check-cast v10, Ljava/util/List;

    .line 202
    .line 203
    invoke-static {v1, v3, v10}, Lft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    goto/16 :goto_3

    .line 208
    .line 209
    :pswitch_2
    iget-object v1, v0, Lft0;->s:Ljava/lang/String;

    .line 210
    .line 211
    iget-object v3, v0, Lft0;->t:Ljava/lang/String;

    .line 212
    .line 213
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    new-instance v11, Lc7;

    .line 218
    .line 219
    invoke-direct {v11, v14}, Lc7;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    new-instance v11, Lm7;

    .line 227
    .line 228
    const/16 v12, 0x12

    .line 229
    .line 230
    invoke-direct {v11, v12}, Lm7;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-static {v11}, Lq05;->j(Ljava/util/function/Function;)Lb35;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    check-cast v10, Ljava/util/List;

    .line 250
    .line 251
    invoke-static {v1, v3, v10}, Lft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    goto/16 :goto_3

    .line 256
    .line 257
    :pswitch_3
    iget-object v1, v0, Lft0;->s:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v3, v0, Lft0;->t:Ljava/lang/String;

    .line 260
    .line 261
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    new-instance v11, Lc7;

    .line 266
    .line 267
    invoke-direct {v11, v15}, Lc7;-><init>(I)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    new-instance v11, Lm7;

    .line 275
    .line 276
    const/16 v12, 0x10

    .line 277
    .line 278
    invoke-direct {v11, v12}, Lm7;-><init>(I)V

    .line 279
    .line 280
    .line 281
    invoke-static {v11}, Lq05;->j(Ljava/util/function/Function;)Lb35;

    .line 282
    .line 283
    .line 284
    move-result-object v11

    .line 285
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 290
    .line 291
    .line 292
    move-result-object v11

    .line 293
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    check-cast v10, Ljava/util/List;

    .line 298
    .line 299
    invoke-static {v1, v3, v10}, Lft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    goto :goto_3

    .line 304
    :pswitch_4
    iget-object v1, v0, Lft0;->s:Ljava/lang/String;

    .line 305
    .line 306
    iget-object v3, v0, Lft0;->t:Ljava/lang/String;

    .line 307
    .line 308
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    new-instance v11, Lc7;

    .line 313
    .line 314
    const/16 v12, 0x8

    .line 315
    .line 316
    invoke-direct {v11, v12}, Lc7;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 320
    .line 321
    .line 322
    move-result-object v10

    .line 323
    new-instance v11, Lm7;

    .line 324
    .line 325
    const/16 v12, 0xf

    .line 326
    .line 327
    invoke-direct {v11, v12}, Lm7;-><init>(I)V

    .line 328
    .line 329
    .line 330
    invoke-static {v11}, Lq05;->j(Ljava/util/function/Function;)Lb35;

    .line 331
    .line 332
    .line 333
    move-result-object v11

    .line 334
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    check-cast v10, Ljava/util/List;

    .line 347
    .line 348
    invoke-static {v1, v3, v10}, Lft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    goto :goto_3

    .line 353
    :pswitch_5
    iget-object v1, v0, Lft0;->s:Ljava/lang/String;

    .line 354
    .line 355
    iget-object v3, v0, Lft0;->t:Ljava/lang/String;

    .line 356
    .line 357
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    new-instance v11, Lc7;

    .line 362
    .line 363
    const/4 v12, 0x6

    .line 364
    invoke-direct {v11, v12}, Lc7;-><init>(I)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    new-instance v11, Lm7;

    .line 372
    .line 373
    const/16 v12, 0x13

    .line 374
    .line 375
    invoke-direct {v11, v12}, Lm7;-><init>(I)V

    .line 376
    .line 377
    .line 378
    invoke-static {v11}, Lq05;->j(Ljava/util/function/Function;)Lb35;

    .line 379
    .line 380
    .line 381
    move-result-object v11

    .line 382
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 383
    .line 384
    .line 385
    move-result-object v10

    .line 386
    new-instance v11, Lm7;

    .line 387
    .line 388
    const/16 v12, 0x14

    .line 389
    .line 390
    invoke-direct {v11, v12}, Lm7;-><init>(I)V

    .line 391
    .line 392
    .line 393
    invoke-static {}, Ljava/util/Comparator;->naturalOrder()Ljava/util/Comparator;

    .line 394
    .line 395
    .line 396
    move-result-object v12

    .line 397
    invoke-static {v12}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 398
    .line 399
    .line 400
    move-result-object v12

    .line 401
    invoke-static {v11, v12}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 402
    .line 403
    .line 404
    move-result-object v11

    .line 405
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 410
    .line 411
    .line 412
    move-result-object v11

    .line 413
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    check-cast v10, Ljava/util/List;

    .line 418
    .line 419
    invoke-static {v1, v3, v10}, Lft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    :goto_3
    iput-object v1, v0, Lft0;->w:Ljava/util/List;

    .line 424
    .line 425
    new-instance v1, Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 428
    .line 429
    .line 430
    iget-object v2, v0, Lft0;->t:Ljava/lang/String;

    .line 431
    .line 432
    if-nez v2, :cond_7

    .line 433
    .line 434
    goto/16 :goto_6

    .line 435
    .line 436
    :cond_7
    iget-object v2, v0, Lft0;->s:Ljava/lang/String;

    .line 437
    .line 438
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    sparse-switch v3, :sswitch_data_1

    .line 446
    .line 447
    .line 448
    :goto_4
    const/4 v10, -0x1

    .line 449
    goto :goto_5

    .line 450
    :sswitch_6
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    if-nez v2, :cond_8

    .line 455
    .line 456
    goto :goto_4

    .line 457
    :cond_8
    move v10, v14

    .line 458
    goto :goto_5

    .line 459
    :sswitch_7
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    if-nez v2, :cond_9

    .line 464
    .line 465
    goto :goto_4

    .line 466
    :cond_9
    move v10, v15

    .line 467
    goto :goto_5

    .line 468
    :sswitch_8
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    if-nez v2, :cond_a

    .line 473
    .line 474
    goto :goto_4

    .line 475
    :cond_a
    const/4 v10, 0x3

    .line 476
    goto :goto_5

    .line 477
    :sswitch_9
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-nez v2, :cond_b

    .line 482
    .line 483
    goto :goto_4

    .line 484
    :cond_b
    const/4 v10, 0x2

    .line 485
    goto :goto_5

    .line 486
    :sswitch_a
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    if-nez v2, :cond_c

    .line 491
    .line 492
    goto :goto_4

    .line 493
    :cond_c
    const/4 v10, 0x1

    .line 494
    goto :goto_5

    .line 495
    :sswitch_b
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    if-nez v2, :cond_d

    .line 500
    .line 501
    goto :goto_4

    .line 502
    :cond_d
    move v10, v13

    .line 503
    :goto_5
    packed-switch v10, :pswitch_data_1

    .line 504
    .line 505
    .line 506
    goto/16 :goto_6

    .line 507
    .line 508
    :pswitch_6
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    new-instance v2, Lbt0;

    .line 513
    .line 514
    invoke-direct {v2, v0, v15}, Lbt0;-><init>(Lft0;I)V

    .line 515
    .line 516
    .line 517
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    check-cast v1, Ljava/util/List;

    .line 530
    .line 531
    goto/16 :goto_6

    .line 532
    .line 533
    :pswitch_7
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    new-instance v2, Lbt0;

    .line 538
    .line 539
    invoke-direct {v2, v0, v13}, Lbt0;-><init>(Lft0;I)V

    .line 540
    .line 541
    .line 542
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    check-cast v1, Ljava/util/List;

    .line 555
    .line 556
    goto :goto_6

    .line 557
    :pswitch_8
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    new-instance v2, Lbt0;

    .line 562
    .line 563
    invoke-direct {v2, v0, v14}, Lbt0;-><init>(Lft0;I)V

    .line 564
    .line 565
    .line 566
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    check-cast v1, Ljava/util/List;

    .line 579
    .line 580
    goto :goto_6

    .line 581
    :pswitch_9
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    new-instance v2, Lbt0;

    .line 586
    .line 587
    const/4 v3, 0x3

    .line 588
    invoke-direct {v2, v0, v3}, Lbt0;-><init>(Lft0;I)V

    .line 589
    .line 590
    .line 591
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    check-cast v1, Ljava/util/List;

    .line 604
    .line 605
    goto :goto_6

    .line 606
    :pswitch_a
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    new-instance v2, Lbt0;

    .line 611
    .line 612
    const/4 v3, 0x1

    .line 613
    invoke-direct {v2, v0, v3}, Lbt0;-><init>(Lft0;I)V

    .line 614
    .line 615
    .line 616
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    check-cast v1, Ljava/util/List;

    .line 629
    .line 630
    goto :goto_6

    .line 631
    :pswitch_b
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    new-instance v2, Lbt0;

    .line 636
    .line 637
    const/4 v3, 0x2

    .line 638
    invoke-direct {v2, v0, v3}, Lbt0;-><init>(Lft0;I)V

    .line 639
    .line 640
    .line 641
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    check-cast v1, Ljava/util/List;

    .line 654
    .line 655
    :goto_6
    iput-object v1, v0, Lft0;->v:Ljava/util/List;

    .line 656
    .line 657
    invoke-virtual {v0}, Ldw3;->d()V

    .line 658
    .line 659
    .line 660
    return-void

    .line 661
    :sswitch_data_0
    .sparse-switch
        -0x7eb7cd4b -> :sswitch_5
        -0x380820d5 -> :sswitch_4
        0x944b1c0 -> :sswitch_3
        0x35b50541 -> :sswitch_2
        0x36069055 -> :sswitch_1
        0x36c3781d -> :sswitch_0
    .end sparse-switch

    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    :sswitch_data_1
    .sparse-switch
        -0x7eb7cd4b -> :sswitch_b
        -0x380820d5 -> :sswitch_a
        0x944b1c0 -> :sswitch_9
        0x35b50541 -> :sswitch_8
        0x36069055 -> :sswitch_7
        0x36c3781d -> :sswitch_6
    .end sparse-switch

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
