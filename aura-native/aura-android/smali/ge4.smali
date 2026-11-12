.class public final Lge4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ljw4;

.field public c:Lgn2;

.field public d:Ldo2;

.field public e:Ljava/lang/Object;

.field public f:Lan2;

.field public g:J

.field public h:J

.field public i:J

.field public j:Z

.field public k:Z

.field public l:J

.field public m:J

.field public n:J

.field public o:Z

.field public p:Lyw1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lge4;->a:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object p1, Ljw4;->b:Ljw4;

    .line 7
    .line 8
    iput-object p1, p0, Lge4;->b:Ljw4;

    .line 9
    .line 10
    sget-object p1, Lgn2;->g:Lgn2;

    .line 11
    .line 12
    iput-object p1, p0, Lge4;->c:Lgn2;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lge4;->d:Ldo2;

    .line 16
    .line 17
    iput-object p1, p0, Lge4;->e:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p1, p0, Lge4;->f:Lan2;

    .line 20
    .line 21
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    iput-wide v0, p0, Lge4;->g:J

    .line 27
    .line 28
    iput-wide v0, p0, Lge4;->h:J

    .line 29
    .line 30
    iput-wide v0, p0, Lge4;->i:J

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Lge4;->j:Z

    .line 34
    .line 35
    iput-boolean p1, p0, Lge4;->k:Z

    .line 36
    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    iput-wide v2, p0, Lge4;->l:J

    .line 40
    .line 41
    iput-wide v0, p0, Lge4;->m:J

    .line 42
    .line 43
    iput-wide v2, p0, Lge4;->n:J

    .line 44
    .line 45
    iput-boolean p1, p0, Lge4;->o:Z

    .line 46
    .line 47
    sget-object p1, Lgy3;->r:Lgy3;

    .line 48
    .line 49
    iput-object p1, p0, Lge4;->p:Lyw1;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 20
    :goto_1
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lge4;->m:J

    .line 24
    .line 25
    return-void
.end method
