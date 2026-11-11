.class public final Lmy3;
.super Lhx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final u:Lmy3;


# instance fields
.field public final transient r:Lq73;

.field public final transient s:I

.field public transient t:Lgx1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmy3;

    .line 2
    .line 3
    new-instance v1, Lq73;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-virtual {v1, v2}, Lq73;->d(I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lmy3;-><init>(Lq73;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lmy3;->u:Lmy3;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lq73;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmy3;->r:Lq73;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    iget v3, p1, Lq73;->c:I

    .line 10
    .line 11
    if-ge v2, v3, :cond_0

    .line 12
    .line 13
    invoke-static {v2, v3}, Lrr2;->q(II)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p1, Lq73;->b:[I

    .line 17
    .line 18
    aget v3, v3, v2

    .line 19
    .line 20
    int-to-long v3, v3

    .line 21
    add-long/2addr v0, v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v0, v1}, Ljz4;->I(J)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lmy3;->s:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final g()Z
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final i()Ljx1;
    .locals 2

    .line 1
    iget-object v0, p0, Lmy3;->t:Lgx1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lgx1;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Lgx1;-><init>(Lhx1;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lmy3;->t:Lgx1;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Lmy3;->s:I

    .line 2
    .line 3
    return p0
.end method
