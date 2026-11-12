.class public abstract Ltz3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final Companion:Lsz3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsz3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltz3;->Companion:Lsz3;

    .line 7
    .line 8
    return-void
.end method

.method public static final create(Lge3;Lb71;Lhu2;)Ltz3;
    .locals 1

    .line 1
    sget-object v0, Ltz3;->Companion:Lsz3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lrd0;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, p2}, Lrd0;-><init>(Lge3;Lb71;Lhu2;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final create(Lhu2;Ljava/io/File;)Ltz3;
    .locals 2
    .annotation runtime Lzo0;
    .end annotation

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lqz3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lqz3;-><init>(Lhu2;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static final create(Lhu2;Ljava/lang/String;)Ltz3;
    .locals 1
    .annotation runtime Lzo0;
    .end annotation

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-static {p1, p0}, Lsz3;->b(Ljava/lang/String;Lhu2;)Lwe5;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lhu2;Lyw;)Ltz3;
    .locals 2
    .annotation runtime Lzo0;
    .end annotation

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    new-instance v0, Lqz3;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lqz3;-><init>(Lhu2;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static final create(Lhu2;[B)Ltz3;
    .locals 2
    .annotation runtime Lzo0;
    .end annotation

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 23
    array-length v1, p1

    .line 24
    invoke-static {p0, p1, v0, v1}, Lsz3;->a(Lhu2;[BII)Lwe5;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lhu2;[BI)Ltz3;
    .locals 1
    .annotation runtime Lzo0;
    .end annotation

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    array-length v0, p1

    .line 27
    invoke-static {p0, p1, p2, v0}, Lsz3;->a(Lhu2;[BII)Lwe5;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lhu2;[BII)Ltz3;
    .locals 1
    .annotation runtime Lzo0;
    .end annotation

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-static {p0, p1, p2, p3}, Lsz3;->a(Lhu2;[BII)Lwe5;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/io/File;Lhu2;)Ltz3;
    .locals 2

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    new-instance v0, Lqz3;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lqz3;-><init>(Lhu2;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static final create(Ljava/io/FileDescriptor;Lhu2;)Ltz3;
    .locals 2

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    new-instance v0, Lqz3;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p0, v1}, Lqz3;-><init>(Lhu2;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static final create(Ljava/lang/String;Lhu2;)Ltz3;
    .locals 1

    .line 32
    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Lsz3;->b(Ljava/lang/String;Lhu2;)Lwe5;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lyw;Lhu2;)Ltz3;
    .locals 2

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    new-instance v0, Lqz3;

    const/4 v1, 0x2

    invoke-direct {v0, p1, p0, v1}, Lqz3;-><init>(Lhu2;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static final create([B)Ltz3;
    .locals 4

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lsz3;->c(Lsz3;[BLhu2;II)Lwe5;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLhu2;)Ltz3;
    .locals 3

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {v0, p0, p1, v1, v2}, Lsz3;->c(Lsz3;[BLhu2;II)Lwe5;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLhu2;I)Ltz3;
    .locals 2

    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x4

    invoke-static {v0, p0, p1, p2, v1}, Lsz3;->c(Lsz3;[BLhu2;II)Lwe5;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLhu2;II)Ltz3;
    .locals 1

    .line 36
    sget-object v0, Ltz3;->Companion:Lsz3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p0, p2, p3}, Lsz3;->a(Lhu2;[BII)Lwe5;

    move-result-object p0

    return-object p0
.end method

.method public static final gzip(Ltz3;)Ltz3;
    .locals 1

    .line 1
    sget-object v0, Ltz3;->Companion:Lsz3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lrz3;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lrz3;-><init>(Ltz3;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
.end method

.method public abstract contentType()Lhu2;
.end method

.method public isDuplex()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isOneShot()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract writeTo(Lew;)V
.end method
