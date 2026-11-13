.class public final Lcom/eddyizm/tempus/homemusic/SmartSession$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/eddyizm/tempus/homemusic/SmartSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/xj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/eddyizm/tempus/homemusic/SmartSession$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final startBody(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v0, "context"

    .line 13
    .line 14
    invoke-virtual {p0, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const/16 p1, 0x1388

    .line 18
    .line 19
    invoke-static {p2, p1}, Ldefpackage/q40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string p2, "songs"

    .line 24
    .line 25
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    if-eqz p3, :cond_1

    .line 30
    .line 31
    invoke-static {p3}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez p2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object p3, p1

    .line 39
    :goto_0
    if-eqz p3, :cond_1

    .line 40
    .line 41
    const/16 p2, 0x50

    .line 42
    .line 43
    invoke-static {p2, p3}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string p3, "current"

    .line 48
    .line 49
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_1
    if-eqz p4, :cond_3

    .line 53
    .line 54
    invoke-static {p4}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object p4, p1

    .line 62
    :goto_1
    if-eqz p4, :cond_3

    .line 63
    .line 64
    const/16 p2, 0x100

    .line 65
    .line 66
    invoke-static {p2, p4}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    const-string p3, "title"

    .line 71
    .line 72
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_3
    sget-object p2, Ldefpackage/k62;->c:Ldefpackage/ux3;

    .line 76
    .line 77
    invoke-static {p5}, Ldefpackage/gi1;->b0(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-eqz p2, :cond_4

    .line 82
    .line 83
    const-string p3, "origin"

    .line 84
    .line 85
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_4
    if-eqz p6, :cond_6

    .line 89
    .line 90
    invoke-static {p6}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-nez p2, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object p6, p1

    .line 98
    :goto_2
    if-eqz p6, :cond_6

    .line 99
    .line 100
    const/16 p1, 0x20

    .line 101
    .line 102
    invoke-static {p1, p6}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string p2, "client"

    .line 107
    .line 108
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    :cond_6
    return-object p0
.end method
