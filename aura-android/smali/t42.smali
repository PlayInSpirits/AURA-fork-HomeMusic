.class public final synthetic Lt42;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic n:Lfx3;

.field public final synthetic o:Ljava/util/LinkedHashMap;

.field public final synthetic p:Landroid/widget/ArrayAdapter;

.field public final synthetic q:Lf9;

.field public final synthetic r:Landroid/net/nsd/NsdManager;

.field public final synthetic s:Lfx3;

.field public final synthetic t:Landroid/os/Handler;

.field public final synthetic u:Lnc1;


# direct methods
.method public synthetic constructor <init>(Lfx3;Ljava/util/LinkedHashMap;Landroid/widget/ArrayAdapter;Lf9;Landroid/net/nsd/NsdManager;Lfx3;Landroid/os/Handler;Lnc1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt42;->n:Lfx3;

    .line 5
    .line 6
    iput-object p2, p0, Lt42;->o:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    iput-object p3, p0, Lt42;->p:Landroid/widget/ArrayAdapter;

    .line 9
    .line 10
    iput-object p4, p0, Lt42;->q:Lf9;

    .line 11
    .line 12
    iput-object p5, p0, Lt42;->r:Landroid/net/nsd/NsdManager;

    .line 13
    .line 14
    iput-object p6, p0, Lt42;->s:Lfx3;

    .line 15
    .line 16
    iput-object p7, p0, Lt42;->t:Landroid/os/Handler;

    .line 17
    .line 18
    iput-object p8, p0, Lt42;->u:Lnc1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    .line 1
    iget-object p1, p0, Lt42;->r:Landroid/net/nsd/NsdManager;

    .line 2
    .line 3
    iget-object v3, p0, Lt42;->s:Lfx3;

    .line 4
    .line 5
    iget-object v1, p0, Lt42;->t:Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v5, p0, Lt42;->u:Lnc1;

    .line 8
    .line 9
    iget-object v2, p0, Lt42;->n:Lfx3;

    .line 10
    .line 11
    iget-boolean p2, v2, Lfx3;->n:Z

    .line 12
    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, Lt42;->p:Landroid/widget/ArrayAdapter;

    .line 16
    .line 17
    invoke-virtual {p2, p3}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object p3, p0, Lt42;->o:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-virtual {p3, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Landroid/net/nsd/NsdServiceInfo;

    .line 28
    .line 29
    if-nez p2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p3, 0x1

    .line 33
    iput-boolean p3, v2, Lfx3;->n:Z

    .line 34
    .line 35
    const p3, 0x7f1302b0

    .line 36
    .line 37
    .line 38
    iget-object v4, p0, Lt42;->q:Lf9;

    .line 39
    .line 40
    invoke-virtual {v4, p3}, Ldg;->setTitle(I)V

    .line 41
    .line 42
    .line 43
    :try_start_0
    new-instance v0, Lu42;

    .line 44
    .line 45
    invoke-direct/range {v0 .. v5}, Lu42;-><init>(Landroid/os/Handler;Lfx3;Lfx3;Lf9;Lnc1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2, v0}, Landroid/net/nsd/NsdManager;->resolveService(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$ResolveListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, v2, Lfx3;->n:Z

    .line 56
    .line 57
    sget-object p1, Lw42;->a:Lw42;

    .line 58
    .line 59
    const-string p2, "Controller could not resolve device"

    .line 60
    .line 61
    invoke-virtual {p1, p2, p0}, Lw42;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 62
    .line 63
    .line 64
    iget-boolean p0, v3, Lfx3;->n:Z

    .line 65
    .line 66
    if-nez p0, :cond_1

    .line 67
    .line 68
    const p0, 0x7f1302b1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, p0}, Ldg;->setTitle(I)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    return-void
.end method
