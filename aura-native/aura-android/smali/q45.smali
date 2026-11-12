.class public final Lq45;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final n:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "\\d+(\\.\\d+)*"

    .line 5
    .line 6
    const-string v1, "1.15.0"

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-object v1, p0, Lq45;->n:Ljava/lang/String;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "Invalid version format"

    .line 18
    .line 19
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 5

    .line 1
    check-cast p1, Lq45;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    iget-object p0, p0, Lq45;->n:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "\\."

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p1, p1, Lq45;->n:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    array-length v0, p0

    .line 21
    array-length v1, p1

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    if-ge v2, v0, :cond_5

    .line 29
    .line 30
    array-length v3, p0

    .line 31
    if-ge v2, v3, :cond_1

    .line 32
    .line 33
    aget-object v3, p0, v2

    .line 34
    .line 35
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v3, v1

    .line 41
    :goto_1
    array-length v4, p1

    .line 42
    if-ge v2, v4, :cond_2

    .line 43
    .line 44
    aget-object v4, p1, v2

    .line 45
    .line 46
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move v4, v1

    .line 52
    :goto_2
    if-ge v3, v4, :cond_3

    .line 53
    .line 54
    const/4 p0, -0x1

    .line 55
    return p0

    .line 56
    :cond_3
    if-le v3, v4, :cond_4

    .line 57
    .line 58
    :goto_3
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_5
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq45;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
