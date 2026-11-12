.class public final Llt;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lg32;


# virtual methods
.method public final a(Lh32;Ljava/lang/reflect/Type;Lsi1;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p3, Lsi1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lvx4;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p2, Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

    .line 12
    .line 13
    invoke-direct {p2}, Lcom/eddyizm/tempus/subsonic/models/Bookmarks;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lh32;->a()Lj32;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p3, "bookmark"

    .line 21
    .line 22
    iget-object p1, p1, Lj32;->n:Lnb2;

    .line 23
    .line 24
    invoke-virtual {p1, p3}, Lnb2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lh32;

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    return-object p2

    .line 33
    :cond_0
    instance-of p3, p1, Lf32;

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    new-instance p3, Lcom/eddyizm/tempus/subsonic/models/BookmarksDeserializer$deserialize$1;

    .line 38
    .line 39
    invoke-direct {p3}, Lcom/eddyizm/tempus/subsonic/models/BookmarksDeserializer$deserialize$1;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    iget-object p0, p0, Lvx4;->b:Lnk1;

    .line 47
    .line 48
    invoke-static {p3}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-virtual {p0, p1, p3}, Lnk1;->b(Lh32;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/util/List;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    instance-of p3, p1, Lj32;

    .line 60
    .line 61
    if-eqz p3, :cond_2

    .line 62
    .line 63
    iget-object p0, p0, Lvx4;->b:Lnk1;

    .line 64
    .line 65
    const-class p3, Lcom/eddyizm/tempus/subsonic/models/Bookmark;

    .line 66
    .line 67
    invoke-static {p3}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-virtual {p0, p1, p3}, Lnk1;->b(Lh32;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    const/4 p0, 0x0

    .line 81
    :goto_0
    invoke-virtual {p2, p0}, Lcom/eddyizm/tempus/subsonic/models/Bookmarks;->setBookmarks(Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    return-object p2
.end method
