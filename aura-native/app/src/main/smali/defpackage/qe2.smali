.class public final synthetic Ldefpackage/qe2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic n:[Ljava/lang/String;

.field public final synthetic o:Ldefpackage/re2;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;Ldefpackage/re2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/qe2;->n:[Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/qe2;->o:Ldefpackage/re2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Ldefpackage/qe2;->n:[Ljava/lang/String;

    .line 2
    .line 3
    aget-object p1, p1, p3

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Ldefpackage/jz4;->d(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const-string p3, "theme"

    .line 27
    .line 28
    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/qe2;->o:Ldefpackage/re2;

    .line 36
    .line 37
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast p1, Ldefpackage/df;

    .line 45
    .line 46
    invoke-static {p1}, Ldefpackage/jz4;->r(Ldefpackage/df;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
.end method
