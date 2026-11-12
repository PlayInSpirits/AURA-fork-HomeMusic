.class final Ld71;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Llq0;


# direct methods
.method public constructor <init>(Llq0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld71;->a:Llq0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 1

    .line 1
    new-instance v0, Le71;

    .line 2
    .line 3
    invoke-direct {v0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ld71;->a:Llq0;

    .line 7
    .line 8
    iput-object p0, v0, Le71;->B:Llq0;

    .line 9
    .line 10
    const/high16 p0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput p0, v0, Le71;->C:F

    .line 13
    .line 14
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 0

    .line 1
    check-cast p1, Le71;

    .line 2
    .line 3
    iget-object p0, p0, Ld71;->a:Llq0;

    .line 4
    .line 5
    iput-object p0, p1, Le71;->B:Llq0;

    .line 6
    .line 7
    const/high16 p0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iput p0, p1, Le71;->C:F

    .line 10
    .line 11
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ld71;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Ld71;

    .line 11
    .line 12
    iget-object p1, p1, Ld71;->a:Llq0;

    .line 13
    .line 14
    iget-object p0, p0, Ld71;->a:Llq0;

    .line 15
    .line 16
    if-eq p0, p1, :cond_2

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object p0, p0, Ld71;->a:Llq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/2addr v0, p0

    .line 16
    return v0
.end method
