.class public final synthetic Lze2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:Lcf2;

.field public final synthetic o:J

.field public final synthetic p:J

.field public final synthetic q:Llg3;


# direct methods
.method public synthetic constructor <init>(Lcf2;JJLlg3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lze2;->n:Lcf2;

    .line 5
    .line 6
    iput-wide p2, p0, Lze2;->o:J

    .line 7
    .line 8
    iput-wide p4, p0, Lze2;->p:J

    .line 9
    .line 10
    iput-object p6, p0, Lze2;->q:Llg3;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lze2;->n:Lcf2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcf2;->k0()Laf2;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    iput-boolean v2, v1, Laf2;->n:Z

    .line 9
    .line 10
    invoke-virtual {v0}, Lcf2;->k0()Laf2;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-wide v2, p0, Lze2;->o:J

    .line 15
    .line 16
    iput-wide v2, v1, Laf2;->o:J

    .line 17
    .line 18
    invoke-virtual {v0}, Lcf2;->k0()Laf2;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-wide v2, p0, Lze2;->p:J

    .line 23
    .line 24
    iput-wide v2, v1, Laf2;->p:J

    .line 25
    .line 26
    iget-object p0, p0, Lze2;->q:Llg3;

    .line 27
    .line 28
    iget-object p0, p0, Llg3;->n:Lvi2;

    .line 29
    .line 30
    invoke-interface {p0}, Lvi2;->g()Lif1;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Lcf2;->k0()Laf2;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p0, v0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 44
    .line 45
    return-object p0
.end method
