.class public final synthetic Ldefpackage/yj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Ldefpackage/k03;

.field public final synthetic e:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic f:Ldefpackage/dk;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ldefpackage/k03;Ljava/util/concurrent/atomic/AtomicInteger;Ldefpackage/dk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/yj;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/yj;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/yj;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/yj;->d:Ldefpackage/k03;

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/yj;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iput-object p6, p0, Ldefpackage/yj;->f:Ldefpackage/dk;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Got "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v1

    .line 19
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, " songs from album"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, "ArtistSync"

    .line 32
    .line 33
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Ldefpackage/yj;->c:Ljava/util/ArrayList;

    .line 37
    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_4

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 60
    .line 61
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    iget-object v5, p0, Ldefpackage/yj;->a:Ljava/lang/String;

    .line 68
    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    move v5, v1

    .line 81
    :goto_2
    if-nez v5, :cond_3

    .line 82
    .line 83
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    if-eqz v6, :cond_3

    .line 88
    .line 89
    iget-object v6, p0, Ldefpackage/yj;->b:Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v6, :cond_3

    .line 92
    .line 93
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    :cond_3
    if-eqz v5, :cond_1

    .line 102
    .line 103
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 108
    .line 109
    .line 110
    :cond_5
    const-string p1, "removeObservers"

    .line 111
    .line 112
    invoke-static {p1}, Ldefpackage/ad2;->a(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Ldefpackage/yj;->d:Ldefpackage/k03;

    .line 116
    .line 117
    iget-object v1, p1, Ldefpackage/ad2;->b:Ldefpackage/i44;

    .line 118
    .line 119
    invoke-virtual {v1}, Ldefpackage/i44;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    :cond_6
    :goto_3
    move-object v3, v1

    .line 124
    check-cast v3, Ldefpackage/e44;

    .line 125
    .line 126
    invoke-virtual {v3}, Ldefpackage/e44;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_7

    .line 131
    .line 132
    invoke-virtual {v3}, Ldefpackage/e44;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, Ljava/util/Map$Entry;

    .line 137
    .line 138
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    check-cast v4, Ldefpackage/zc2;

    .line 143
    .line 144
    const/4 v5, 0x0

    .line 145
    invoke-virtual {v4, v5}, Ldefpackage/zc2;->d(Ldefpackage/ba2;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_6

    .line 150
    .line 151
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, Ldefpackage/a83;

    .line 156
    .line 157
    invoke-virtual {p1, v3}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    iget-object p1, p0, Ldefpackage/yj;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    new-instance v1, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string v3, "Remaining albums: "

    .line 170
    .line 171
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-static {v2, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    if-nez p1, :cond_8

    .line 185
    .line 186
    new-instance p1, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    const-string v1, "All albums processed. Total songs: "

    .line 189
    .line 190
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {v2, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    iget-object p0, p0, Ldefpackage/yj;->f:Ldefpackage/dk;

    .line 208
    .line 209
    invoke-interface {p0, v0}, Ldefpackage/dk;->e(Ljava/util/ArrayList;)V

    .line 210
    .line 211
    .line 212
    :cond_8
    return-void
.end method
