.class public final Lje4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:J

.field public final c:Lz5;

.field public final d:Z


# direct methods
.method public constructor <init>(Lie4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lie4;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, Lje4;->a:Ljava/lang/Object;

    .line 7
    .line 8
    iget-wide v0, p1, Lie4;->b:J

    .line 9
    .line 10
    iput-wide v0, p0, Lje4;->b:J

    .line 11
    .line 12
    iget-object v0, p1, Lie4;->c:Lz5;

    .line 13
    .line 14
    iput-object v0, p0, Lje4;->c:Lz5;

    .line 15
    .line 16
    iget-boolean p1, p1, Lie4;->d:Z

    .line 17
    .line 18
    iput-boolean p1, p0, Lje4;->d:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, Lje4;

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
    check-cast p1, Lje4;

    .line 12
    .line 13
    iget-object v1, p0, Lje4;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v3, p1, Lje4;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-wide v3, p0, Lje4;->b:J

    .line 24
    .line 25
    iget-wide v5, p1, Lje4;->b:J

    .line 26
    .line 27
    cmp-long v1, v3, v5

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Lje4;->c:Lz5;

    .line 32
    .line 33
    iget-object v3, p1, Lje4;->c:Lz5;

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Lz5;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-boolean p0, p0, Lje4;->d:Z

    .line 42
    .line 43
    iget-boolean p1, p1, Lje4;->d:Z

    .line 44
    .line 45
    if-ne p0, p1, :cond_2

    .line 46
    .line 47
    return v0

    .line 48
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lje4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0xd9

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    iget-wide v2, p0, Lje4;->b:J

    .line 14
    .line 15
    ushr-long v4, v2, v1

    .line 16
    .line 17
    xor-long v1, v2, v4

    .line 18
    .line 19
    long-to-int v1, v1

    .line 20
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v1, p0, Lje4;->c:Lz5;

    .line 24
    .line 25
    invoke-virtual {v1}, Lz5;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/2addr v1, v0

    .line 30
    mul-int/lit8 v1, v1, 0x1f

    .line 31
    .line 32
    iget-boolean p0, p0, Lje4;->d:Z

    .line 33
    .line 34
    add-int/2addr v1, p0

    .line 35
    return v1
.end method
