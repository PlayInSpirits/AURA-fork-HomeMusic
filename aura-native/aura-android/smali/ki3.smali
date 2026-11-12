.class public final Lki3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lii3;

.field public final c:Landroid/util/SparseArray;

.field public final d:Z

.field public final e:Ltn0;

.field public final f:Lvp4;

.field public final g:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final h:J

.field public final i:Lf55;

.field public j:Ltu;

.field public k:Lyp4;

.field public l:Landroid/util/Pair;

.field public m:I

.field public n:I

.field public o:J

.field public p:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lfi3;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lfi3;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object v0, p0, Lki3;->a:Landroid/content/Context;

    .line 7
    .line 8
    new-instance v0, Ltu;

    .line 9
    .line 10
    invoke-direct {v0}, Ltu;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lki3;->j:Ltu;

    .line 14
    .line 15
    iget-object v0, p1, Lfi3;->c:Lii3;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lki3;->b:Lii3;

    .line 21
    .line 22
    new-instance v0, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lki3;->c:Landroid/util/SparseArray;

    .line 28
    .line 29
    sget-object v0, Lyw1;->o:Lvw1;

    .line 30
    .line 31
    sget-object v0, Lgy3;->r:Lgy3;

    .line 32
    .line 33
    iget-boolean v0, p1, Lfi3;->d:Z

    .line 34
    .line 35
    iput-boolean v0, p0, Lki3;->d:Z

    .line 36
    .line 37
    iget-object v0, p1, Lfi3;->e:Lvp4;

    .line 38
    .line 39
    iput-object v0, p0, Lki3;->f:Lvp4;

    .line 40
    .line 41
    iget-wide v1, p1, Lfi3;->g:J

    .line 42
    .line 43
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    cmp-long v5, v1, v3

    .line 49
    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    neg-long v1, v1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-wide v1, v3

    .line 55
    :goto_0
    iput-wide v1, p0, Lki3;->h:J

    .line 56
    .line 57
    iget-object v1, p1, Lfi3;->h:Lf55;

    .line 58
    .line 59
    iput-object v1, p0, Lki3;->i:Lf55;

    .line 60
    .line 61
    new-instance v2, Ltn0;

    .line 62
    .line 63
    iget-object p1, p1, Lfi3;->b:Le55;

    .line 64
    .line 65
    invoke-direct {v2, p1, v1, v0}, Ltn0;-><init>(Le55;Lf55;Lvp4;)V

    .line 66
    .line 67
    .line 68
    iput-object v2, p0, Lki3;->e:Ltn0;

    .line 69
    .line 70
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lki3;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 76
    .line 77
    new-instance p1, Lsb1;

    .line 78
    .line 79
    invoke-direct {p1}, Lsb1;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v0, Ltb1;

    .line 83
    .line 84
    invoke-direct {v0, p1}, Ltb1;-><init>(Lsb1;)V

    .line 85
    .line 86
    .line 87
    iput-wide v3, p0, Lki3;->o:J

    .line 88
    .line 89
    const/4 p1, -0x1

    .line 90
    iput p1, p0, Lki3;->p:I

    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    iput p1, p0, Lki3;->n:I

    .line 94
    .line 95
    return-void
.end method
