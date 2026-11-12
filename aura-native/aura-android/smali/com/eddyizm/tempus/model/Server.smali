.class public final Lcom/eddyizm/tempus/model/Server;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/eddyizm/tempus/model/Server;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final address:Ljava/lang/String;

.field private final clientCert:Ljava/lang/String;

.field private final isLowSecurity:Z

.field private final localAddress:Ljava/lang/String;

.field private final password:Ljava/lang/String;

.field private final serverId:Ljava/lang/String;

.field private final serverName:Ljava/lang/String;

.field private final timestamp:J

.field private final username:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj84;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lj84;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/eddyizm/tempus/model/Server;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/eddyizm/tempus/model/Server;->serverId:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/eddyizm/tempus/model/Server;->serverName:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/eddyizm/tempus/model/Server;->username:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/eddyizm/tempus/model/Server;->password:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p5, p0, Lcom/eddyizm/tempus/model/Server;->address:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p6, p0, Lcom/eddyizm/tempus/model/Server;->localAddress:Ljava/lang/String;

    .line 30
    .line 31
    iput-wide p7, p0, Lcom/eddyizm/tempus/model/Server;->timestamp:J

    .line 32
    .line 33
    iput-boolean p9, p0, Lcom/eddyizm/tempus/model/Server;->isLowSecurity:Z

    .line 34
    .line 35
    iput-object p10, p0, Lcom/eddyizm/tempus/model/Server;->clientCert:Ljava/lang/String;

    .line 36
    .line 37
    return-void
.end method

.method public static synthetic copy$default(Lcom/eddyizm/tempus/model/Server;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILjava/lang/Object;)Lcom/eddyizm/tempus/model/Server;
    .locals 0

    .line 1
    and-int/lit8 p12, p11, 0x1

    .line 2
    .line 3
    if-eqz p12, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/eddyizm/tempus/model/Server;->serverId:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p12, p11, 0x2

    .line 8
    .line 9
    if-eqz p12, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/eddyizm/tempus/model/Server;->serverName:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p12, p11, 0x4

    .line 14
    .line 15
    if-eqz p12, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lcom/eddyizm/tempus/model/Server;->username:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p12, p11, 0x8

    .line 20
    .line 21
    if-eqz p12, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lcom/eddyizm/tempus/model/Server;->password:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p12, p11, 0x10

    .line 26
    .line 27
    if-eqz p12, :cond_4

    .line 28
    .line 29
    iget-object p5, p0, Lcom/eddyizm/tempus/model/Server;->address:Ljava/lang/String;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p12, p11, 0x20

    .line 32
    .line 33
    if-eqz p12, :cond_5

    .line 34
    .line 35
    iget-object p6, p0, Lcom/eddyizm/tempus/model/Server;->localAddress:Ljava/lang/String;

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p12, p11, 0x40

    .line 38
    .line 39
    if-eqz p12, :cond_6

    .line 40
    .line 41
    iget-wide p7, p0, Lcom/eddyizm/tempus/model/Server;->timestamp:J

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p12, p11, 0x80

    .line 44
    .line 45
    if-eqz p12, :cond_7

    .line 46
    .line 47
    iget-boolean p9, p0, Lcom/eddyizm/tempus/model/Server;->isLowSecurity:Z

    .line 48
    .line 49
    :cond_7
    and-int/lit16 p11, p11, 0x100

    .line 50
    .line 51
    if-eqz p11, :cond_8

    .line 52
    .line 53
    iget-object p10, p0, Lcom/eddyizm/tempus/model/Server;->clientCert:Ljava/lang/String;

    .line 54
    .line 55
    :cond_8
    move p11, p9

    .line 56
    move-object p12, p10

    .line 57
    move-wide p9, p7

    .line 58
    move-object p7, p5

    .line 59
    move-object p8, p6

    .line 60
    move-object p5, p3

    .line 61
    move-object p6, p4

    .line 62
    move-object p3, p1

    .line 63
    move-object p4, p2

    .line 64
    move-object p2, p0

    .line 65
    invoke-virtual/range {p2 .. p12}, Lcom/eddyizm/tempus/model/Server;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)Lcom/eddyizm/tempus/model/Server;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->serverId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->serverName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->password:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->address:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component6()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->localAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component7()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/eddyizm/tempus/model/Server;->timestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component8()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/model/Server;->isLowSecurity:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component9()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->clientCert:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)Lcom/eddyizm/tempus/model/Server;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p0, Lcom/eddyizm/tempus/model/Server;

    .line 17
    .line 18
    invoke-direct/range {p0 .. p10}, Lcom/eddyizm/tempus/model/Server;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/eddyizm/tempus/model/Server;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/eddyizm/tempus/model/Server;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/eddyizm/tempus/model/Server;->serverId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/eddyizm/tempus/model/Server;->serverId:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/eddyizm/tempus/model/Server;->serverName:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/eddyizm/tempus/model/Server;->serverName:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/eddyizm/tempus/model/Server;->username:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/eddyizm/tempus/model/Server;->username:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/eddyizm/tempus/model/Server;->password:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/eddyizm/tempus/model/Server;->password:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lcom/eddyizm/tempus/model/Server;->address:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/eddyizm/tempus/model/Server;->address:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lcom/eddyizm/tempus/model/Server;->localAddress:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/eddyizm/tempus/model/Server;->localAddress:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-wide v3, p0, Lcom/eddyizm/tempus/model/Server;->timestamp:J

    .line 80
    .line 81
    iget-wide v5, p1, Lcom/eddyizm/tempus/model/Server;->timestamp:J

    .line 82
    .line 83
    cmp-long v1, v3, v5

    .line 84
    .line 85
    if-eqz v1, :cond_8

    .line 86
    .line 87
    return v2

    .line 88
    :cond_8
    iget-boolean v1, p0, Lcom/eddyizm/tempus/model/Server;->isLowSecurity:Z

    .line 89
    .line 90
    iget-boolean v3, p1, Lcom/eddyizm/tempus/model/Server;->isLowSecurity:Z

    .line 91
    .line 92
    if-eq v1, v3, :cond_9

    .line 93
    .line 94
    return v2

    .line 95
    :cond_9
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->clientCert:Ljava/lang/String;

    .line 96
    .line 97
    iget-object p1, p1, Lcom/eddyizm/tempus/model/Server;->clientCert:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-nez p0, :cond_a

    .line 104
    .line 105
    return v2

    .line 106
    :cond_a
    return v0
.end method

.method public final getAddress()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->address:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getClientCert()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->clientCert:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLocalAddress()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->localAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPassword()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->password:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getServerId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->serverId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getServerName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->serverName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/eddyizm/tempus/model/Server;->timestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/model/Server;->serverId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/eddyizm/tempus/model/Server;->serverName:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/eddyizm/tempus/model/Server;->username:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/eddyizm/tempus/model/Server;->password:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/eddyizm/tempus/model/Server;->address:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/eddyizm/tempus/model/Server;->localAddress:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    move v2, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    :goto_0
    add-int/2addr v0, v2

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget-wide v4, p0, Lcom/eddyizm/tempus/model/Server;->timestamp:J

    .line 48
    .line 49
    invoke-static {v0, v1, v4, v5}, Lxa3;->b(IIJ)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-boolean v2, p0, Lcom/eddyizm/tempus/model/Server;->isLowSecurity:Z

    .line 54
    .line 55
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->clientCert:Ljava/lang/String;

    .line 60
    .line 61
    if-nez p0, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    :goto_1
    add-int/2addr v0, v3

    .line 69
    return v0
.end method

.method public final isLowSecurity()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/model/Server;->isLowSecurity:Z

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/model/Server;->serverId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/eddyizm/tempus/model/Server;->serverName:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/eddyizm/tempus/model/Server;->username:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/eddyizm/tempus/model/Server;->password:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/eddyizm/tempus/model/Server;->address:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/eddyizm/tempus/model/Server;->localAddress:Ljava/lang/String;

    .line 12
    .line 13
    iget-wide v6, p0, Lcom/eddyizm/tempus/model/Server;->timestamp:J

    .line 14
    .line 15
    iget-boolean v8, p0, Lcom/eddyizm/tempus/model/Server;->isLowSecurity:Z

    .line 16
    .line 17
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->clientCert:Ljava/lang/String;

    .line 18
    .line 19
    const-string v9, ", serverName="

    .line 20
    .line 21
    const-string v10, ", username="

    .line 22
    .line 23
    const-string v11, "Server(serverId="

    .line 24
    .line 25
    invoke-static {v11, v0, v9, v1, v10}, Lb11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, ", password="

    .line 30
    .line 31
    const-string v9, ", address="

    .line 32
    .line 33
    invoke-static {v0, v2, v1, v3, v9}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v1, ", localAddress="

    .line 37
    .line 38
    const-string v2, ", timestamp="

    .line 39
    .line 40
    invoke-static {v0, v4, v1, v5, v2}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", isLowSecurity="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", clientCert="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, ")"

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/eddyizm/tempus/model/Server;->serverId:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/eddyizm/tempus/model/Server;->serverName:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lcom/eddyizm/tempus/model/Server;->username:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, Lcom/eddyizm/tempus/model/Server;->password:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lcom/eddyizm/tempus/model/Server;->address:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lcom/eddyizm/tempus/model/Server;->localAddress:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-wide v0, p0, Lcom/eddyizm/tempus/model/Server;->timestamp:J

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 37
    .line 38
    .line 39
    iget-boolean p2, p0, Lcom/eddyizm/tempus/model/Server;->isLowSecurity:Z

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lcom/eddyizm/tempus/model/Server;->clientCert:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
