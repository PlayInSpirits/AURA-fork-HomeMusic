.class public final Lw84;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ltx;


# instance fields
.field public final n:Lkt0;

.field public final o:J

.field public final p:I

.field public q:J

.field public r:I


# direct methods
.method public constructor <init>(Lkt0;JIJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw84;->n:Lkt0;

    .line 5
    .line 6
    iput-wide p2, p0, Lw84;->o:J

    .line 7
    .line 8
    iput p4, p0, Lw84;->p:I

    .line 9
    .line 10
    iput-wide p5, p0, Lw84;->q:J

    .line 11
    .line 12
    iput p7, p0, Lw84;->r:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 5

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    iget-wide v2, p0, Lw84;->o:J

    .line 4
    .line 5
    cmp-long v0, v2, v0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long v0, v2, v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-wide v0, p0, Lw84;->q:J

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, Lf35;->U(JJ)F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    iget v0, p0, Lw84;->p:I

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget p0, p0, Lw84;->r:I

    .line 27
    .line 28
    int-to-long v1, p0

    .line 29
    int-to-long v3, v0

    .line 30
    invoke-static {v1, v2, v3, v4}, Lf35;->U(JJ)F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_1
    const/high16 p0, -0x40800000    # -1.0f

    .line 36
    .line 37
    return p0
.end method

.method public final b(JJJ)V
    .locals 6

    .line 1
    iget-wide p1, p0, Lw84;->q:J

    .line 2
    .line 3
    add-long v3, p1, p5

    .line 4
    .line 5
    iput-wide v3, p0, Lw84;->q:J

    .line 6
    .line 7
    iget-wide v1, p0, Lw84;->o:J

    .line 8
    .line 9
    invoke-virtual {p0}, Lw84;->a()F

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    iget-object v0, p0, Lw84;->n:Lkt0;

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v5}, Lkt0;->b(JJF)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
