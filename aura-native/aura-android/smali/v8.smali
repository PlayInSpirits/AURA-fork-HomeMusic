.class public final Lv8;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

.field public r:Lss0;

.field public s:Ljava/util/Map;

.field public final t:Ljava/util/Map;

.field public final u:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "album"

    .line 5
    .line 6
    const-string v1, "ep"

    .line 7
    .line 8
    const-string v2, "single"

    .line 9
    .line 10
    const-string v3, "compilation"

    .line 11
    .line 12
    const-string v4, "soundtrack"

    .line 13
    .line 14
    const-string v5, "live"

    .line 15
    .line 16
    const-string v6, "remix"

    .line 17
    .line 18
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    const/4 v2, 0x7

    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    move v4, v3

    .line 30
    :goto_0
    if-ge v4, v2, :cond_0

    .line 31
    .line 32
    aget-object v5, v0, v4

    .line 33
    .line 34
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lv8;->u:Ljava/util/List;

    .line 48
    .line 49
    iput-object p2, p0, Lv8;->q:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 50
    .line 51
    sget-object p2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 52
    .line 53
    iput-object p2, p0, Lv8;->s:Ljava/util/Map;

    .line 54
    .line 55
    const p2, 0x7f13006b

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    const v0, 0x7f130070

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const v1, 0x7f130076

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const v4, 0x7f13006f

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const v5, 0x7f130077

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    const v6, 0x7f130071

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    const v7, 0x7f130075

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance v7, Ljava/util/AbstractMap$SimpleEntry;

    .line 105
    .line 106
    const-string v8, "album"

    .line 107
    .line 108
    invoke-direct {v7, v8, p2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    new-instance p2, Ljava/util/AbstractMap$SimpleEntry;

    .line 112
    .line 113
    const-string v8, "ep"

    .line 114
    .line 115
    invoke-direct {p2, v8, v0}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Ljava/util/AbstractMap$SimpleEntry;

    .line 119
    .line 120
    const-string v8, "single"

    .line 121
    .line 122
    invoke-direct {v0, v8, v1}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    .line 126
    .line 127
    const-string v8, "compilation"

    .line 128
    .line 129
    invoke-direct {v1, v8, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    new-instance v4, Ljava/util/AbstractMap$SimpleEntry;

    .line 133
    .line 134
    const-string v8, "soundtrack"

    .line 135
    .line 136
    invoke-direct {v4, v8, v5}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    new-instance v5, Ljava/util/AbstractMap$SimpleEntry;

    .line 140
    .line 141
    const-string v8, "live"

    .line 142
    .line 143
    invoke-direct {v5, v8, v6}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    new-instance v6, Ljava/util/AbstractMap$SimpleEntry;

    .line 147
    .line 148
    const-string v8, "remix"

    .line 149
    .line 150
    invoke-direct {v6, v8, p1}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    new-array p1, v2, [Ljava/util/Map$Entry;

    .line 154
    .line 155
    aput-object v7, p1, v3

    .line 156
    .line 157
    const/4 v7, 0x1

    .line 158
    aput-object p2, p1, v7

    .line 159
    .line 160
    const/4 p2, 0x2

    .line 161
    aput-object v0, p1, p2

    .line 162
    .line 163
    const/4 p2, 0x3

    .line 164
    aput-object v1, p1, p2

    .line 165
    .line 166
    const/4 p2, 0x4

    .line 167
    aput-object v4, p1, p2

    .line 168
    .line 169
    const/4 p2, 0x5

    .line 170
    aput-object v5, p1, p2

    .line 171
    .line 172
    const/4 p2, 0x6

    .line 173
    aput-object v6, p1, p2

    .line 174
    .line 175
    new-instance p2, Ljava/util/HashMap;

    .line 176
    .line 177
    invoke-direct {p2, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 178
    .line 179
    .line 180
    :goto_1
    const/4 v0, 0x0

    .line 181
    if-ge v3, v2, :cond_2

    .line 182
    .line 183
    aget-object v1, p1, v3

    .line 184
    .line 185
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-nez v1, :cond_1

    .line 204
    .line 205
    add-int/lit8 v3, v3, 0x1

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_1
    const-string p0, "duplicate key: "

    .line 209
    .line 210
    invoke-static {v4, p0}, Lmj0;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v0

    .line 214
    :cond_2
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iput-object p1, p0, Lv8;->t:Ljava/util/Map;

    .line 219
    .line 220
    iput-object v0, p0, Lv8;->r:Lss0;

    .line 221
    .line 222
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lv8;->s:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final g(Lcx3;I)V
    .locals 5

    .line 1
    check-cast p1, Lu8;

    .line 2
    .line 3
    iget-object v0, p0, Lv8;->s:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/stream/Stream;->sorted()Ljava/util/stream/Stream;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lv8;->u:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    new-instance v2, Ls8;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Ls8;-><init>(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Ljava/util/Comparator;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Lt8;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v1, v2, p0}, Lt8;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0}, Ljava/util/stream/Stream;->toArray()[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    aget-object p2, v0, p2

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget-object v0, p0, Lv8;->t:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v3, 0x1

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/lang/String;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :goto_0
    iget-object p1, p1, Lu8;->u:Lss0;

    .line 103
    .line 104
    iget-object v1, p1, Lss0;->q:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Landroid/widget/TextView;

    .line 107
    .line 108
    iget-object v4, p1, Lss0;->p:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v4, Landroid/widget/TextView;

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p1, Lss0;->o:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 118
    .line 119
    invoke-virtual {v4, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lv8;->s:Ljava/util/Map;

    .line 123
    .line 124
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    check-cast p2, Ljava/util/List;

    .line 129
    .line 130
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 131
    .line 132
    invoke-direct {v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 142
    .line 143
    .line 144
    new-instance v0, Ll7;

    .line 145
    .line 146
    iget-object p0, p0, Lv8;->q:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 147
    .line 148
    invoke-direct {v0, p0, v2}, Ll7;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 152
    .line 153
    .line 154
    if-eqz p2, :cond_2

    .line 155
    .line 156
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    const/4 p1, 0x5

    .line 161
    if-le p0, p1, :cond_1

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_1
    const/16 v2, 0x8

    .line 165
    .line 166
    :goto_1
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    iput-object p2, v0, Ll7;->r:Ljava/util/List;

    .line 170
    .line 171
    invoke-virtual {v0}, Ldw3;->d()V

    .line 172
    .line 173
    .line 174
    :cond_2
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 3

    .line 1
    const p2, 0x7f0d0094

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
    const p2, 0x7f0a00bd

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/widget/LinearLayout;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const p2, 0x7f0a0350

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const p2, 0x7f0a0351

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    const p2, 0x7f0a0644

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Landroid/widget/TextView;

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    new-instance p2, Lss0;

    .line 54
    .line 55
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 56
    .line 57
    invoke-direct {p2, p1, v0, v1, v2}, Lss0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lv8;->r:Lss0;

    .line 61
    .line 62
    new-instance p1, Lu8;

    .line 63
    .line 64
    iget-object p2, p0, Lv8;->r:Lss0;

    .line 65
    .line 66
    invoke-direct {p1, p0, p2}, Lu8;-><init>(Lv8;Lss0;)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string p1, "Missing required view with ID: "

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0
.end method
