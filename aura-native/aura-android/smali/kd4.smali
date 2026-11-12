.class public final Lkd4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:[F

.field public final b:[I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:I

.field public r:I

.field public s:J

.field public t:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [F

    .line 6
    .line 7
    iput-object v1, p0, Lkd4;->a:[F

    .line 8
    .line 9
    new-array v0, v0, [I

    .line 10
    .line 11
    iput-object v0, p0, Lkd4;->b:[I

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lkd4;->c:I

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    iput v1, p0, Lkd4;->d:I

    .line 23
    .line 24
    const v2, 0x4cffffff    # 1.3421772E8f

    .line 25
    .line 26
    .line 27
    iput v2, p0, Lkd4;->e:I

    .line 28
    .line 29
    iput v0, p0, Lkd4;->f:I

    .line 30
    .line 31
    iput v0, p0, Lkd4;->g:I

    .line 32
    .line 33
    iput v0, p0, Lkd4;->h:I

    .line 34
    .line 35
    const/high16 v0, 0x3f800000    # 1.0f

    .line 36
    .line 37
    iput v0, p0, Lkd4;->i:F

    .line 38
    .line 39
    iput v0, p0, Lkd4;->j:F

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput v0, p0, Lkd4;->k:F

    .line 43
    .line 44
    const/high16 v0, 0x3f000000    # 0.5f

    .line 45
    .line 46
    iput v0, p0, Lkd4;->l:F

    .line 47
    .line 48
    const/high16 v0, 0x41a00000    # 20.0f

    .line 49
    .line 50
    iput v0, p0, Lkd4;->m:F

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    iput-boolean v0, p0, Lkd4;->n:Z

    .line 54
    .line 55
    iput-boolean v0, p0, Lkd4;->o:Z

    .line 56
    .line 57
    iput-boolean v0, p0, Lkd4;->p:Z

    .line 58
    .line 59
    iput v1, p0, Lkd4;->q:I

    .line 60
    .line 61
    iput v0, p0, Lkd4;->r:I

    .line 62
    .line 63
    const-wide/16 v0, 0x3e8

    .line 64
    .line 65
    iput-wide v0, p0, Lkd4;->s:J

    .line 66
    .line 67
    return-void
.end method
