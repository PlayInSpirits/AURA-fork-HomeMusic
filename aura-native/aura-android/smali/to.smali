.class final Lto;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:F

.field public final c:Lsp1;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 1
    sget-object v0, Lkb4;->b:Lsp1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Lto;->a:J

    .line 7
    .line 8
    const/high16 p1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    iput p1, p0, Lto;->b:F

    .line 11
    .line 12
    iput-object v0, p0, Lto;->c:Lsp1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 3

    .line 1
    new-instance v0, Lvo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lto;->a:J

    .line 7
    .line 8
    iput-wide v1, v0, Lvo;->B:J

    .line 9
    .line 10
    iget-object p0, p0, Lto;->c:Lsp1;

    .line 11
    .line 12
    iput-object p0, v0, Lvo;->C:Lsp1;

    .line 13
    .line 14
    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v1, v0, Lvo;->D:J

    .line 20
    .line 21
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 2

    .line 1
    check-cast p1, Lvo;

    .line 2
    .line 3
    iget-wide v0, p0, Lto;->a:J

    .line 4
    .line 5
    iput-wide v0, p1, Lvo;->B:J

    .line 6
    .line 7
    iget-object v0, p1, Lvo;->C:Lsp1;

    .line 8
    .line 9
    iget-object p0, p0, Lto;->c:Lsp1;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iput-object p0, p1, Lvo;->C:Lsp1;

    .line 18
    .line 19
    invoke-static {p1}, Lfu;->C(Lg94;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {p1}, Ljz4;->z(Lrv0;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lto;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lto;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    iget-wide v0, p0, Lto;->a:J

    .line 13
    .line 14
    iget-wide v2, p1, Lto;->a:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Lx40;->c(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget v0, p0, Lto;->b:F

    .line 23
    .line 24
    iget v1, p1, Lto;->b:F

    .line 25
    .line 26
    cmpg-float v0, v0, v1

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iget-object p0, p0, Lto;->c:Lsp1;

    .line 31
    .line 32
    iget-object p1, p1, Lto;->c:Lsp1;

    .line 33
    .line 34
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    sget v0, Lx40;->h:I

    .line 2
    .line 3
    iget-wide v0, p0, Lto;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit16 v0, v0, 0x3c1

    .line 10
    .line 11
    iget v1, p0, Lto;->b:F

    .line 12
    .line 13
    const/16 v2, 0x1f

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lb11;->d(IFI)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object p0, p0, Lto;->c:Lsp1;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    add-int/2addr p0, v0

    .line 26
    return p0
.end method
