.class public abstract Lkb4;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lca1;

.field public static final b:Lsp1;

.field public static final c:Lp61;

.field public static final d:[Lp61;

.field public static e:Ljava/lang/Boolean;

.field public static f:Ljava/lang/Boolean;

.field public static g:Ljava/lang/Boolean;

.field public static h:Ljava/lang/Boolean;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lca1;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkb4;->a:Lca1;

    .line 9
    .line 10
    new-instance v0, Lsp1;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, Lsp1;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lkb4;->b:Lsp1;

    .line 17
    .line 18
    new-instance v0, Lp61;

    .line 19
    .line 20
    const-string v1, "GET_CREDENTIAL"

    .line 21
    .line 22
    const-wide/16 v2, 0x1

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3}, Lp61;-><init>(Ljava/lang/String;J)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lkb4;->c:Lp61;

    .line 28
    .line 29
    new-instance v1, Lp61;

    .line 30
    .line 31
    const-string v4, "CREDENTIAL_REGISTRY"

    .line 32
    .line 33
    invoke-direct {v1, v4, v2, v3}, Lp61;-><init>(Ljava/lang/String;J)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Lp61;

    .line 37
    .line 38
    const-string v5, "CLEAR_REGISTRY"

    .line 39
    .line 40
    invoke-direct {v4, v5, v2, v3}, Lp61;-><init>(Ljava/lang/String;J)V

    .line 41
    .line 42
    .line 43
    filled-new-array {v0, v1, v4}, [Lp61;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lkb4;->d:[Lp61;

    .line 48
    .line 49
    return-void
.end method

.method public static A(Ljava/util/List;Ljava/io/InputStream;Lqj0;)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    new-instance v1, Law3;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, Law3;-><init>(Ljava/io/InputStream;Lqj0;)V

    .line 14
    .line 15
    .line 16
    move-object p1, v1

    .line 17
    :cond_1
    const/high16 v1, 0x500000

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->mark(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    :goto_0
    if-ge v2, v1, :cond_3

    .line 28
    .line 29
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lwv1;

    .line 34
    .line 35
    :try_start_0
    invoke-interface {v3, p1, p2}, Lwv1;->b(Ljava/io/InputStream;Lqj0;)I

    .line 36
    .line 37
    .line 38
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 40
    .line 41
    .line 42
    if-eq v3, v0, :cond_2

    .line 43
    .line 44
    move v0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_3
    :goto_1
    return v0
.end method

.method public static B(Ljava/util/List;Ljava/io/InputStream;Lqj0;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Law3;

    .line 13
    .line 14
    invoke-direct {v0, p1, p2}, Law3;-><init>(Ljava/io/InputStream;Lqj0;)V

    .line 15
    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :cond_1
    const/high16 p2, 0x500000

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->mark(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-ge v0, p2, :cond_3

    .line 29
    .line 30
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lwv1;

    .line 35
    .line 36
    :try_start_0
    invoke-interface {v1, p1}, Lwv1;->d(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 37
    .line 38
    .line 39
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 44
    .line 45
    if-eq v1, v2, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_3
    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 57
    .line 58
    :goto_1
    return-object v1
.end method

.method public static C(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lwv1;

    .line 19
    .line 20
    :try_start_0
    invoke-interface {v3, p1}, Lwv1;->a(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 21
    .line 22
    .line 23
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    sget-object v4, Lvw;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    sget-object v4, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 33
    .line 34
    if-eq v3, v4, :cond_1

    .line 35
    .line 36
    return-object v3

    .line 37
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    sget-object v0, Lvw;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 51
    .line 52
    return-object p0
.end method

.method public static D(Ljava/util/List;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 21
    .line 22
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v3, v1

    .line 50
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    .line 67
    .line 68
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v0, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    :cond_3
    :goto_2
    if-ge v2, v1, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    move-object v4, v3

    .line 89
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 90
    .line 91
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {p0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_3

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    return-object v0
.end method

.method public static final E(Lcom/eddyizm/tempus/subsonic/models/Indexes;)Lcom/eddyizm/tempus/subsonic/models/Indexes;
    .locals 13

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lkb4;->O()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {}, Lkb4;->t()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lkb4;->e(Ljava/util/List;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    move v3, v2

    .line 29
    :cond_1
    :goto_0
    if-ge v3, v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    move-object v5, v4

    .line 38
    check-cast v5, Ljo1;

    .line 39
    .line 40
    iget-object v5, v5, Ljo1;->d:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    move v4, v2

    .line 63
    :cond_3
    :goto_1
    if-ge v4, v3, :cond_4

    .line 64
    .line 65
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    move-object v6, v5

    .line 72
    check-cast v6, Ljo1;

    .line 73
    .line 74
    iget-object v6, v6, Ljo1;->d:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_3

    .line 81
    .line 82
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 87
    .line 88
    const/16 v0, 0xa

    .line 89
    .line 90
    invoke-static {v1, v0}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    move v3, v2

    .line 102
    :goto_2
    if-ge v3, v0, :cond_5

    .line 103
    .line 104
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    add-int/lit8 v3, v3, 0x1

    .line 109
    .line 110
    check-cast v4, Ljo1;

    .line 111
    .line 112
    new-instance v5, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 113
    .line 114
    iget-object v6, v4, Ljo1;->d:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v7, v4, Ljo1;->e:Ljava/lang/String;

    .line 117
    .line 118
    const/16 v11, 0x1c

    .line 119
    .line 120
    const/4 v12, 0x0

    .line 121
    const/4 v8, 0x0

    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v10, 0x0

    .line 124
    invoke-direct/range {v5 .. v12}, Lcom/eddyizm/tempus/subsonic/models/Artist;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Double;ILxj0;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    new-instance v0, Lca1;

    .line 132
    .line 133
    const/16 v1, 0x19

    .line 134
    .line 135
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-static {p0, v0}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/Indexes;

    .line 143
    .line 144
    invoke-direct {v0}, Lcom/eddyizm/tempus/subsonic/models/Indexes;-><init>()V

    .line 145
    .line 146
    .line 147
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 148
    .line 149
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_b

    .line 161
    .line 162
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    move-object v4, v3

    .line 167
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 168
    .line 169
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Artist;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    if-eqz v4, :cond_8

    .line 174
    .line 175
    invoke-static {v4}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    if-eqz v4, :cond_8

    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    const/4 v6, 0x0

    .line 190
    if-nez v5, :cond_6

    .line 191
    .line 192
    move-object v4, v6

    .line 193
    goto :goto_4

    .line 194
    :cond_6
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    :goto_4
    if-eqz v4, :cond_8

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/Character;->charValue()C

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-static {v4}, Ljava/lang/Character;->isLetter(C)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_7

    .line 221
    .line 222
    move-object v6, v5

    .line 223
    :cond_7
    if-eqz v6, :cond_8

    .line 224
    .line 225
    invoke-virtual {v6}, Ljava/lang/Character;->charValue()C

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    if-nez v4, :cond_9

    .line 234
    .line 235
    :cond_8
    const-string v4, "#"

    .line 236
    .line 237
    :cond_9
    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    if-nez v5, :cond_a

    .line 242
    .line 243
    new-instance v5, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    :cond_a
    check-cast v5, Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_b
    new-instance p0, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-eqz v2, :cond_c

    .line 279
    .line 280
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    check-cast v2, Ljava/util/Map$Entry;

    .line 285
    .line 286
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    check-cast v3, Ljava/lang/String;

    .line 291
    .line 292
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    check-cast v2, Ljava/util/List;

    .line 297
    .line 298
    new-instance v4, Lcom/eddyizm/tempus/subsonic/models/Index;

    .line 299
    .line 300
    invoke-direct {v4}, Lcom/eddyizm/tempus/subsonic/models/Index;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4, v3}, Lcom/eddyizm/tempus/subsonic/models/Index;->setName(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4, v2}, Lcom/eddyizm/tempus/subsonic/models/Index;->setArtists(Ljava/util/List;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_c
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/subsonic/models/Indexes;->setIndices(Ljava/util/List;)V

    .line 314
    .line 315
    .line 316
    return-object v0
.end method

.method public static final F(Lwv3;Lwv3;Lwv3;I)Z
    .locals 2

    .line 1
    invoke-static {p3, p0, p2}, Lkb4;->G(ILwv3;Lwv3;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p3, p1, p2}, Lkb4;->G(ILwv3;Lwv3;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-static {p2, p0, p1, p3}, Lkb4;->j(Lwv3;Lwv3;Lwv3;I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-static {p2, p1, p0, p3}, Lkb4;->j(Lwv3;Lwv3;Lwv3;I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    invoke-static {p3, p2, p0}, Lkb4;->H(ILwv3;Lwv3;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {p3, p2, p1}, Lkb4;->H(ILwv3;Lwv3;)J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    cmp-long p0, v0, p0

    .line 38
    .line 39
    if-gez p0, :cond_4

    .line 40
    .line 41
    :goto_0
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public static final G(ILwv3;Lwv3;)Z
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne p0, v0, :cond_2

    .line 5
    .line 6
    iget p0, p2, Lwv3;->c:F

    .line 7
    .line 8
    iget p2, p2, Lwv3;->a:F

    .line 9
    .line 10
    iget v0, p1, Lwv3;->c:F

    .line 11
    .line 12
    cmpl-float p0, p0, v0

    .line 13
    .line 14
    if-gtz p0, :cond_0

    .line 15
    .line 16
    cmpl-float p0, p2, v0

    .line 17
    .line 18
    if-ltz p0, :cond_1

    .line 19
    .line 20
    :cond_0
    iget p0, p1, Lwv3;->a:F

    .line 21
    .line 22
    cmpl-float p0, p2, p0

    .line 23
    .line 24
    if-lez p0, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    const/4 v0, 0x4

    .line 29
    if-ne p0, v0, :cond_5

    .line 30
    .line 31
    iget p0, p2, Lwv3;->a:F

    .line 32
    .line 33
    iget p2, p2, Lwv3;->c:F

    .line 34
    .line 35
    iget v0, p1, Lwv3;->a:F

    .line 36
    .line 37
    cmpg-float p0, p0, v0

    .line 38
    .line 39
    if-ltz p0, :cond_3

    .line 40
    .line 41
    cmpg-float p0, p2, v0

    .line 42
    .line 43
    if-gtz p0, :cond_4

    .line 44
    .line 45
    :cond_3
    iget p0, p1, Lwv3;->c:F

    .line 46
    .line 47
    cmpg-float p0, p2, p0

    .line 48
    .line 49
    if-gez p0, :cond_4

    .line 50
    .line 51
    return v2

    .line 52
    :cond_4
    return v1

    .line 53
    :cond_5
    const/4 v0, 0x5

    .line 54
    if-ne p0, v0, :cond_8

    .line 55
    .line 56
    iget p0, p2, Lwv3;->d:F

    .line 57
    .line 58
    iget p2, p2, Lwv3;->b:F

    .line 59
    .line 60
    iget v0, p1, Lwv3;->d:F

    .line 61
    .line 62
    cmpl-float p0, p0, v0

    .line 63
    .line 64
    if-gtz p0, :cond_6

    .line 65
    .line 66
    cmpl-float p0, p2, v0

    .line 67
    .line 68
    if-ltz p0, :cond_7

    .line 69
    .line 70
    :cond_6
    iget p0, p1, Lwv3;->b:F

    .line 71
    .line 72
    cmpl-float p0, p2, p0

    .line 73
    .line 74
    if-lez p0, :cond_7

    .line 75
    .line 76
    return v2

    .line 77
    :cond_7
    return v1

    .line 78
    :cond_8
    const/4 v0, 0x6

    .line 79
    if-ne p0, v0, :cond_b

    .line 80
    .line 81
    iget p0, p2, Lwv3;->b:F

    .line 82
    .line 83
    iget p2, p2, Lwv3;->d:F

    .line 84
    .line 85
    iget v0, p1, Lwv3;->b:F

    .line 86
    .line 87
    cmpg-float p0, p0, v0

    .line 88
    .line 89
    if-ltz p0, :cond_9

    .line 90
    .line 91
    cmpg-float p0, p2, v0

    .line 92
    .line 93
    if-gtz p0, :cond_a

    .line 94
    .line 95
    :cond_9
    iget p0, p1, Lwv3;->d:F

    .line 96
    .line 97
    cmpg-float p0, p2, p0

    .line 98
    .line 99
    if-gez p0, :cond_a

    .line 100
    .line 101
    return v2

    .line 102
    :cond_a
    return v1

    .line 103
    :cond_b
    const-string p0, "This function should only be used for 2-D focus search"

    .line 104
    .line 105
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return v1
.end method

.method public static final H(ILwv3;Lwv3;)J
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const-string v2, "This function should only be used for 2-D focus search"

    .line 4
    .line 5
    const/4 v3, 0x6

    .line 6
    const/4 v4, 0x5

    .line 7
    const/4 v5, 0x4

    .line 8
    const/4 v6, 0x3

    .line 9
    if-ne p0, v6, :cond_0

    .line 10
    .line 11
    iget v7, p1, Lwv3;->a:F

    .line 12
    .line 13
    iget v8, p2, Lwv3;->c:F

    .line 14
    .line 15
    :goto_0
    sub-float/2addr v7, v8

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    if-ne p0, v5, :cond_1

    .line 18
    .line 19
    iget v7, p2, Lwv3;->a:F

    .line 20
    .line 21
    iget v8, p1, Lwv3;->c:F

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    if-ne p0, v4, :cond_2

    .line 25
    .line 26
    iget v7, p1, Lwv3;->b:F

    .line 27
    .line 28
    iget v8, p2, Lwv3;->d:F

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    if-ne p0, v3, :cond_8

    .line 32
    .line 33
    iget v7, p2, Lwv3;->b:F

    .line 34
    .line 35
    iget v8, p1, Lwv3;->d:F

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    const/4 v8, 0x0

    .line 39
    cmpg-float v9, v7, v8

    .line 40
    .line 41
    if-gez v9, :cond_3

    .line 42
    .line 43
    move v7, v8

    .line 44
    :cond_3
    float-to-long v7, v7

    .line 45
    const/high16 v9, 0x40000000    # 2.0f

    .line 46
    .line 47
    if-ne p0, v6, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    if-ne p0, v5, :cond_5

    .line 51
    .line 52
    :goto_2
    iget p0, p1, Lwv3;->b:F

    .line 53
    .line 54
    iget p1, p1, Lwv3;->d:F

    .line 55
    .line 56
    sub-float/2addr p1, p0

    .line 57
    div-float/2addr p1, v9

    .line 58
    add-float/2addr p1, p0

    .line 59
    iget p0, p2, Lwv3;->b:F

    .line 60
    .line 61
    iget p2, p2, Lwv3;->d:F

    .line 62
    .line 63
    :goto_3
    sub-float/2addr p2, p0

    .line 64
    div-float/2addr p2, v9

    .line 65
    add-float/2addr p2, p0

    .line 66
    sub-float/2addr p1, p2

    .line 67
    goto :goto_5

    .line 68
    :cond_5
    if-ne p0, v4, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    if-ne p0, v3, :cond_7

    .line 72
    .line 73
    :goto_4
    iget p0, p1, Lwv3;->a:F

    .line 74
    .line 75
    iget p1, p1, Lwv3;->c:F

    .line 76
    .line 77
    sub-float/2addr p1, p0

    .line 78
    div-float/2addr p1, v9

    .line 79
    add-float/2addr p1, p0

    .line 80
    iget p0, p2, Lwv3;->a:F

    .line 81
    .line 82
    iget p2, p2, Lwv3;->c:F

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :goto_5
    float-to-long p0, p1

    .line 86
    const-wide/16 v0, 0xd

    .line 87
    .line 88
    mul-long/2addr v0, v7

    .line 89
    mul-long/2addr v0, v7

    .line 90
    mul-long/2addr p0, p0

    .line 91
    add-long/2addr p0, v0

    .line 92
    return-wide p0

    .line 93
    :cond_7
    invoke-static {v2}, Lkf2;->o(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-wide v0

    .line 97
    :cond_8
    invoke-static {v2}, Lkf2;->o(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-wide v0
.end method

.method public static I(Lk14;Loz3;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lk14;->q:I

    .line 5
    .line 6
    const/16 v1, 0xc8

    .line 7
    .line 8
    if-eq v0, v1, :cond_2

    .line 9
    .line 10
    const/16 v1, 0x19a

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/16 v1, 0x19e

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/16 v1, 0x1f5

    .line 19
    .line 20
    if-eq v0, v1, :cond_2

    .line 21
    .line 22
    const/16 v1, 0xcb

    .line 23
    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    const/16 v1, 0xcc

    .line 27
    .line 28
    if-eq v0, v1, :cond_2

    .line 29
    .line 30
    const/16 v1, 0x133

    .line 31
    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    const/16 v1, 0x134

    .line 35
    .line 36
    if-eq v0, v1, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x194

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    const/16 v1, 0x195

    .line 43
    .line 44
    if-eq v0, v1, :cond_2

    .line 45
    .line 46
    packed-switch v0, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    :pswitch_0
    iget-object v0, p0, Lk14;->s:Ltl1;

    .line 51
    .line 52
    const-string v1, "Expires"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    :cond_1
    if-nez v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Lk14;->b()Lix;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget v0, v0, Lix;->c:I

    .line 68
    .line 69
    const/4 v1, -0x1

    .line 70
    if-ne v0, v1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Lk14;->b()Lix;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-boolean v0, v0, Lix;->f:Z

    .line 77
    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0}, Lk14;->b()Lix;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-boolean v0, v0, Lix;->e:Z

    .line 85
    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    :pswitch_1
    invoke-virtual {p0}, Lk14;->b()Lix;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    iget-boolean p0, p0, Lix;->b:Z

    .line 94
    .line 95
    if-nez p0, :cond_4

    .line 96
    .line 97
    iget-object p0, p1, Loz3;->f:Lix;

    .line 98
    .line 99
    if-nez p0, :cond_3

    .line 100
    .line 101
    sget p0, Lix;->n:I

    .line 102
    .line 103
    iget-object p0, p1, Loz3;->c:Ltl1;

    .line 104
    .line 105
    invoke-static {p0}, Lau0;->O(Ltl1;)Lix;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    iput-object p0, p1, Loz3;->f:Lix;

    .line 110
    .line 111
    :cond_3
    iget-boolean p0, p0, Lix;->b:Z

    .line 112
    .line 113
    if-nez p0, :cond_4

    .line 114
    .line 115
    const/4 p0, 0x1

    .line 116
    return p0

    .line 117
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 118
    return p0

    .line 119
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static J(Landroid/content/Context;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lkb4;->e:Ljava/lang/Boolean;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v1, "android.hardware.type.watch"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lkb4;->e:Ljava/lang/Boolean;

    .line 20
    .line 21
    :cond_0
    sget-object v0, Lkb4;->e:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    sget-object v0, Lkb4;->f:Ljava/lang/Boolean;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "cn.google"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sput-object p0, Lkb4;->f:Ljava/lang/Boolean;

    .line 45
    .line 46
    :cond_1
    sget-object p0, Lkb4;->f:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 55
    .line 56
    const/16 v0, 0x1a

    .line 57
    .line 58
    if-lt p0, v0, :cond_2

    .line 59
    .line 60
    const/16 v0, 0x1e

    .line 61
    .line 62
    if-lt p0, v0, :cond_3

    .line 63
    .line 64
    :cond_2
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_3
    const/4 p0, 0x0

    .line 67
    return p0
.end method

.method public static K(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Llg2;->W(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    check-cast p0, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v1, 0x0

    .line 24
    move v2, v1

    .line 25
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const/4 v4, 0x1

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    invoke-static {v3, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    move v2, v4

    .line 45
    move v4, v1

    .line 46
    :cond_1
    if-eqz v4, :cond_0

    .line 47
    .line 48
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return-object v0
.end method

.method public static final L(Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "homemusic_offline"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "music_folders"

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v2, Lrr1;->a:Lrr1;

    .line 21
    .line 22
    sget-object v2, Lrr1;->c:Lnk1;

    .line 23
    .line 24
    invoke-virtual {v2, p0}, Lnk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    :try_start_0
    sget-object v1, Lrr1;->a:Lrr1;

    .line 45
    .line 46
    sget-object v1, Lrr1;->c:Lnk1;

    .line 47
    .line 48
    new-instance v2, Lcom/eddyizm/tempus/homemusic/HomeOffline$musicFolders$1$1;

    .line 49
    .line 50
    invoke-direct {v2}, Lcom/eddyizm/tempus/homemusic/HomeOffline$musicFolders$1$1;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v1, v0, v2}, Lnk1;->f(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    new-instance v1, Ls14;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    move-object v0, v1

    .line 71
    :goto_0
    nop

    .line 72
    instance-of v1, v0, Ls14;

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move-object p0, v0

    .line 78
    :goto_1
    check-cast p0, Ljava/util/List;

    .line 79
    .line 80
    return-object p0
.end method

.method public static M(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "lan-playback"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "name"

    .line 12
    .line 13
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/16 v0, 0x28

    .line 23
    .line 24
    invoke-static {v0, p0}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static final N(Lba2;Ljava/lang/Runnable;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfx3;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, v0, Lfx3;->n:Z

    .line 11
    .line 12
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Lss0;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, v2, Lss0;->n:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Ls24;

    .line 23
    .line 24
    invoke-virtual {v3}, Ls24;->i()Ls12;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "download"

    .line 29
    .line 30
    filled-new-array {v4}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    new-instance v5, Los0;

    .line 35
    .line 36
    invoke-direct {v5, v2, v1}, Los0;-><init>(Lss0;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v4, v5}, Ls12;->a([Ljava/lang/String;Lif1;)Lt24;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v2, Lo;

    .line 44
    .line 45
    const/16 v3, 0xb

    .line 46
    .line 47
    invoke-direct {v2, v3, v0, p1}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Lwd1;

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    invoke-direct {p1, v2, v0}, Lwd1;-><init>(Lif1;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p0, p1}, Lad2;->e(Lba2;La83;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public static O()Z
    .locals 1

    .line 1
    invoke-static {}, Lcx;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    return v0
.end method

.method public static P(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    move-object v2, v1

    .line 55
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    return-object p1
.end method

.method public static Q(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    invoke-static {v1}, Llg2;->W(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 17
    .line 18
    .line 19
    check-cast p0, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static final R(ILdd0;Lba1;Lwv3;)Z
    .locals 10

    .line 1
    new-instance v0, Lf13;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v2, v1, [Lba1;

    .line 6
    .line 7
    invoke-direct {v0, v2}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p2, Lcx2;->n:Lcx2;

    .line 11
    .line 12
    iget-boolean v2, v2, Lcx2;->A:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-string v2, "visitChildren called on an unattached node"

    .line 17
    .line 18
    invoke-static {v2}, Lcz1;->b(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    new-instance v2, Lf13;

    .line 22
    .line 23
    new-array v3, v1, [Lcx2;

    .line 24
    .line 25
    invoke-direct {v2, v3}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p2, Lcx2;->n:Lcx2;

    .line 29
    .line 30
    iget-object v3, p2, Lcx2;->s:Lcx2;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-static {v2, p2}, Lj51;->b(Lf13;Lcx2;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v2, v3}, Lf13;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    iget p2, v2, Lf13;->p:I

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    const/4 v4, 0x0

    .line 45
    if-eqz p2, :cond_c

    .line 46
    .line 47
    add-int/lit8 p2, p2, -0x1

    .line 48
    .line 49
    invoke-virtual {v2, p2}, Lf13;->k(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Lcx2;

    .line 54
    .line 55
    iget v5, p2, Lcx2;->q:I

    .line 56
    .line 57
    and-int/lit16 v5, v5, 0x400

    .line 58
    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    invoke-static {v2, p2}, Lj51;->b(Lf13;Lcx2;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    :goto_1
    if-eqz p2, :cond_2

    .line 66
    .line 67
    iget v5, p2, Lcx2;->p:I

    .line 68
    .line 69
    and-int/lit16 v5, v5, 0x400

    .line 70
    .line 71
    if-eqz v5, :cond_b

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    move-object v6, v5

    .line 75
    :goto_2
    if-eqz p2, :cond_2

    .line 76
    .line 77
    instance-of v7, p2, Lba1;

    .line 78
    .line 79
    if-eqz v7, :cond_4

    .line 80
    .line 81
    check-cast p2, Lba1;

    .line 82
    .line 83
    iget-boolean v7, p2, Lcx2;->A:Z

    .line 84
    .line 85
    if-eqz v7, :cond_a

    .line 86
    .line 87
    invoke-virtual {v0, p2}, Lf13;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_4
    iget v7, p2, Lcx2;->p:I

    .line 92
    .line 93
    and-int/lit16 v7, v7, 0x400

    .line 94
    .line 95
    if-eqz v7, :cond_a

    .line 96
    .line 97
    instance-of v7, p2, Lfo0;

    .line 98
    .line 99
    if-eqz v7, :cond_a

    .line 100
    .line 101
    move-object v7, p2

    .line 102
    check-cast v7, Lfo0;

    .line 103
    .line 104
    iget-object v7, v7, Lfo0;->C:Lcx2;

    .line 105
    .line 106
    move v8, v4

    .line 107
    :goto_3
    if-eqz v7, :cond_9

    .line 108
    .line 109
    iget v9, v7, Lcx2;->p:I

    .line 110
    .line 111
    and-int/lit16 v9, v9, 0x400

    .line 112
    .line 113
    if-eqz v9, :cond_8

    .line 114
    .line 115
    add-int/lit8 v8, v8, 0x1

    .line 116
    .line 117
    if-ne v8, v3, :cond_5

    .line 118
    .line 119
    move-object p2, v7

    .line 120
    goto :goto_4

    .line 121
    :cond_5
    if-nez v6, :cond_6

    .line 122
    .line 123
    new-instance v6, Lf13;

    .line 124
    .line 125
    new-array v9, v1, [Lcx2;

    .line 126
    .line 127
    invoke-direct {v6, v9}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    if-eqz p2, :cond_7

    .line 131
    .line 132
    invoke-virtual {v6, p2}, Lf13;->b(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-object p2, v5

    .line 136
    :cond_7
    invoke-virtual {v6, v7}, Lf13;->b(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    :goto_4
    iget-object v7, v7, Lcx2;->s:Lcx2;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_9
    if-ne v8, v3, :cond_a

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_a
    :goto_5
    invoke-static {v6}, Lj51;->c(Lf13;)Lcx2;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    goto :goto_2

    .line 150
    :cond_b
    iget-object p2, p2, Lcx2;->s:Lcx2;

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_c
    :goto_6
    iget p2, v0, Lf13;->p:I

    .line 154
    .line 155
    if-eqz p2, :cond_10

    .line 156
    .line 157
    invoke-static {v0, p3, p0}, Lkb4;->u(Lf13;Lwv3;I)Lba1;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-nez p2, :cond_d

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_d
    invoke-virtual {p2}, Lba1;->s0()Lx91;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-boolean v1, v1, Lx91;->a:Z

    .line 169
    .line 170
    if-eqz v1, :cond_e

    .line 171
    .line 172
    invoke-virtual {p1, p2}, Ldd0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    check-cast p0, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    return p0

    .line 183
    :cond_e
    invoke-static {p0, p1, p2, p3}, Lkb4;->x(ILdd0;Lba1;Lwv3;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_f

    .line 188
    .line 189
    return v3

    .line 190
    :cond_f
    invoke-virtual {v0, p2}, Lf13;->j(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_10
    :goto_7
    return v4
.end method

.method public static S(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public static final T(Ldf;)V
    .locals 10

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lom0;

    .line 10
    .line 11
    const/16 v1, 0x12

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lom0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-lt v0, v2, :cond_1

    .line 18
    .line 19
    new-instance v0, Lom0;

    .line 20
    .line 21
    const/16 v1, 0x11

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lom0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance v0, Lom0;

    .line 28
    .line 29
    const/16 v1, 0x10

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lom0;-><init>(I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const v3, 0x1020002

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v3}, Ldf;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget v0, v0, Lom0;->n:I

    .line 59
    .line 60
    const/16 v4, 0x1e

    .line 61
    .line 62
    const/16 v5, 0x23

    .line 63
    .line 64
    const v6, 0x106000d

    .line 65
    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x1

    .line 69
    packed-switch v0, :pswitch_data_0

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v7}, Ll93;->d0(Landroid/view/Window;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v9, Lg14;->a:Ljava/lang/ThreadLocal;

    .line 80
    .line 81
    invoke-virtual {v0, v6, p0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 90
    .line 91
    and-int/lit8 v0, v0, 0x30

    .line 92
    .line 93
    const/16 v6, 0x20

    .line 94
    .line 95
    if-ne v0, v6, :cond_2

    .line 96
    .line 97
    move v7, v8

    .line 98
    :cond_2
    invoke-virtual {v1, p0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 102
    .line 103
    .line 104
    new-instance p0, Lom1;

    .line 105
    .line 106
    invoke-direct {p0, v3}, Lom1;-><init>(Landroid/view/View;)V

    .line 107
    .line 108
    .line 109
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    if-lt v0, v5, :cond_3

    .line 112
    .line 113
    new-instance v0, Ltb5;

    .line 114
    .line 115
    invoke-direct {v0, v1, p0}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    if-lt v0, v4, :cond_4

    .line 120
    .line 121
    new-instance v0, Lsb5;

    .line 122
    .line 123
    invoke-direct {v0, v1, p0}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    if-lt v0, v2, :cond_5

    .line 128
    .line 129
    new-instance v0, Lrb5;

    .line 130
    .line 131
    invoke-direct {v0, v1, p0}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    new-instance v0, Lqb5;

    .line 136
    .line 137
    invoke-direct {v0, v1, p0}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 138
    .line 139
    .line 140
    :goto_1
    xor-int/lit8 p0, v7, 0x1

    .line 141
    .line 142
    invoke-virtual {v0, p0}, Lsu3;->D(Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, p0}, Lsu3;->C(Z)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_4

    .line 149
    .line 150
    :pswitch_0
    invoke-static {v1, v7}, Ll93;->d0(Landroid/view/Window;Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sget-object v7, Lg14;->a:Ljava/lang/ThreadLocal;

    .line 158
    .line 159
    invoke-virtual {v0, v6, p0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    const v7, 0x7f06034f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v7, p0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    invoke-virtual {v1, v6}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 174
    .line 175
    .line 176
    new-instance p0, Lom1;

    .line 177
    .line 178
    invoke-direct {p0, v3}, Lom1;-><init>(Landroid/view/View;)V

    .line 179
    .line 180
    .line 181
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 182
    .line 183
    if-lt v0, v5, :cond_6

    .line 184
    .line 185
    new-instance v0, Ltb5;

    .line 186
    .line 187
    invoke-direct {v0, v1, p0}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_6
    if-lt v0, v4, :cond_7

    .line 192
    .line 193
    new-instance v0, Lsb5;

    .line 194
    .line 195
    invoke-direct {v0, v1, p0}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_7
    if-lt v0, v2, :cond_8

    .line 200
    .line 201
    new-instance v0, Lrb5;

    .line 202
    .line 203
    invoke-direct {v0, v1, p0}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_8
    new-instance v0, Lqb5;

    .line 208
    .line 209
    invoke-direct {v0, v1, p0}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 210
    .line 211
    .line 212
    :goto_2
    invoke-virtual {v0, v8}, Lsu3;->D(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v8}, Lsu3;->C(Z)V

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :pswitch_1
    invoke-static {v1, v7}, Ll93;->d0(Landroid/view/Window;Z)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    sget-object v7, Lg14;->a:Ljava/lang/ThreadLocal;

    .line 227
    .line 228
    invoke-virtual {v0, v6, p0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    invoke-virtual {v1, p0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 233
    .line 234
    .line 235
    new-instance p0, Lom1;

    .line 236
    .line 237
    invoke-direct {p0, v3}, Lom1;-><init>(Landroid/view/View;)V

    .line 238
    .line 239
    .line 240
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 241
    .line 242
    if-lt v0, v5, :cond_9

    .line 243
    .line 244
    new-instance v0, Ltb5;

    .line 245
    .line 246
    invoke-direct {v0, v1, p0}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_9
    if-lt v0, v4, :cond_a

    .line 251
    .line 252
    new-instance v0, Lsb5;

    .line 253
    .line 254
    invoke-direct {v0, v1, p0}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_a
    if-lt v0, v2, :cond_b

    .line 259
    .line 260
    new-instance v0, Lrb5;

    .line 261
    .line 262
    invoke-direct {v0, v1, p0}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_b
    new-instance v0, Lqb5;

    .line 267
    .line 268
    invoke-direct {v0, v1, p0}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 269
    .line 270
    .line 271
    :goto_3
    invoke-virtual {v0, v8}, Lsu3;->D(Z)V

    .line 272
    .line 273
    .line 274
    const/high16 p0, 0x8000000

    .line 275
    .line 276
    invoke-virtual {v1, p0}, Landroid/view/Window;->addFlags(I)V

    .line 277
    .line 278
    .line 279
    :goto_4
    return-void

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final U(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lkb4;->O()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-static {}, Lkb4;->t()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0, v0}, Lkb4;->P(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final V(Ljava/lang/String;JJJ)J
    .locals 4

    .line 1
    sget v0, Leq4;->a:I

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-wide p1

    .line 12
    :cond_0
    invoke-static {v0}, Lxm4;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 p2, 0x27

    .line 17
    .line 18
    const-string v1, "System property \'"

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    cmp-long p1, p3, v2

    .line 27
    .line 28
    if-gtz p1, :cond_1

    .line 29
    .line 30
    cmp-long p1, v2, p5

    .line 31
    .line 32
    if-gtz p1, :cond_1

    .line 33
    .line 34
    return-wide v2

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, "\' should be in range "

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ".."

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p0, ", but is \'"

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    new-instance p3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p0, "\' has unrecognized value \'"

    .line 95
    .line 96
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1
.end method

.method public static W(Ljava/lang/String;II)I
    .locals 7

    .line 1
    and-int/lit8 p2, p2, 0x8

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const p2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const p2, 0x1ffffe

    .line 10
    .line 11
    .line 12
    :goto_0
    int-to-long v1, p1

    .line 13
    const-wide/16 v3, 0x1

    .line 14
    .line 15
    int-to-long v5, p2

    .line 16
    move-object v0, p0

    .line 17
    invoke-static/range {v0 .. v6}, Lkb4;->V(Ljava/lang/String;JJJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    long-to-int p0, p0

    .line 22
    return p0
.end method

.method public static final X(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Ls14;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, Ls14;

    .line 7
    .line 8
    iget-object p0, p0, Ls14;->n:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method

.method public static Y(Ljo1;)Lcom/eddyizm/tempus/subsonic/models/AlbumID3;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ljo1;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Ljo1;->c:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    move-object v4, v3

    .line 13
    iget-object v3, v0, Ljo1;->e:Ljava/lang/String;

    .line 14
    .line 15
    move-object v5, v4

    .line 16
    iget-object v4, v0, Ljo1;->d:Ljava/lang/String;

    .line 17
    .line 18
    move-object v6, v5

    .line 19
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    iget-object v0, v0, Ljo1;->b:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v8, 0x0

    .line 38
    move v9, v8

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    if-eqz v10, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    check-cast v10, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 50
    .line 51
    invoke-virtual {v10}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    if-eqz v10, :cond_0

    .line 56
    .line 57
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    move v10, v8

    .line 63
    :goto_1
    add-int/2addr v9, v10

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCreated()Ljava/util/Date;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    if-eqz v10, :cond_2

    .line 78
    .line 79
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    :cond_2
    move v11, v8

    .line 84
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    move-object v6, v7

    .line 89
    move-object v7, v0

    .line 90
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 91
    .line 92
    const/4 v8, 0x0

    .line 93
    const/4 v10, 0x0

    .line 94
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x0

    .line 96
    const/4 v15, 0x0

    .line 97
    const/16 v16, 0x0

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    const/16 v18, 0x0

    .line 102
    .line 103
    const/16 v19, 0x0

    .line 104
    .line 105
    const/16 v20, 0x0

    .line 106
    .line 107
    const/16 v21, 0x0

    .line 108
    .line 109
    const/16 v22, 0x0

    .line 110
    .line 111
    const/16 v23, 0x0

    .line 112
    .line 113
    const/16 v24, 0x0

    .line 114
    .line 115
    const/16 v25, 0x0

    .line 116
    .line 117
    const/16 v26, 0x0

    .line 118
    .line 119
    const v27, 0x3fff280

    .line 120
    .line 121
    .line 122
    const/16 v28, 0x0

    .line 123
    .line 124
    invoke-direct/range {v0 .. v28}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Ljava/lang/Boolean;Ljava/util/List;ILxj0;)V

    .line 125
    .line 126
    .line 127
    return-object v0
.end method

.method public static final Z(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lkb4;->O()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-static {}, Lkb4;->t()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lu01;->n:Lu01;

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    move-object p1, v1

    .line 19
    :cond_1
    invoke-static {p1, v0}, Lkb4;->P(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_7

    .line 28
    .line 29
    if-eqz p0, :cond_6

    .line 30
    .line 31
    invoke-static {p0}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-static {v0}, Lkb4;->e(Ljava/util/List;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v2, 0x0

    .line 52
    :goto_0
    if-ge v2, v0, :cond_6

    .line 53
    .line 54
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    check-cast v3, Ljo1;

    .line 61
    .line 62
    iget-object v4, v3, Ljo1;->b:Ljava/util/List;

    .line 63
    .line 64
    new-instance v5, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_5

    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    move-object v7, v6

    .line 84
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 85
    .line 86
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {p0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-nez v7, :cond_4

    .line 95
    .line 96
    iget-object v7, v3, Ljo1;->e:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_3

    .line 103
    .line 104
    :cond_4
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    invoke-static {v5, v1}, Lv40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_6
    :goto_2
    move-object p1, v1

    .line 113
    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 116
    .line 117
    .line 118
    return-object p0
.end method

.method public static final a(ILjava/util/ArrayList;)Ljava/util/List;
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lkb4;->O()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-static {}, Lkb4;->t()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const-string v1, "alphabeticalByName"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    move-object v5, p1

    .line 22
    invoke-static/range {v1 .. v6}, Lkb4;->c(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1, p0}, Lq40;->u0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/16 p1, 0x1f4

    .line 31
    .line 32
    invoke-static {p0, p1}, Lq40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static a0(Landroid/content/Context;)Ljava/util/Set;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "lan-playback"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "trusted"

    .line 12
    .line 13
    sget-object v1, Lz01;->n:Lz01;

    .line 14
    .line 15
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast p0, Ljava/lang/Iterable;

    .line 23
    .line 24
    invoke-static {p0}, Lq40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static final b(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Ljava/util/List;
    .locals 7

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lkb4;->O()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p4

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {}, Lkb4;->t()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    move-object v1, p0

    .line 17
    move v2, p1

    .line 18
    move-object v3, p2

    .line 19
    move-object v4, p3

    .line 20
    move-object v5, p4

    .line 21
    invoke-static/range {v1 .. v6}, Lkb4;->c(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public static final b0(ILdd0;Lba1;Lwv3;)Ljava/lang/Boolean;
    .locals 7

    .line 1
    invoke-virtual {p2}, Lba1;->v0()Lz91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x3

    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v0, v4, :cond_3

    .line 16
    .line 17
    if-eq v0, v3, :cond_d

    .line 18
    .line 19
    if-ne v0, v2, :cond_2

    .line 20
    .line 21
    invoke-virtual {p2}, Lba1;->s0()Lx91;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-boolean v0, v0, Lx91;->a:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ldd0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/Boolean;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    if-nez p3, :cond_1

    .line 37
    .line 38
    invoke-static {p2, p0, p1}, Lkb4;->v(Lba1;ILif1;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lkb4;->R(ILdd0;Lba1;Lwv3;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_2
    invoke-static {}, Ler1;->n()V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_3
    invoke-static {p2}, Lte5;->s(Lba1;)Lba1;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v5, "ActiveParent must have a focusedChild"

    .line 65
    .line 66
    if-eqz v0, :cond_c

    .line 67
    .line 68
    invoke-virtual {v0}, Lba1;->v0()Lz91;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_a

    .line 77
    .line 78
    if-eq v6, v4, :cond_5

    .line 79
    .line 80
    if-eq v6, v3, :cond_a

    .line 81
    .line 82
    if-eq v6, v2, :cond_4

    .line 83
    .line 84
    invoke-static {}, Ler1;->n()V

    .line 85
    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_4
    invoke-static {v5}, Lkf2;->o(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_5
    invoke-static {p0, p1, v0, p3}, Lkb4;->b0(ILdd0;Lba1;Lwv3;)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-static {v2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-nez v3, :cond_6

    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_6
    if-nez p3, :cond_9

    .line 106
    .line 107
    invoke-virtual {v0}, Lba1;->v0()Lz91;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    sget-object v2, Lz91;->o:Lz91;

    .line 112
    .line 113
    if-ne p3, v2, :cond_8

    .line 114
    .line 115
    invoke-static {v0}, Lte5;->p(Lba1;)Lba1;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    if-eqz p3, :cond_7

    .line 120
    .line 121
    invoke-static {p3}, Lte5;->r(Lba1;)Lwv3;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    goto :goto_0

    .line 126
    :cond_7
    invoke-static {v5}, Lkf2;->o(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_8
    const-string p0, "Searching for active node in inactive hierarchy"

    .line 131
    .line 132
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v1

    .line 136
    :cond_9
    :goto_0
    invoke-static {p0, p1, p2, p3}, Lkb4;->x(ILdd0;Lba1;Lwv3;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :cond_a
    if-nez p3, :cond_b

    .line 146
    .line 147
    invoke-static {v0}, Lte5;->r(Lba1;)Lwv3;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    :cond_b
    invoke-static {p0, p1, p2, p3}, Lkb4;->x(ILdd0;Lba1;Lwv3;)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :cond_c
    invoke-static {v5}, Lkf2;->o(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_d
    invoke-static {p2, p0, p1}, Lkb4;->v(Lba1;ILif1;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0
.end method

.method public static c(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 7

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    sget-object v0, Lu01;->n:Lu01;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move-object v0, p4

    .line 7
    :goto_0
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-static {v0, v1}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Llg2;->W(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0x10

    .line 18
    .line 19
    if-ge v2, v3, :cond_1

    .line 20
    .line 21
    move v2, v3

    .line 22
    :cond_1
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    move-object v4, v2

    .line 42
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 43
    .line 44
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-static {p5}, Lkb4;->e(Ljava/util/List;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object p5

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-static {p5, v1}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p5}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const/4 v2, 0x0

    .line 70
    move v4, v2

    .line 71
    :goto_2
    if-ge v4, v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {p5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    check-cast v5, Ljo1;

    .line 80
    .line 81
    iget-object v6, v5, Ljo1;->a:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 88
    .line 89
    if-nez v6, :cond_3

    .line 90
    .line 91
    invoke-static {v5}, Lkb4;->Y(Ljo1;)Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    :cond_3
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result p5

    .line 103
    sget-object v1, Lkb4;->a:Lca1;

    .line 104
    .line 105
    sparse-switch p5, :sswitch_data_0

    .line 106
    .line 107
    .line 108
    goto/16 :goto_5

    .line 109
    .line 110
    :sswitch_0
    const-string p2, "alphabeticalByArtist"

    .line 111
    .line 112
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_5

    .line 117
    .line 118
    goto/16 :goto_5

    .line 119
    .line 120
    :cond_5
    new-instance p0, Lca1;

    .line 121
    .line 122
    const/16 p2, 0x13

    .line 123
    .line 124
    invoke-direct {p0, p2}, Lca1;-><init>(I)V

    .line 125
    .line 126
    .line 127
    new-instance p2, Lw60;

    .line 128
    .line 129
    invoke-direct {p2, v2, p0}, Lw60;-><init>(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, p2}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    goto/16 :goto_6

    .line 137
    .line 138
    :sswitch_1
    const-string p2, "highest"

    .line 139
    .line 140
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-nez p0, :cond_e

    .line 145
    .line 146
    goto/16 :goto_5

    .line 147
    .line 148
    :sswitch_2
    const-string p2, "recent"

    .line 149
    .line 150
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-nez p0, :cond_e

    .line 155
    .line 156
    goto/16 :goto_5

    .line 157
    .line 158
    :sswitch_3
    const-string p2, "random"

    .line 159
    .line 160
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-nez p0, :cond_6

    .line 165
    .line 166
    goto/16 :goto_5

    .line 167
    .line 168
    :cond_6
    invoke-static {v0}, Lq40;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-static {p0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_6

    .line 176
    .line 177
    :sswitch_4
    const-string p2, "newest"

    .line 178
    .line 179
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-nez p0, :cond_7

    .line 184
    .line 185
    goto/16 :goto_5

    .line 186
    .line 187
    :cond_7
    if-eqz p4, :cond_8

    .line 188
    .line 189
    invoke-static {p4, v0}, Lkb4;->D(Ljava/util/List;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    goto/16 :goto_6

    .line 194
    .line 195
    :cond_8
    new-instance p0, Lca1;

    .line 196
    .line 197
    const/16 p2, 0x16

    .line 198
    .line 199
    invoke-direct {p0, p2}, Lca1;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-static {v0, p0}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    goto/16 :goto_6

    .line 207
    .line 208
    :sswitch_5
    const-string p4, "byYear"

    .line 209
    .line 210
    invoke-virtual {p0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-nez p0, :cond_9

    .line 215
    .line 216
    goto/16 :goto_5

    .line 217
    .line 218
    :cond_9
    if-eqz p2, :cond_d

    .line 219
    .line 220
    if-nez p3, :cond_a

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_a
    new-instance p0, Lj02;

    .line 224
    .line 225
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result p4

    .line 229
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result p5

    .line 233
    invoke-static {p4, p5}, Ljava/lang/Math;->min(II)I

    .line 234
    .line 235
    .line 236
    move-result p4

    .line 237
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result p5

    .line 241
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    invoke-static {p5, v1}, Ljava/lang/Math;->max(II)I

    .line 246
    .line 247
    .line 248
    move-result p5

    .line 249
    const/4 v1, 0x1

    .line 250
    invoke-direct {p0, p4, p5, v1}, Lh02;-><init>(III)V

    .line 251
    .line 252
    .line 253
    new-instance p4, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 259
    .line 260
    .line 261
    move-result p5

    .line 262
    :cond_b
    :goto_3
    if-ge v2, p5, :cond_c

    .line 263
    .line 264
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    add-int/lit8 v2, v2, 0x1

    .line 269
    .line 270
    move-object v3, v1

    .line 271
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 272
    .line 273
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    iget v4, p0, Lh02;->n:I

    .line 278
    .line 279
    if-gt v4, v3, :cond_b

    .line 280
    .line 281
    iget v4, p0, Lh02;->o:I

    .line 282
    .line 283
    if-gt v3, v4, :cond_b

    .line 284
    .line 285
    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_c
    new-instance p0, Lca1;

    .line 290
    .line 291
    const/16 p5, 0x15

    .line 292
    .line 293
    invoke-direct {p0, p5}, Lca1;-><init>(I)V

    .line 294
    .line 295
    .line 296
    invoke-static {p4, p0}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p2

    .line 304
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result p3

    .line 308
    if-le p2, p3, :cond_10

    .line 309
    .line 310
    invoke-static {p0}, Lq40;->H0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    goto :goto_6

    .line 315
    :cond_d
    :goto_4
    new-instance p0, Lca1;

    .line 316
    .line 317
    const/16 p2, 0x14

    .line 318
    .line 319
    invoke-direct {p0, p2}, Lca1;-><init>(I)V

    .line 320
    .line 321
    .line 322
    invoke-static {v0, p0}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    goto :goto_6

    .line 327
    :sswitch_6
    const-string p2, "frequent"

    .line 328
    .line 329
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result p0

    .line 333
    if-nez p0, :cond_e

    .line 334
    .line 335
    goto :goto_5

    .line 336
    :sswitch_7
    const-string p2, "starred"

    .line 337
    .line 338
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result p0

    .line 342
    if-nez p0, :cond_e

    .line 343
    .line 344
    :goto_5
    invoke-static {v0, v1}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    goto :goto_6

    .line 349
    :cond_e
    if-eqz p4, :cond_f

    .line 350
    .line 351
    invoke-static {p4, v0}, Lkb4;->D(Ljava/util/List;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    goto :goto_6

    .line 356
    :cond_f
    invoke-static {v0, v1}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    :cond_10
    :goto_6
    if-lez p1, :cond_11

    .line 361
    .line 362
    invoke-static {p0, p1}, Lq40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    :cond_11
    return-object p0

    .line 367
    :sswitch_data_0
    .sparse-switch
        -0x7114c701 -> :sswitch_7
        -0x5af92d32 -> :sswitch_6
        -0x51f1facc -> :sswitch_5
        -0x3e84041a -> :sswitch_4
        -0x37ed1b3d -> :sswitch_3
        -0x37b9b9a5 -> :sswitch_2
        0x369130a4 -> :sswitch_1
        0x7273d656 -> :sswitch_0
    .end sparse-switch
.end method

.method public static varargs c0([[B)[B
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    array-length v3, p0

    .line 5
    if-ge v1, v3, :cond_0

    .line 6
    .line 7
    aget-object v3, p0, v1

    .line 8
    .line 9
    array-length v3, v3

    .line 10
    add-int/2addr v2, v3

    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-array v1, v2, [B

    .line 15
    .line 16
    move v2, v0

    .line 17
    move v4, v2

    .line 18
    :goto_1
    if-ge v2, v3, :cond_1

    .line 19
    .line 20
    aget-object v5, p0, v2

    .line 21
    .line 22
    array-length v6, v5

    .line 23
    invoke-static {v5, v0, v1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    add-int/2addr v4, v6

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    return-object v1
.end method

.method public static final d(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lkb4;->O()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-static {}, Lkb4;->t()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkb4;->P(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    if-nez p0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {v0}, Lkb4;->e(Ljava/util/List;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x0

    .line 44
    :cond_3
    if-ge v1, v0, :cond_4

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    move-object v3, v2

    .line 53
    check-cast v3, Ljo1;

    .line 54
    .line 55
    iget-object v3, v3, Ljo1;->a:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    const/4 v2, 0x0

    .line 65
    :goto_0
    check-cast v2, Ljo1;

    .line 66
    .line 67
    if-eqz v2, :cond_5

    .line 68
    .line 69
    iget-object p0, v2, Ljo1;->b:Ljava/util/List;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_5
    :goto_1
    sget-object p0, Lu01;->n:Lu01;

    .line 73
    .line 74
    return-object p0
.end method

.method public static e(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    move v3, v2

    .line 44
    :goto_1
    const/4 v4, 0x0

    .line 45
    if-ge v3, v1, :cond_7

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    move-object v6, v5

    .line 54
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 55
    .line 56
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    if-eqz v7, :cond_4

    .line 61
    .line 62
    invoke-static {v7}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-nez v8, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    move-object v7, v4

    .line 70
    :goto_2
    if-nez v7, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    move-object v4, v7

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    :goto_3
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    invoke-static {v6}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_5

    .line 86
    .line 87
    move-object v4, v6

    .line 88
    :cond_5
    :goto_4
    invoke-virtual {p0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-nez v6, :cond_6

    .line 93
    .line 94
    new-instance v6, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_6
    check-cast v6, Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    :cond_8
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_a

    .line 126
    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Ljava/util/Map$Entry;

    .line 132
    .line 133
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Ljava/lang/String;

    .line 138
    .line 139
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Ljava/util/List;

    .line 144
    .line 145
    if-eqz v3, :cond_9

    .line 146
    .line 147
    new-instance v5, Ljo1;

    .line 148
    .line 149
    new-instance v6, Lk2;

    .line 150
    .line 151
    const/16 v7, 0x15

    .line 152
    .line 153
    invoke-direct {v6, v7, v2}, Lk2;-><init>(IB)V

    .line 154
    .line 155
    .line 156
    new-instance v7, Lk2;

    .line 157
    .line 158
    const/16 v8, 0x16

    .line 159
    .line 160
    invoke-direct {v7, v8, v2}, Lk2;-><init>(IB)V

    .line 161
    .line 162
    .line 163
    new-instance v8, Lk2;

    .line 164
    .line 165
    const/16 v9, 0x17

    .line 166
    .line 167
    invoke-direct {v8, v9, v2}, Lk2;-><init>(IB)V

    .line 168
    .line 169
    .line 170
    const/4 v9, 0x3

    .line 171
    new-array v9, v9, [Lif1;

    .line 172
    .line 173
    aput-object v6, v9, v2

    .line 174
    .line 175
    const/4 v6, 0x1

    .line 176
    aput-object v7, v9, v6

    .line 177
    .line 178
    const/4 v7, 0x2

    .line 179
    aput-object v8, v9, v7

    .line 180
    .line 181
    new-instance v7, Lw60;

    .line 182
    .line 183
    invoke-direct {v7, v6, v9}, Lw60;-><init>(ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v1, v7}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-direct {v5, v3, v1}, Ljo1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_9
    move-object v5, v4

    .line 195
    :goto_6
    if-eqz v5, :cond_8

    .line 196
    .line 197
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_a
    return-object v0
.end method

.method public static f(Lcom/skydoves/colorpickerview/ColorPickerView;Landroid/graphics/Point;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 4

    .line 1
    iget v0, p2, Landroid/graphics/Point;->x:I

    .line 2
    .line 3
    iget v1, p1, Landroid/graphics/Point;->x:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p2, Landroid/graphics/Point;->x:I

    .line 11
    .line 12
    iget v2, p1, Landroid/graphics/Point;->x:I

    .line 13
    .line 14
    sub-int/2addr v1, v2

    .line 15
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    mul-int/2addr v1, v0

    .line 20
    iget v0, p2, Landroid/graphics/Point;->y:I

    .line 21
    .line 22
    iget v2, p1, Landroid/graphics/Point;->y:I

    .line 23
    .line 24
    sub-int/2addr v0, v2

    .line 25
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v2, p2, Landroid/graphics/Point;->y:I

    .line 30
    .line 31
    iget v3, p1, Landroid/graphics/Point;->y:I

    .line 32
    .line 33
    sub-int/2addr v2, v3

    .line 34
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    mul-int/2addr v2, v0

    .line 39
    add-int/2addr v2, v1

    .line 40
    int-to-double v0, v2

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    double-to-int v0, v0

    .line 46
    const/4 v1, 0x3

    .line 47
    if-gt v0, v1, :cond_0

    .line 48
    .line 49
    return-object p2

    .line 50
    :cond_0
    new-instance v0, Landroid/graphics/Point;

    .line 51
    .line 52
    iget v1, p2, Landroid/graphics/Point;->x:I

    .line 53
    .line 54
    iget v2, p1, Landroid/graphics/Point;->x:I

    .line 55
    .line 56
    add-int/2addr v1, v2

    .line 57
    div-int/lit8 v1, v1, 0x2

    .line 58
    .line 59
    iget v2, p2, Landroid/graphics/Point;->y:I

    .line 60
    .line 61
    iget v3, p1, Landroid/graphics/Point;->y:I

    .line 62
    .line 63
    add-int/2addr v2, v3

    .line 64
    div-int/lit8 v2, v2, 0x2

    .line 65
    .line 66
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 67
    .line 68
    .line 69
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 70
    .line 71
    int-to-float v1, v1

    .line 72
    iget v2, v0, Landroid/graphics/Point;->y:I

    .line 73
    .line 74
    int-to-float v2, v2

    .line 75
    invoke-virtual {p0, v1, v2}, Lcom/skydoves/colorpickerview/ColorPickerView;->d(FF)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_1

    .line 84
    .line 85
    invoke-static {p0, v0, p2}, Lkb4;->f(Lcom/skydoves/colorpickerview/ColorPickerView;Landroid/graphics/Point;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_1
    invoke-static {p0, p1, v0}, Lkb4;->f(Lcom/skydoves/colorpickerview/ColorPickerView;Landroid/graphics/Point;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public static final g(Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;)Lcom/eddyizm/tempus/subsonic/models/ArtistID3;
    .locals 10

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lkb4;->O()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-static {}, Lkb4;->t()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    invoke-static {v0}, Lkb4;->e(Ljava/util/List;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    move v4, v3

    .line 32
    :cond_2
    :goto_0
    if-ge v4, v2, :cond_6

    .line 33
    .line 34
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    move-object v6, v5

    .line 41
    check-cast v6, Ljo1;

    .line 42
    .line 43
    iget-object v7, v6, Ljo1;->d:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v7, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-nez v7, :cond_5

    .line 50
    .line 51
    iget-object v6, v6, Ljo1;->b:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_2

    .line 69
    .line 70
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 75
    .line 76
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-static {v7, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    :cond_5
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    const/4 v0, 0x0

    .line 91
    if-nez p1, :cond_7

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_7

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_7
    if-eqz p1, :cond_8

    .line 101
    .line 102
    move-object v2, p1

    .line 103
    goto :goto_1

    .line 104
    :cond_8
    move-object v2, v0

    .line 105
    :goto_1
    sget-object v4, Lu01;->n:Lu01;

    .line 106
    .line 107
    if-eqz v2, :cond_b

    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;->getAlbums()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    if-nez v5, :cond_9

    .line 114
    .line 115
    move-object v5, v4

    .line 116
    :cond_9
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;->getAppearsOn()Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-nez v2, :cond_a

    .line 121
    .line 122
    move-object v2, v4

    .line 123
    :cond_a
    invoke-static {v5, v2}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    goto :goto_2

    .line 128
    :cond_b
    move-object v2, v0

    .line 129
    :goto_2
    if-nez v2, :cond_c

    .line 130
    .line 131
    move-object v2, v4

    .line 132
    :cond_c
    const/16 v5, 0xa

    .line 133
    .line 134
    invoke-static {v2, v5}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    invoke-static {v6}, Llg2;->W(I)I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    const/16 v7, 0x10

    .line 143
    .line 144
    if-ge v6, v7, :cond_d

    .line 145
    .line 146
    move v6, v7

    .line 147
    :cond_d
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 148
    .line 149
    invoke-direct {v7, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-eqz v6, :cond_e

    .line 161
    .line 162
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    move-object v8, v6

    .line 167
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 168
    .line 169
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-interface {v7, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    move v6, v3

    .line 182
    :cond_f
    if-ge v6, v2, :cond_10

    .line 183
    .line 184
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    add-int/lit8 v6, v6, 0x1

    .line 189
    .line 190
    move-object v9, v8

    .line 191
    check-cast v9, Ljo1;

    .line 192
    .line 193
    iget-object v9, v9, Ljo1;->d:Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v9, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    if-eqz v9, :cond_f

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_10
    move-object v8, v0

    .line 203
    :goto_4
    check-cast v8, Ljo1;

    .line 204
    .line 205
    if-nez v8, :cond_11

    .line 206
    .line 207
    invoke-static {v1}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    move-object v8, v2

    .line 212
    check-cast v8, Ljo1;

    .line 213
    .line 214
    :cond_11
    new-instance v2, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-static {v1, v5}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    :goto_5
    if-ge v3, v5, :cond_13

    .line 228
    .line 229
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    add-int/lit8 v3, v3, 0x1

    .line 234
    .line 235
    check-cast v6, Ljo1;

    .line 236
    .line 237
    iget-object v9, v6, Ljo1;->a:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v7, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    check-cast v9, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 244
    .line 245
    if-nez v9, :cond_12

    .line 246
    .line 247
    invoke-static {v6}, Lkb4;->Y(Ljo1;)Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    :cond_12
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_13
    new-instance v3, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 256
    .line 257
    invoke-direct {v3, v2, v4}, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setId(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    if-eqz p1, :cond_14

    .line 264
    .line 265
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    if-nez p0, :cond_16

    .line 270
    .line 271
    :cond_14
    if-eqz v8, :cond_15

    .line 272
    .line 273
    iget-object p0, v8, Ljo1;->e:Ljava/lang/String;

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_15
    move-object p0, v0

    .line 277
    :cond_16
    :goto_6
    invoke-virtual {v3, p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setName(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    if-eqz p1, :cond_17

    .line 281
    .line 282
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    if-nez p0, :cond_19

    .line 287
    .line 288
    :cond_17
    if-eqz v8, :cond_18

    .line 289
    .line 290
    iget-object p0, v8, Ljo1;->c:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 291
    .line 292
    if-eqz p0, :cond_18

    .line 293
    .line 294
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    goto :goto_7

    .line 299
    :cond_18
    move-object p0, v0

    .line 300
    :cond_19
    :goto_7
    invoke-virtual {v3, p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setCoverArtId(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    invoke-virtual {v3, p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setAlbumCount(I)V

    .line 308
    .line 309
    .line 310
    if-eqz p1, :cond_1a

    .line 311
    .line 312
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getStarred()Ljava/util/Date;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    :cond_1a
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setStarred(Ljava/util/Date;)V

    .line 317
    .line 318
    .line 319
    return-object v3
.end method

.method public static final h(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 13

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lkb4;->O()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {}, Lkb4;->t()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    sget-object p0, Lu01;->n:Lu01;

    .line 19
    .line 20
    :cond_1
    const/16 v2, 0xa

    .line 21
    .line 22
    invoke-static {p0, v2}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v2}, Llg2;->W(I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v3, 0x10

    .line 31
    .line 32
    if-ge v2, v3, :cond_2

    .line 33
    .line 34
    move v2, v3

    .line 35
    :cond_2
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    move-object v4, v2

    .line 55
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 56
    .line 57
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {v1}, Lkb4;->e(Ljava/util/List;)Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance v1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    const/4 v4, 0x0

    .line 79
    move v5, v4

    .line 80
    :cond_4
    :goto_1
    if-ge v5, v2, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    add-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    move-object v7, v6

    .line 89
    check-cast v7, Ljo1;

    .line 90
    .line 91
    iget-object v7, v7, Ljo1;->d:Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v7, :cond_4

    .line 94
    .line 95
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    :goto_2
    if-ge v4, v2, :cond_7

    .line 109
    .line 110
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    move-object v6, v5

    .line 117
    check-cast v6, Ljo1;

    .line 118
    .line 119
    iget-object v6, v6, Ljo1;->d:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    if-nez v7, :cond_6

    .line 129
    .line 130
    new-instance v7, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-interface {p0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :cond_6
    check-cast v7, Ljava/util/List;

    .line 139
    .line 140
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_9

    .line 166
    .line 167
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Ljava/util/Map$Entry;

    .line 172
    .line 173
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    move-object v6, v4

    .line 178
    check-cast v6, Ljava/lang/String;

    .line 179
    .line 180
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Ljava/util/List;

    .line 185
    .line 186
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 191
    .line 192
    if-nez v4, :cond_8

    .line 193
    .line 194
    new-instance v5, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 195
    .line 196
    invoke-static {v2}, Lq40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    check-cast v4, Ljo1;

    .line 201
    .line 202
    iget-object v7, v4, Ljo1;->e:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v2}, Lq40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    check-cast v4, Ljo1;

    .line 209
    .line 210
    iget-object v4, v4, Ljo1;->c:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 211
    .line 212
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    const/16 v11, 0x10

    .line 221
    .line 222
    const/4 v12, 0x0

    .line 223
    const/4 v10, 0x0

    .line 224
    invoke-direct/range {v5 .. v12}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;ILxj0;)V

    .line 225
    .line 226
    .line 227
    move-object v4, v5

    .line 228
    :cond_8
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_9
    new-instance p0, Lca1;

    .line 233
    .line 234
    const/16 v2, 0x17

    .line 235
    .line 236
    invoke-direct {p0, v2}, Lca1;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-static {v1, p0}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 244
    .line 245
    .line 246
    return-object v0
.end method

.method public static i(Ldx2;J)Ldx2;
    .locals 1

    .line 1
    new-instance v0, Lto;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lto;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ldx2;->c(Ldx2;)Ldx2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final j(Lwv3;Lwv3;Lwv3;I)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    invoke-static {v3, v2, v0}, Lkb4;->k(ILwv3;Lwv3;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget v5, v2, Lwv3;->b:F

    .line 14
    .line 15
    iget v6, v2, Lwv3;->d:F

    .line 16
    .line 17
    iget v7, v2, Lwv3;->a:F

    .line 18
    .line 19
    iget v2, v2, Lwv3;->c:F

    .line 20
    .line 21
    iget v8, v0, Lwv3;->d:F

    .line 22
    .line 23
    iget v9, v0, Lwv3;->b:F

    .line 24
    .line 25
    iget v10, v0, Lwv3;->c:F

    .line 26
    .line 27
    iget v11, v0, Lwv3;->a:F

    .line 28
    .line 29
    const/4 v12, 0x0

    .line 30
    if-nez v4, :cond_13

    .line 31
    .line 32
    invoke-static {v3, v1, v0}, Lkb4;->k(ILwv3;Lwv3;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    const-string v4, "This function should only be used for 2-D focus search"

    .line 41
    .line 42
    const/4 v13, 0x6

    .line 43
    const/4 v14, 0x5

    .line 44
    const/4 v15, 0x4

    .line 45
    const/16 p0, 0x1

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    if-ne v3, v0, :cond_1

    .line 49
    .line 50
    cmpl-float v16, v11, v2

    .line 51
    .line 52
    if-ltz v16, :cond_11

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    if-ne v3, v15, :cond_2

    .line 56
    .line 57
    cmpg-float v16, v10, v7

    .line 58
    .line 59
    if-gtz v16, :cond_11

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    if-ne v3, v14, :cond_3

    .line 63
    .line 64
    cmpl-float v16, v9, v6

    .line 65
    .line 66
    if-ltz v16, :cond_11

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    if-ne v3, v13, :cond_12

    .line 70
    .line 71
    cmpg-float v16, v8, v5

    .line 72
    .line 73
    if-gtz v16, :cond_11

    .line 74
    .line 75
    :goto_0
    if-ne v3, v0, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    if-ne v3, v15, :cond_5

    .line 79
    .line 80
    :goto_1
    return p0

    .line 81
    :cond_5
    if-ne v3, v0, :cond_6

    .line 82
    .line 83
    iget v1, v1, Lwv3;->c:F

    .line 84
    .line 85
    sub-float v1, v11, v1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    if-ne v3, v15, :cond_7

    .line 89
    .line 90
    iget v1, v1, Lwv3;->a:F

    .line 91
    .line 92
    sub-float/2addr v1, v10

    .line 93
    goto :goto_2

    .line 94
    :cond_7
    if-ne v3, v14, :cond_8

    .line 95
    .line 96
    iget v1, v1, Lwv3;->d:F

    .line 97
    .line 98
    sub-float v1, v9, v1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_8
    if-ne v3, v13, :cond_10

    .line 102
    .line 103
    iget v1, v1, Lwv3;->b:F

    .line 104
    .line 105
    sub-float/2addr v1, v8

    .line 106
    :goto_2
    const/16 v16, 0x0

    .line 107
    .line 108
    cmpg-float v17, v1, v16

    .line 109
    .line 110
    if-gez v17, :cond_9

    .line 111
    .line 112
    move/from16 v1, v16

    .line 113
    .line 114
    :cond_9
    if-ne v3, v0, :cond_a

    .line 115
    .line 116
    sub-float/2addr v11, v7

    .line 117
    goto :goto_3

    .line 118
    :cond_a
    if-ne v3, v15, :cond_b

    .line 119
    .line 120
    sub-float v11, v2, v10

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_b
    if-ne v3, v14, :cond_c

    .line 124
    .line 125
    sub-float v11, v9, v5

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_c
    if-ne v3, v13, :cond_f

    .line 129
    .line 130
    sub-float v11, v6, v8

    .line 131
    .line 132
    :goto_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 133
    .line 134
    cmpg-float v2, v11, v0

    .line 135
    .line 136
    if-gez v2, :cond_d

    .line 137
    .line 138
    move v11, v0

    .line 139
    :cond_d
    cmpg-float v0, v1, v11

    .line 140
    .line 141
    if-gez v0, :cond_e

    .line 142
    .line 143
    return p0

    .line 144
    :cond_e
    return v12

    .line 145
    :cond_f
    invoke-static {v4}, Lkf2;->o(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return v12

    .line 149
    :cond_10
    invoke-static {v4}, Lkf2;->o(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return v12

    .line 153
    :cond_11
    return p0

    .line 154
    :cond_12
    invoke-static {v4}, Lkf2;->o(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_13
    :goto_4
    return v12
.end method

.method public static final k(ILwv3;Lwv3;)Z
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x4

    .line 8
    if-ne p0, v0, :cond_2

    .line 9
    .line 10
    :goto_0
    iget p0, p1, Lwv3;->d:F

    .line 11
    .line 12
    iget v0, p2, Lwv3;->b:F

    .line 13
    .line 14
    cmpl-float p0, p0, v0

    .line 15
    .line 16
    if-lez p0, :cond_1

    .line 17
    .line 18
    iget p0, p1, Lwv3;->b:F

    .line 19
    .line 20
    iget p1, p2, Lwv3;->d:F

    .line 21
    .line 22
    cmpg-float p0, p0, p1

    .line 23
    .line 24
    if-gez p0, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    const/4 v0, 0x5

    .line 29
    if-ne p0, v0, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    const/4 v0, 0x6

    .line 33
    if-ne p0, v0, :cond_5

    .line 34
    .line 35
    :goto_1
    iget p0, p1, Lwv3;->c:F

    .line 36
    .line 37
    iget v0, p2, Lwv3;->a:F

    .line 38
    .line 39
    cmpl-float p0, p0, v0

    .line 40
    .line 41
    if-lez p0, :cond_4

    .line 42
    .line 43
    iget p0, p1, Lwv3;->a:F

    .line 44
    .line 45
    iget p1, p2, Lwv3;->c:F

    .line 46
    .line 47
    cmpg-float p0, p0, p1

    .line 48
    .line 49
    if-gez p0, :cond_4

    .line 50
    .line 51
    return v2

    .line 52
    :cond_4
    return v1

    .line 53
    :cond_5
    const-string p0, "This function should only be used for 2-D focus search"

    .line 54
    .line 55
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return v1
.end method

.method public static l(Lfb4;)Lfb4;
    .locals 1

    .line 1
    iget-object v0, p0, Lfb4;->n:Lag2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lag2;->b()Lag2;

    .line 4
    .line 5
    .line 6
    iget v0, v0, Lag2;->v:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    sget-object p0, Lfb4;->o:Lfb4;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final m(Lba1;Lf13;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcx2;->n:Lcx2;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitChildren called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lf13;

    .line 13
    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    new-array v2, v1, [Lcx2;

    .line 17
    .line 18
    invoke-direct {v0, v2}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcx2;->n:Lcx2;

    .line 22
    .line 23
    iget-object v2, p0, Lcx2;->s:Lcx2;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-static {v0, p0}, Lj51;->b(Lf13;Lcx2;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0, v2}, Lf13;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    iget p0, v0, Lf13;->p:I

    .line 35
    .line 36
    if-eqz p0, :cond_e

    .line 37
    .line 38
    add-int/lit8 p0, p0, -0x1

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lf13;->k(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lcx2;

    .line 45
    .line 46
    iget v2, p0, Lcx2;->q:I

    .line 47
    .line 48
    and-int/lit16 v2, v2, 0x400

    .line 49
    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    invoke-static {v0, p0}, Lj51;->b(Lf13;Lcx2;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    :goto_1
    if-eqz p0, :cond_2

    .line 57
    .line 58
    iget v2, p0, Lcx2;->p:I

    .line 59
    .line 60
    and-int/lit16 v2, v2, 0x400

    .line 61
    .line 62
    if-eqz v2, :cond_d

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    move-object v3, v2

    .line 66
    :goto_2
    if-eqz p0, :cond_2

    .line 67
    .line 68
    instance-of v4, p0, Lba1;

    .line 69
    .line 70
    if-eqz v4, :cond_6

    .line 71
    .line 72
    check-cast p0, Lba1;

    .line 73
    .line 74
    iget-boolean v4, p0, Lcx2;->A:Z

    .line 75
    .line 76
    if-eqz v4, :cond_c

    .line 77
    .line 78
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    iget-boolean v4, v4, Lc72;->Z:Z

    .line 83
    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_4
    invoke-virtual {p0}, Lba1;->s0()Lx91;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget-boolean v4, v4, Lx91;->a:Z

    .line 92
    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Lf13;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    invoke-static {p0, p1}, Lkb4;->m(Lba1;Lf13;)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    iget v4, p0, Lcx2;->p:I

    .line 104
    .line 105
    and-int/lit16 v4, v4, 0x400

    .line 106
    .line 107
    if-eqz v4, :cond_c

    .line 108
    .line 109
    instance-of v4, p0, Lfo0;

    .line 110
    .line 111
    if-eqz v4, :cond_c

    .line 112
    .line 113
    move-object v4, p0

    .line 114
    check-cast v4, Lfo0;

    .line 115
    .line 116
    iget-object v4, v4, Lfo0;->C:Lcx2;

    .line 117
    .line 118
    const/4 v5, 0x0

    .line 119
    :goto_3
    const/4 v6, 0x1

    .line 120
    if-eqz v4, :cond_b

    .line 121
    .line 122
    iget v7, v4, Lcx2;->p:I

    .line 123
    .line 124
    and-int/lit16 v7, v7, 0x400

    .line 125
    .line 126
    if-eqz v7, :cond_a

    .line 127
    .line 128
    add-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    if-ne v5, v6, :cond_7

    .line 131
    .line 132
    move-object p0, v4

    .line 133
    goto :goto_4

    .line 134
    :cond_7
    if-nez v3, :cond_8

    .line 135
    .line 136
    new-instance v3, Lf13;

    .line 137
    .line 138
    new-array v6, v1, [Lcx2;

    .line 139
    .line 140
    invoke-direct {v3, v6}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    if-eqz p0, :cond_9

    .line 144
    .line 145
    invoke-virtual {v3, p0}, Lf13;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object p0, v2

    .line 149
    :cond_9
    invoke-virtual {v3, v4}, Lf13;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_a
    :goto_4
    iget-object v4, v4, Lcx2;->s:Lcx2;

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_b
    if-ne v5, v6, :cond_c

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_c
    :goto_5
    invoke-static {v3}, Lj51;->c(Lf13;)Lcx2;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    goto :goto_2

    .line 163
    :cond_d
    iget-object p0, p0, Lcx2;->s:Lcx2;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_e
    return-void
.end method

.method public static final n(Lce;)Lce;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lce;->c()Lce;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lce;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lce;->a(I)F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {v0, v2, v3}, Lce;->d(IF)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v0
.end method

.method public static final o(Ljava/lang/Throwable;)Ls14;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls14;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static p(Landroid/os/Bundle;)Lkj1;
    .locals 10

    .line 1
    const-string v0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI"

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN"

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME"

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME"

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v2, 0x21

    .line 39
    .line 40
    if-lt v1, v2, :cond_0

    .line 41
    .line 42
    invoke-static {p0}, Ln3;->p(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Landroid/net/Uri;

    .line 47
    .line 48
    :goto_0
    move-object v8, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroid/net/Uri;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :goto_1
    const-string v0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    new-instance v2, Lkj1;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-direct/range {v2 .. v9}, Lkj1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    return-object v2

    .line 75
    :catch_0
    move-exception v0

    .line 76
    move-object p0, v0

    .line 77
    new-instance v0, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenParsingException;

    .line 78
    .line 79
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    throw v0
.end method

.method public static final q(La90;Lqr3;)Ljava/lang/Object;
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lcx2;

    .line 3
    .line 4
    iget-object v0, v0, Lcx2;->n:Lcx2;

    .line 5
    .line 6
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Cannot read CompositionLocal because the Modifier node is not currently attached."

    .line 11
    .line 12
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, Lc72;->M:Lc90;

    .line 20
    .line 21
    check-cast p0, Lmf3;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1}, Lvr1;->C(Lmf3;Lqr3;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static final r(Ljava/util/List;I)Ljava/util/Set;
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/String;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, ""

    .line 10
    .line 11
    :cond_0
    const-string p1, ","

    .line 12
    .line 13
    filled-new-array {p1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x6

    .line 18
    invoke-static {p0, p1, v0}, Lqm4;->C0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v1, v0

    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-static {p1}, Lq40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static final s(Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Directory;)Lcom/eddyizm/tempus/subsonic/models/Directory;
    .locals 48

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lkb4;->O()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {}, Lkb4;->t()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v0, :cond_9

    .line 20
    .line 21
    new-instance v2, Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 41
    .line 42
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    new-instance v4, Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_5

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 72
    .line 73
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    filled-new-array {v6, v7, v5}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v5}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    :cond_4
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_3

    .line 102
    .line 103
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v6, :cond_4

    .line 110
    .line 111
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getChildren()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-eqz v1, :cond_8

    .line 120
    .line 121
    new-instance v3, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_8

    .line 135
    .line 136
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    move-object v6, v5

    .line 141
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 142
    .line 143
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    if-eqz v7, :cond_7

    .line 152
    .line 153
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    goto :goto_3

    .line 158
    :cond_7
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    :goto_3
    if-eqz v6, :cond_6

    .line 163
    .line 164
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_8
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/subsonic/models/Directory;->setChildren(Ljava/util/List;)V

    .line 169
    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_9
    if-nez v2, :cond_a

    .line 173
    .line 174
    goto/16 :goto_b

    .line 175
    .line 176
    :cond_a
    invoke-static {v1}, Lkb4;->e(Ljava/util/List;)Ljava/util/ArrayList;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    const/4 v4, 0x0

    .line 185
    move v5, v4

    .line 186
    :cond_b
    if-ge v5, v1, :cond_c

    .line 187
    .line 188
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    add-int/lit8 v5, v5, 0x1

    .line 193
    .line 194
    move-object v7, v6

    .line 195
    check-cast v7, Ljo1;

    .line 196
    .line 197
    iget-object v7, v7, Ljo1;->a:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-eqz v7, :cond_b

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_c
    move-object v6, v3

    .line 207
    :goto_4
    check-cast v6, Ljo1;

    .line 208
    .line 209
    if-eqz v6, :cond_d

    .line 210
    .line 211
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 212
    .line 213
    iget-object v1, v6, Ljo1;->b:Ljava/util/List;

    .line 214
    .line 215
    iget-object v3, v6, Ljo1;->d:Ljava/lang/String;

    .line 216
    .line 217
    iget-object v4, v6, Ljo1;->c:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 218
    .line 219
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    const/16 v9, 0xf0

    .line 224
    .line 225
    const/4 v10, 0x0

    .line 226
    const/4 v5, 0x0

    .line 227
    const/4 v6, 0x0

    .line 228
    const/4 v7, 0x0

    .line 229
    const/4 v8, 0x0

    .line 230
    invoke-direct/range {v0 .. v10}, Lcom/eddyizm/tempus/subsonic/models/Directory;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;ILxj0;)V

    .line 231
    .line 232
    .line 233
    :goto_5
    move-object v3, v0

    .line 234
    goto/16 :goto_b

    .line 235
    .line 236
    :cond_d
    new-instance v1, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    move v6, v4

    .line 246
    :cond_e
    :goto_6
    if-ge v6, v5, :cond_12

    .line 247
    .line 248
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    add-int/lit8 v6, v6, 0x1

    .line 253
    .line 254
    move-object v8, v7

    .line 255
    check-cast v8, Ljo1;

    .line 256
    .line 257
    iget-object v9, v8, Ljo1;->d:Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v9, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    if-nez v9, :cond_11

    .line 264
    .line 265
    iget-object v8, v8, Ljo1;->b:Ljava/util/List;

    .line 266
    .line 267
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    if-eqz v9, :cond_f

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_f
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    :cond_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    if-eqz v9, :cond_e

    .line 283
    .line 284
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    check-cast v9, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 289
    .line 290
    invoke-virtual {v9}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    invoke-static {v9, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    if-eqz v9, :cond_10

    .line 299
    .line 300
    :cond_11
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_13

    .line 309
    .line 310
    goto/16 :goto_b

    .line 311
    .line 312
    :cond_13
    new-instance v0, Ljava/util/ArrayList;

    .line 313
    .line 314
    const/16 v5, 0xa

    .line 315
    .line 316
    invoke-static {v1, v5}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    move v6, v4

    .line 328
    :goto_7
    if-ge v6, v5, :cond_14

    .line 329
    .line 330
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    add-int/lit8 v6, v6, 0x1

    .line 335
    .line 336
    check-cast v7, Ljo1;

    .line 337
    .line 338
    new-instance v8, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 339
    .line 340
    iget-object v9, v7, Ljo1;->a:Ljava/lang/String;

    .line 341
    .line 342
    iget-object v10, v7, Ljo1;->c:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 343
    .line 344
    const/16 v45, 0x7

    .line 345
    .line 346
    const/16 v46, 0x0

    .line 347
    .line 348
    move-object v11, v10

    .line 349
    const/4 v10, 0x0

    .line 350
    move-object v12, v11

    .line 351
    const/4 v11, 0x0

    .line 352
    move-object v13, v12

    .line 353
    const/4 v12, 0x0

    .line 354
    move-object v14, v13

    .line 355
    const/4 v13, 0x0

    .line 356
    move-object v15, v14

    .line 357
    const/4 v14, 0x0

    .line 358
    move-object/from16 v16, v15

    .line 359
    .line 360
    const/4 v15, 0x0

    .line 361
    move-object/from16 v17, v16

    .line 362
    .line 363
    const/16 v16, 0x0

    .line 364
    .line 365
    move-object/from16 v18, v17

    .line 366
    .line 367
    const/16 v17, 0x0

    .line 368
    .line 369
    move-object/from16 v19, v18

    .line 370
    .line 371
    const/16 v18, 0x0

    .line 372
    .line 373
    move-object/from16 v20, v19

    .line 374
    .line 375
    const/16 v19, 0x0

    .line 376
    .line 377
    move-object/from16 v21, v20

    .line 378
    .line 379
    const/16 v20, 0x0

    .line 380
    .line 381
    move-object/from16 v22, v21

    .line 382
    .line 383
    const/16 v21, 0x0

    .line 384
    .line 385
    move-object/from16 v23, v22

    .line 386
    .line 387
    const/16 v22, 0x0

    .line 388
    .line 389
    move-object/from16 v24, v23

    .line 390
    .line 391
    const/16 v23, 0x0

    .line 392
    .line 393
    move-object/from16 v25, v24

    .line 394
    .line 395
    const/16 v24, 0x0

    .line 396
    .line 397
    move-object/from16 v26, v25

    .line 398
    .line 399
    const/16 v25, 0x0

    .line 400
    .line 401
    move-object/from16 v27, v26

    .line 402
    .line 403
    const/16 v26, 0x0

    .line 404
    .line 405
    move-object/from16 v28, v27

    .line 406
    .line 407
    const/16 v27, 0x0

    .line 408
    .line 409
    move-object/from16 v29, v28

    .line 410
    .line 411
    const/16 v28, 0x0

    .line 412
    .line 413
    move-object/from16 v30, v29

    .line 414
    .line 415
    const/16 v29, 0x0

    .line 416
    .line 417
    move-object/from16 v31, v30

    .line 418
    .line 419
    const/16 v30, 0x0

    .line 420
    .line 421
    move-object/from16 v32, v31

    .line 422
    .line 423
    const/16 v31, 0x0

    .line 424
    .line 425
    move-object/from16 v33, v32

    .line 426
    .line 427
    const/16 v32, 0x0

    .line 428
    .line 429
    move-object/from16 v34, v33

    .line 430
    .line 431
    const/16 v33, 0x0

    .line 432
    .line 433
    move-object/from16 v35, v34

    .line 434
    .line 435
    const/16 v34, 0x0

    .line 436
    .line 437
    move-object/from16 v36, v35

    .line 438
    .line 439
    const/16 v35, 0x0

    .line 440
    .line 441
    move-object/from16 v37, v36

    .line 442
    .line 443
    const/16 v36, 0x0

    .line 444
    .line 445
    move-object/from16 v38, v37

    .line 446
    .line 447
    const/16 v37, 0x0

    .line 448
    .line 449
    move-object/from16 v39, v38

    .line 450
    .line 451
    const/16 v38, 0x0

    .line 452
    .line 453
    move-object/from16 v40, v39

    .line 454
    .line 455
    const/16 v39, 0x0

    .line 456
    .line 457
    move-object/from16 v41, v40

    .line 458
    .line 459
    const/16 v40, 0x0

    .line 460
    .line 461
    move-object/from16 v42, v41

    .line 462
    .line 463
    const/16 v41, 0x0

    .line 464
    .line 465
    move-object/from16 v43, v42

    .line 466
    .line 467
    const/16 v42, 0x0

    .line 468
    .line 469
    move-object/from16 v44, v43

    .line 470
    .line 471
    const/16 v43, 0x0

    .line 472
    .line 473
    move-object/from16 v47, v44

    .line 474
    .line 475
    const/16 v44, -0x2

    .line 476
    .line 477
    invoke-direct/range {v8 .. v46}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/String;IILxj0;)V

    .line 478
    .line 479
    .line 480
    const/4 v9, 0x1

    .line 481
    invoke-virtual {v8, v9}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDir(Z)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v8, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setParentId(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v47 .. v47}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    invoke-virtual {v8, v9}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v47 .. v47}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v9

    .line 498
    invoke-virtual {v8, v9}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    iget-object v9, v7, Ljo1;->e:Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {v8, v9}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v8, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    iget-object v7, v7, Ljo1;->a:Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {v8, v7}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v47 .. v47}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    invoke-virtual {v8, v7}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v47 .. v47}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v7

    .line 525
    invoke-virtual {v8, v7}, Lcom/eddyizm/tempus/subsonic/models/Child;->setYear(Ljava/lang/Integer;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    goto/16 :goto_7

    .line 532
    .line 533
    :cond_14
    new-instance v5, Lca1;

    .line 534
    .line 535
    const/16 v6, 0x18

    .line 536
    .line 537
    invoke-direct {v5, v6}, Lca1;-><init>(I)V

    .line 538
    .line 539
    .line 540
    invoke-static {v0, v5}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 545
    .line 546
    .line 547
    move-result v5

    .line 548
    :cond_15
    if-ge v4, v5, :cond_16

    .line 549
    .line 550
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v6

    .line 554
    add-int/lit8 v4, v4, 0x1

    .line 555
    .line 556
    move-object v7, v6

    .line 557
    check-cast v7, Ljo1;

    .line 558
    .line 559
    iget-object v7, v7, Ljo1;->d:Ljava/lang/String;

    .line 560
    .line 561
    invoke-static {v7, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v7

    .line 565
    if-eqz v7, :cond_15

    .line 566
    .line 567
    move-object v3, v6

    .line 568
    :cond_16
    check-cast v3, Ljo1;

    .line 569
    .line 570
    if-eqz v3, :cond_18

    .line 571
    .line 572
    iget-object v3, v3, Ljo1;->e:Ljava/lang/String;

    .line 573
    .line 574
    if-nez v3, :cond_17

    .line 575
    .line 576
    goto :goto_9

    .line 577
    :cond_17
    :goto_8
    move-object v1, v0

    .line 578
    move-object v4, v3

    .line 579
    goto :goto_a

    .line 580
    :cond_18
    :goto_9
    invoke-static {v1}, Lq40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    check-cast v1, Ljo1;

    .line 585
    .line 586
    iget-object v3, v1, Ljo1;->e:Ljava/lang/String;

    .line 587
    .line 588
    goto :goto_8

    .line 589
    :goto_a
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 590
    .line 591
    const/16 v9, 0xf4

    .line 592
    .line 593
    const/4 v10, 0x0

    .line 594
    const/4 v3, 0x0

    .line 595
    const/4 v5, 0x0

    .line 596
    const/4 v6, 0x0

    .line 597
    const/4 v7, 0x0

    .line 598
    const/4 v8, 0x0

    .line 599
    invoke-direct/range {v0 .. v10}, Lcom/eddyizm/tempus/subsonic/models/Directory;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;ILxj0;)V

    .line 600
    .line 601
    .line 602
    goto/16 :goto_5

    .line 603
    .line 604
    :goto_b
    if-nez v3, :cond_19

    .line 605
    .line 606
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 607
    .line 608
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    const v2, 0x7f1301f2

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    const/16 v9, 0xf4

    .line 620
    .line 621
    const/4 v10, 0x0

    .line 622
    sget-object v1, Lu01;->n:Lu01;

    .line 623
    .line 624
    const/4 v3, 0x0

    .line 625
    const/4 v5, 0x0

    .line 626
    const/4 v6, 0x0

    .line 627
    const/4 v7, 0x0

    .line 628
    const/4 v8, 0x0

    .line 629
    move-object/from16 v2, p0

    .line 630
    .line 631
    invoke-direct/range {v0 .. v10}, Lcom/eddyizm/tempus/subsonic/models/Directory;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;ILxj0;)V

    .line 632
    .line 633
    .line 634
    return-object v0

    .line 635
    :cond_19
    return-object v3
.end method

.method public static t()Ljava/util/List;
    .locals 3

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Lss0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Llg1;

    .line 10
    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, Llg1;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/Thread;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/List;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static final u(Lf13;Lwv3;I)Lba1;
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/high16 v3, 0x3f800000    # 1.0f

    .line 5
    .line 6
    if-ne p2, v0, :cond_0

    .line 7
    .line 8
    iget v0, p1, Lwv3;->c:F

    .line 9
    .line 10
    iget v4, p1, Lwv3;->a:F

    .line 11
    .line 12
    sub-float/2addr v0, v4

    .line 13
    add-float/2addr v0, v3

    .line 14
    invoke-virtual {p1, v0, v2}, Lwv3;->e(FF)Lwv3;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x4

    .line 20
    if-ne p2, v0, :cond_1

    .line 21
    .line 22
    iget v0, p1, Lwv3;->c:F

    .line 23
    .line 24
    iget v4, p1, Lwv3;->a:F

    .line 25
    .line 26
    sub-float/2addr v0, v4

    .line 27
    add-float/2addr v0, v3

    .line 28
    neg-float v0, v0

    .line 29
    invoke-virtual {p1, v0, v2}, Lwv3;->e(FF)Lwv3;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x5

    .line 35
    if-ne p2, v0, :cond_2

    .line 36
    .line 37
    iget v0, p1, Lwv3;->d:F

    .line 38
    .line 39
    iget v4, p1, Lwv3;->b:F

    .line 40
    .line 41
    sub-float/2addr v0, v4

    .line 42
    add-float/2addr v0, v3

    .line 43
    invoke-virtual {p1, v2, v0}, Lwv3;->e(FF)Lwv3;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v0, 0x6

    .line 49
    if-ne p2, v0, :cond_5

    .line 50
    .line 51
    iget v0, p1, Lwv3;->d:F

    .line 52
    .line 53
    iget v4, p1, Lwv3;->b:F

    .line 54
    .line 55
    sub-float/2addr v0, v4

    .line 56
    add-float/2addr v0, v3

    .line 57
    neg-float v0, v0

    .line 58
    invoke-virtual {p1, v2, v0}, Lwv3;->e(FF)Lwv3;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_0
    iget-object v2, p0, Lf13;->n:[Ljava/lang/Object;

    .line 63
    .line 64
    iget p0, p0, Lf13;->p:I

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    :goto_1
    if-ge v3, p0, :cond_4

    .line 68
    .line 69
    aget-object v4, v2, v3

    .line 70
    .line 71
    check-cast v4, Lba1;

    .line 72
    .line 73
    invoke-static {v4}, Lte5;->B(Lba1;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    invoke-static {v4}, Lte5;->r(Lba1;)Lwv3;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v5, v0, p1, p2}, Lkb4;->F(Lwv3;Lwv3;Lwv3;I)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_3

    .line 88
    .line 89
    move-object v1, v4

    .line 90
    move-object v0, v5

    .line 91
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    return-object v1

    .line 95
    :cond_5
    const-string p0, "This function should only be used for 2-D focus search"

    .line 96
    .line 97
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v1
.end method

.method public static final v(Lba1;ILif1;)Z
    .locals 4

    .line 1
    new-instance v0, Lf13;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v1, v1, [Lba1;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Lkb4;->m(Lba1;Lf13;)V

    .line 11
    .line 12
    .line 13
    iget v1, v0, Lf13;->p:I

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    if-gt v1, v2, :cond_1

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, v0, Lf13;->n:[Ljava/lang/Object;

    .line 24
    .line 25
    aget-object p0, p0, v3

    .line 26
    .line 27
    :goto_0
    check-cast p0, Lba1;

    .line 28
    .line 29
    if-eqz p0, :cond_6

    .line 30
    .line 31
    invoke-interface {p2, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_1
    const/4 v1, 0x7

    .line 43
    const/4 v2, 0x4

    .line 44
    if-ne p1, v1, :cond_2

    .line 45
    .line 46
    move p1, v2

    .line 47
    :cond_2
    if-ne p1, v2, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    const/4 v1, 0x6

    .line 51
    if-ne p1, v1, :cond_4

    .line 52
    .line 53
    :goto_1
    invoke-static {p0}, Lte5;->r(Lba1;)Lwv3;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance v1, Lwv3;

    .line 58
    .line 59
    iget v2, p0, Lwv3;->a:F

    .line 60
    .line 61
    iget p0, p0, Lwv3;->b:F

    .line 62
    .line 63
    invoke-direct {v1, v2, p0, v2, p0}, Lwv3;-><init>(FFFF)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/4 v1, 0x3

    .line 68
    if-ne p1, v1, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    const/4 v1, 0x5

    .line 72
    if-ne p1, v1, :cond_7

    .line 73
    .line 74
    :goto_2
    invoke-static {p0}, Lte5;->r(Lba1;)Lwv3;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance v1, Lwv3;

    .line 79
    .line 80
    iget v2, p0, Lwv3;->c:F

    .line 81
    .line 82
    iget p0, p0, Lwv3;->d:F

    .line 83
    .line 84
    invoke-direct {v1, v2, p0, v2, p0}, Lwv3;-><init>(FFFF)V

    .line 85
    .line 86
    .line 87
    :goto_3
    invoke-static {v0, v1, p1}, Lkb4;->u(Lf13;Lwv3;I)Lba1;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_6

    .line 92
    .line 93
    invoke-interface {p2, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0

    .line 104
    :cond_6
    return v3

    .line 105
    :cond_7
    const-string p0, "This function should only be used for 2-D focus search"

    .line 106
    .line 107
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return v3
.end method

.method public static final w(Ljava/util/concurrent/Executor;)Lpe0;
    .locals 1

    .line 1
    new-instance v0, Ly21;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ly21;-><init>(Ljava/util/concurrent/Executor;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final x(ILdd0;Lba1;Lwv3;)Z
    .locals 8

    .line 1
    invoke-static {p0, p1, p2, p3}, Lkb4;->R(ILdd0;Lba1;Lwv3;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-static {p2}, Lj51;->P(Leo0;)Lub3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lra;

    .line 14
    .line 15
    invoke-virtual {v0}, Lra;->getFocusOwner()Lu91;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ley;

    .line 20
    .line 21
    invoke-virtual {v0}, Ley;->f()Lba1;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v1, Lx50;

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    move v5, p0

    .line 29
    move-object v6, p1

    .line 30
    move-object v3, p2

    .line 31
    move-object v4, p3

    .line 32
    invoke-direct/range {v1 .. v7}, Lx50;-><init>(Lba1;Lba1;Ljava/lang/Object;ILdd0;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v5, v1}, Luc5;->U(Lba1;ILif1;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public static final y(Landroid/view/View;)Lj54;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    const/4 v0, 0x0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const v1, 0x7f0a065b

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v2, v1, Lj54;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, Lj54;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object v1, v0

    .line 22
    :goto_1
    if-eqz v1, :cond_1

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    invoke-static {p0}, Lau0;->z(Landroid/view/View;)Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of v1, p0, Landroid/view/View;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast p0, Landroid/view/View;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object p0, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    return-object v0
.end method

.method public static z(Lcom/skydoves/colorpickerview/ColorPickerView;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/Point;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    div-int/lit8 v1, v1, 0x2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    div-int/lit8 v2, v2, 0x2

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-float v0, v0

    .line 29
    const/high16 v1, 0x3f000000    # 0.5f

    .line 30
    .line 31
    mul-float/2addr v0, v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    int-to-float p0, p0

    .line 37
    mul-float/2addr p0, v1

    .line 38
    iget v1, p1, Landroid/graphics/Point;->x:I

    .line 39
    .line 40
    int-to-float v1, v1

    .line 41
    sub-float/2addr v1, v0

    .line 42
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 43
    .line 44
    int-to-float p1, p1

    .line 45
    sub-float/2addr p1, p0

    .line 46
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    mul-float v3, v1, v1

    .line 51
    .line 52
    mul-float v4, p1, p1

    .line 53
    .line 54
    add-float/2addr v4, v3

    .line 55
    float-to-double v3, v4

    .line 56
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 57
    .line 58
    .line 59
    move-result-wide v3

    .line 60
    float-to-double v5, v2

    .line 61
    cmpl-double v2, v3, v5

    .line 62
    .line 63
    if-lez v2, :cond_0

    .line 64
    .line 65
    float-to-double v1, v1

    .line 66
    div-double/2addr v5, v3

    .line 67
    mul-double/2addr v1, v5

    .line 68
    double-to-float v1, v1

    .line 69
    float-to-double v2, p1

    .line 70
    mul-double/2addr v2, v5

    .line 71
    double-to-float p1, v2

    .line 72
    :cond_0
    new-instance v2, Landroid/graphics/Point;

    .line 73
    .line 74
    add-float/2addr v1, v0

    .line 75
    float-to-int v0, v1

    .line 76
    add-float/2addr p1, p0

    .line 77
    float-to-int p0, p1

    .line 78
    invoke-direct {v2, v0, p0}, Landroid/graphics/Point;-><init>(II)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_1
    iget-boolean v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->E:Z

    .line 83
    .line 84
    if-nez v1, :cond_2

    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_2
    invoke-static {p0, p1, v0}, Lkb4;->f(Lcom/skydoves/colorpickerview/ColorPickerView;Landroid/graphics/Point;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method
