.class public final Ly84;
.super Lw34;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lx84;

.field public final v:Llx;

.field public final w:Lw84;

.field public final x:[B

.field public final y:Lux;


# direct methods
.method public constructor <init>(Lx84;Llx;Lw84;[B)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lw34;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly84;->u:Lx84;

    .line 5
    .line 6
    iput-object p2, p0, Ly84;->v:Llx;

    .line 7
    .line 8
    iput-object p3, p0, Ly84;->w:Lw84;

    .line 9
    .line 10
    iput-object p4, p0, Ly84;->x:[B

    .line 11
    .line 12
    new-instance v0, Lux;

    .line 13
    .line 14
    iget-object p1, p1, Lx84;->o:Lii0;

    .line 15
    .line 16
    invoke-direct {v0, p2, p1, p4, p3}, Lux;-><init>(Llx;Lii0;[BLtx;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ly84;->y:Lux;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-object p0, p0, Ly84;->y:Lux;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lux;->j:Z

    .line 5
    .line 6
    return-void
.end method

.method public final c()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ly84;->y:Lux;

    .line 2
    .line 3
    invoke-virtual {v0}, Lux;->a()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly84;->w:Lw84;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lw84;->r:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iput v0, p0, Lw84;->r:I

    .line 15
    .line 16
    iget-object v1, p0, Lw84;->n:Lkt0;

    .line 17
    .line 18
    iget-wide v2, p0, Lw84;->o:J

    .line 19
    .line 20
    iget-wide v4, p0, Lw84;->q:J

    .line 21
    .line 22
    invoke-virtual {p0}, Lw84;->a()F

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-virtual/range {v1 .. v6}, Lkt0;->b(JJF)V

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method
