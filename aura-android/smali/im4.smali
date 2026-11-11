.class public abstract Lim4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lbl0;

.field public b:Lwv4;

.field public c:Lm51;

.field public d:Ll83;

.field public e:J

.field public f:J

.field public g:J

.field public h:I

.field public i:I

.field public j:Lrf2;

.field public k:J

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbl0;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Lbl0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lim4;->a:Lbl0;

    .line 11
    .line 12
    new-instance v0, Lrf2;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lim4;->j:Lrf2;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lim4;->g:J

    .line 2
    .line 3
    return-void
.end method

.method public abstract b(Lbe3;)J
.end method

.method public abstract c(Lbe3;JLrf2;)Z
.end method

.method public d(Z)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lrf2;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lim4;->j:Lrf2;

    .line 11
    .line 12
    iput-wide v0, p0, Lim4;->f:J

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput p1, p0, Lim4;->h:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    iput p1, p0, Lim4;->h:I

    .line 20
    .line 21
    :goto_0
    const-wide/16 v2, -0x1

    .line 22
    .line 23
    iput-wide v2, p0, Lim4;->e:J

    .line 24
    .line 25
    iput-wide v0, p0, Lim4;->g:J

    .line 26
    .line 27
    return-void
.end method
