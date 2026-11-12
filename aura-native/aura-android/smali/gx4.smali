.class public final Lgx4;
.super Lfx4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Loi;

.field public final synthetic b:Lhx4;


# direct methods
.method public constructor <init>(Lhx4;Loi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgx4;->b:Lhx4;

    .line 5
    .line 6
    iput-object p2, p0, Lgx4;->a:Loi;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ldx4;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgx4;->b:Lhx4;

    .line 2
    .line 3
    iget-object v0, v0, Lhx4;->o:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iget-object v1, p0, Lgx4;->a:Loi;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ldx4;->u(Lbx4;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
