.class public final Lpy1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwd;


# instance fields
.field public final a:Lyy4;

.field public final b:Lhz3;


# direct methods
.method public constructor <init>(Lyy4;Lhz3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpy1;->a:Lyy4;

    .line 5
    .line 6
    iput-object p2, p0, Lpy1;->b:Lhz3;

    .line 7
    .line 8
    iget p0, p1, Lyy4;->a:I

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Animation to be infinitely repeated cannot have a 0-duration"

    .line 14
    .line 15
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method


# virtual methods
.method public final a()Lg45;
    .locals 5

    .line 1
    new-instance v0, Lru;

    .line 2
    .line 3
    new-instance v1, Lx7;

    .line 4
    .line 5
    iget-object v2, p0, Lpy1;->a:Lyy4;

    .line 6
    .line 7
    iget v3, v2, Lyy4;->a:I

    .line 8
    .line 9
    iget-object v2, v2, Lyy4;->b:Lry0;

    .line 10
    .line 11
    invoke-direct {v1, v3, v2}, Lx7;-><init>(ILry0;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lru;->p:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object p0, p0, Lpy1;->b:Lhz3;

    .line 20
    .line 21
    iput-object p0, v0, Lru;->q:Ljava/lang/Object;

    .line 22
    .line 23
    iget p0, v1, Lx7;->o:I

    .line 24
    .line 25
    int-to-long v1, p0

    .line 26
    const-wide/32 v3, 0xf4240

    .line 27
    .line 28
    .line 29
    mul-long/2addr v1, v3

    .line 30
    iput-wide v1, v0, Lru;->n:J

    .line 31
    .line 32
    const-wide/16 v1, 0x0

    .line 33
    .line 34
    iput-wide v1, v0, Lru;->o:J

    .line 35
    .line 36
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lpy1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lpy1;

    .line 6
    .line 7
    iget-object v0, p1, Lpy1;->a:Lyy4;

    .line 8
    .line 9
    iget-object v1, p0, Lpy1;->a:Lyy4;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lyy4;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lpy1;->b:Lhz3;

    .line 18
    .line 19
    iget-object p0, p0, Lpy1;->b:Lhz3;

    .line 20
    .line 21
    if-ne p1, p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lpy1;->a:Lyy4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyy4;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lpy1;->b:Lhz3;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    mul-int/lit8 p0, p0, 0x1f

    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, p0

    .line 25
    return v0
.end method
