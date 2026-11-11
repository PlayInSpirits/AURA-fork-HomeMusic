.class public final Lhu2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lhu2;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lhu2;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lhu2;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p4, p0, Lhu2;->d:[Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method public static a(Lhu2;)Ljava/nio/charset/Charset;
    .locals 6

    .line 1
    iget-object p0, p0, Lhu2;->d:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v2, v0, v1}, Lq05;->n(III)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-ltz v0, :cond_1

    .line 14
    .line 15
    :goto_0
    aget-object v3, p0, v2

    .line 16
    .line 17
    const-string v4, "charset"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-static {v3, v4, v5}, Lxm4;->f0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    add-int/2addr v2, v5

    .line 27
    aget-object p0, p0, v2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    if-eq v2, v0, :cond_1

    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object p0, v1

    .line 36
    :goto_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_2
    :try_start_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    return-object p0

    .line 44
    :catch_0
    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lhu2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lhu2;

    .line 6
    .line 7
    iget-object p1, p1, Lhu2;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lhu2;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lhu2;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lhu2;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
