.class public abstract Ldefpackage/gb;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:[Ljava/lang/reflect/Type;

.field public static final b:Ldefpackage/ro0;

.field public static final c:Ldefpackage/rd2;

.field public static final d:Ldefpackage/jb2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 3
    .line 4
    sput-object v0, Ldefpackage/gb;->a:[Ljava/lang/reflect/Type;

    .line 5
    .line 6
    new-instance v0, Ldefpackage/ro0;

    .line 7
    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    invoke-direct {v0, v1, v1}, Ldefpackage/ro0;-><init>(FF)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ldefpackage/gb;->b:Ldefpackage/ro0;

    .line 14
    .line 15
    new-instance v0, Ldefpackage/rd2;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, v1}, Ldefpackage/rd2;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ldefpackage/gb;->c:Ldefpackage/rd2;

    .line 22
    .line 23
    new-instance v0, Ldefpackage/jb2;

    .line 24
    .line 25
    const/16 v1, 0x8

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ldefpackage/jb2;-><init>(I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Ldefpackage/gb;->d:Ldefpackage/jb2;

    .line 31
    .line 32
    return-void
.end method

.method public static A(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    if-ne p2, p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    array-length v0, p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_3

    .line 17
    .line 18
    aget-object v2, p0, v1

    .line 19
    .line 20
    if-ne v2, p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    aget-object p0, p0, v1

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-virtual {p2, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    aget-object p1, p1, v1

    .line 40
    .line 41
    aget-object p0, p0, v1

    .line 42
    .line 43
    invoke-static {p1, p0, p2}, Ldefpackage/gb;->A(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_6

    .line 56
    .line 57
    :goto_1
    const-class p0, Ljava/lang/Object;

    .line 58
    .line 59
    if-eq p1, p0, :cond_6

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, p2, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_4
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1, p0, p2}, Ldefpackage/gb;->A(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_5
    move-object p1, p0

    .line 88
    goto :goto_1

    .line 89
    :cond_6
    return-object p2
.end method

.method public static final B(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/ya4;->g(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "0x"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static C(Ljava/util/Collection;)Ldefpackage/j02;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/j02;

    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v1, 0x1

    .line 11
    sub-int/2addr p0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v2, p0, v1}, Ldefpackage/h02;-><init>(III)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final D(Ldefpackage/ne0;)Ldefpackage/s22;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/fz0;->h0:Ldefpackage/fz0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/s22;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const-string v0, "Current context doesn\'t contain Job in it: "

    .line 13
    .line 14
    invoke-static {p0, v0}, Ldefpackage/mj0;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static E(Ljava/util/List;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    add-int/lit8 p0, p0, -0x1

    .line 9
    .line 10
    return p0
.end method

.method public static F(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/ImageButton;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const/4 v2, 0x0

    .line 10
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    instance-of v4, v3, Landroid/widget/ImageButton;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    check-cast v3, Landroid/widget/ImageButton;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    if-ne v4, v0, :cond_1

    .line 31
    .line 32
    return-object v3

    .line 33
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return-object v1
.end method

.method public static G(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v0, p0, Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v0}, Ldefpackage/vr1;->d(Z)V

    .line 21
    .line 22
    .line 23
    check-cast p0, Ljava/lang/Class;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Ldefpackage/gb;->G(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    const-class p0, Ljava/lang/Object;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    aget-object p0, p0, v1

    .line 68
    .line 69
    invoke-static {p0}, Ldefpackage/gb;->G(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_4
    if-nez p0, :cond_5

    .line 75
    .line 76
    const-string v0, "null"

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :goto_0
    const-string v1, "Expected a Class, ParameterizedType, or GenericArrayType, but <"

    .line 88
    .line 89
    const-string v2, "> is of type "

    .line 90
    .line 91
    invoke-static {v1, p0, v2, v0}, Ldefpackage/tb4;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    return-object p0
.end method

.method public static H(Lcom/google/android/material/appbar/MaterialToolbar;Ljava/lang/CharSequence;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    instance-of v3, v2, Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    check-cast v2, Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-object v0
.end method

.method public static final J(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "POST"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "PATCH"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, "PUT"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, "DELETE"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const-string v0, "MOVE"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p0, 0x0

    .line 46
    return p0

    .line 47
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 48
    return p0
.end method

.method public static final K(Ldefpackage/s22;ZLdefpackage/u22;)Ldefpackage/as0;
    .locals 9

    .line 1
    instance-of v0, p0, Ldefpackage/a32;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ldefpackage/a32;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ldefpackage/a32;->O(ZLdefpackage/u22;)Ldefpackage/as0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p2}, Ldefpackage/u22;->r()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-instance v1, Ldefpackage/q;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x7

    .line 20
    const/4 v2, 0x1

    .line 21
    const-class v4, Ldefpackage/u22;

    .line 22
    .line 23
    const-string v5, "invoke"

    .line 24
    .line 25
    const-string v6, "invoke(Ljava/lang/Throwable;)V"

    .line 26
    .line 27
    move-object v3, p2

    .line 28
    invoke-direct/range {v1 .. v8}, Ldefpackage/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v0, p1, v1}, Ldefpackage/s22;->T(ZZLdefpackage/q;)Ldefpackage/as0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static final L(Ldefpackage/ne0;)Z
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/fz0;->h0:Ldefpackage/fz0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/s22;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ldefpackage/s22;->b()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static M(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    instance-of v0, p0, Ljava/lang/NoSuchMethodError;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "Landroid/media/NotProvisionedException;.<init>("

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static N(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    instance-of v0, p0, Ljava/lang/NoSuchMethodError;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "Landroid/media/ResourceBusyException;.<init>("

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static O(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public static varargs P([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    if-lez v0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 13
    .line 14
    return-object p0
.end method

.method public static varargs Q([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v1, Ldefpackage/hi;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, Ldefpackage/hi;-><init>([Ljava/lang/Object;Z)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final R(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 22
    .line 23
    return-object p0
.end method

.method public static S(Ldefpackage/qn4;ILdefpackage/wc0;)V
    .locals 6

    .line 1
    invoke-interface {p0, p1}, Ldefpackage/qn4;->k(I)J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    invoke-interface {p0, v1, v2}, Ldefpackage/qn4;->m(J)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {p0}, Ldefpackage/qn4;->n()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    if-eq p1, v0, :cond_2

    .line 23
    .line 24
    add-int/lit8 v0, p1, 0x1

    .line 25
    .line 26
    invoke-interface {p0, v0}, Ldefpackage/qn4;->k(I)J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-interface {p0, p1}, Ldefpackage/qn4;->k(I)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    sub-long/2addr v3, p0

    .line 35
    const-wide/16 p0, 0x0

    .line 36
    .line 37
    cmp-long p0, v3, p0

    .line 38
    .line 39
    if-lez p0, :cond_1

    .line 40
    .line 41
    new-instance v0, Ldefpackage/lg0;

    .line 42
    .line 43
    invoke-direct/range {v0 .. v5}, Ldefpackage/lg0;-><init>(JJLjava/util/List;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p2, v0}, Ldefpackage/wc0;->accept(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void

    .line 50
    :cond_2
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static final T(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "GET"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "HEAD"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static final U([F[F)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2, v2, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-static {v2, v4, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    const/4 v6, 0x2

    .line 16
    invoke-static {v2, v6, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/4 v8, 0x3

    .line 21
    invoke-static {v2, v8, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    invoke-static {v4, v2, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    invoke-static {v4, v4, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    invoke-static {v4, v6, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 34
    .line 35
    .line 36
    move-result v12

    .line 37
    invoke-static {v4, v8, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 38
    .line 39
    .line 40
    move-result v13

    .line 41
    invoke-static {v6, v2, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 42
    .line 43
    .line 44
    move-result v14

    .line 45
    invoke-static {v6, v4, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 46
    .line 47
    .line 48
    move-result v15

    .line 49
    invoke-static {v6, v6, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 50
    .line 51
    .line 52
    move-result v16

    .line 53
    invoke-static {v6, v8, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 54
    .line 55
    .line 56
    move-result v17

    .line 57
    invoke-static {v8, v2, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 58
    .line 59
    .line 60
    move-result v18

    .line 61
    invoke-static {v8, v4, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 62
    .line 63
    .line 64
    move-result v19

    .line 65
    invoke-static {v8, v6, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 66
    .line 67
    .line 68
    move-result v20

    .line 69
    invoke-static {v8, v8, v1, v0}, Ldefpackage/gb;->t(II[F[F)F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    aput v3, v0, v2

    .line 74
    .line 75
    aput v5, v0, v4

    .line 76
    .line 77
    aput v7, v0, v6

    .line 78
    .line 79
    aput v9, v0, v8

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    aput v10, v0, v2

    .line 83
    .line 84
    const/4 v2, 0x5

    .line 85
    aput v11, v0, v2

    .line 86
    .line 87
    const/4 v2, 0x6

    .line 88
    aput v12, v0, v2

    .line 89
    .line 90
    const/4 v2, 0x7

    .line 91
    aput v13, v0, v2

    .line 92
    .line 93
    const/16 v2, 0x8

    .line 94
    .line 95
    aput v14, v0, v2

    .line 96
    .line 97
    const/16 v2, 0x9

    .line 98
    .line 99
    aput v15, v0, v2

    .line 100
    .line 101
    const/16 v2, 0xa

    .line 102
    .line 103
    aput v16, v0, v2

    .line 104
    .line 105
    const/16 v2, 0xb

    .line 106
    .line 107
    aput v17, v0, v2

    .line 108
    .line 109
    const/16 v2, 0xc

    .line 110
    .line 111
    aput v18, v0, v2

    .line 112
    .line 113
    const/16 v2, 0xd

    .line 114
    .line 115
    aput v19, v0, v2

    .line 116
    .line 117
    const/16 v2, 0xe

    .line 118
    .line 119
    aput v20, v0, v2

    .line 120
    .line 121
    const/16 v2, 0xf

    .line 122
    .line 123
    aput v1, v0, v2

    .line 124
    .line 125
    return-void
.end method

.method public static final V(Ldefpackage/xu3;)Ldefpackage/ne5;
    .locals 31

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-virtual {v5}, Ldefpackage/xu3;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x2014b50

    .line 8
    .line 9
    .line 10
    if-ne v0, v1, :cond_7

    .line 11
    .line 12
    const-wide/16 v0, 0x4

    .line 13
    .line 14
    invoke-virtual {v5, v0, v1}, Ldefpackage/xu3;->skip(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v5}, Ldefpackage/xu3;->n()S

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v1, 0xffff

    .line 22
    .line 23
    .line 24
    and-int v2, v0, v1

    .line 25
    .line 26
    and-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    if-nez v0, :cond_6

    .line 30
    .line 31
    invoke-virtual {v5}, Ldefpackage/xu3;->n()S

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    and-int v22, v0, v1

    .line 36
    .line 37
    invoke-virtual {v5}, Ldefpackage/xu3;->n()S

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    and-int v26, v0, v1

    .line 42
    .line 43
    invoke-virtual {v5}, Ldefpackage/xu3;->n()S

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    and-int v25, v0, v1

    .line 48
    .line 49
    invoke-virtual {v5}, Ldefpackage/xu3;->f()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    int-to-long v2, v0

    .line 54
    const-wide v6, 0xffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long v16, v2, v6

    .line 60
    .line 61
    move-wide v2, v6

    .line 62
    new-instance v6, Ldefpackage/ix3;

    .line 63
    .line 64
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Ldefpackage/xu3;->f()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    int-to-long v7, v0

    .line 72
    and-long/2addr v7, v2

    .line 73
    iput-wide v7, v6, Ldefpackage/ix3;->n:J

    .line 74
    .line 75
    new-instance v4, Ldefpackage/ix3;

    .line 76
    .line 77
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ldefpackage/xu3;->f()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    int-to-long v7, v0

    .line 85
    and-long/2addr v7, v2

    .line 86
    iput-wide v7, v4, Ldefpackage/ix3;->n:J

    .line 87
    .line 88
    invoke-virtual {v5}, Ldefpackage/xu3;->n()S

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    and-int/2addr v0, v1

    .line 93
    invoke-virtual {v5}, Ldefpackage/xu3;->n()S

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    and-int v12, v7, v1

    .line 98
    .line 99
    invoke-virtual {v5}, Ldefpackage/xu3;->n()S

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    and-int v13, v7, v1

    .line 104
    .line 105
    const-wide/16 v7, 0x8

    .line 106
    .line 107
    invoke-virtual {v5, v7, v8}, Ldefpackage/xu3;->skip(J)V

    .line 108
    .line 109
    .line 110
    move-wide v8, v7

    .line 111
    new-instance v7, Ldefpackage/ix3;

    .line 112
    .line 113
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Ldefpackage/xu3;->f()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    int-to-long v14, v1

    .line 121
    and-long/2addr v14, v2

    .line 122
    iput-wide v14, v7, Ldefpackage/ix3;->n:J

    .line 123
    .line 124
    int-to-long v0, v0

    .line 125
    invoke-virtual {v5, v0, v1}, Ldefpackage/xu3;->q(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    const/4 v15, 0x0

    .line 130
    invoke-static {v14, v15}, Ldefpackage/qm4;->n0(Ljava/lang/CharSequence;C)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    iget-wide v0, v4, Ldefpackage/ix3;->n:J

    .line 137
    .line 138
    cmp-long v0, v0, v2

    .line 139
    .line 140
    const-wide/16 v18, 0x0

    .line 141
    .line 142
    if-nez v0, :cond_0

    .line 143
    .line 144
    move-wide v0, v8

    .line 145
    :goto_0
    move-wide/from16 v20, v2

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_0
    move-wide/from16 v0, v18

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :goto_1
    iget-wide v2, v6, Ldefpackage/ix3;->n:J

    .line 152
    .line 153
    cmp-long v2, v2, v20

    .line 154
    .line 155
    if-nez v2, :cond_1

    .line 156
    .line 157
    add-long/2addr v0, v8

    .line 158
    :cond_1
    iget-wide v2, v7, Ldefpackage/ix3;->n:J

    .line 159
    .line 160
    cmp-long v2, v2, v20

    .line 161
    .line 162
    if-nez v2, :cond_2

    .line 163
    .line 164
    add-long/2addr v0, v8

    .line 165
    :cond_2
    move-wide v2, v0

    .line 166
    new-instance v8, Ldefpackage/jx3;

    .line 167
    .line 168
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 169
    .line 170
    .line 171
    new-instance v9, Ldefpackage/jx3;

    .line 172
    .line 173
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 174
    .line 175
    .line 176
    new-instance v10, Ldefpackage/jx3;

    .line 177
    .line 178
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v1, Ldefpackage/fx3;

    .line 182
    .line 183
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    new-instance v0, Ldefpackage/qe5;

    .line 187
    .line 188
    invoke-direct/range {v0 .. v10}, Ldefpackage/qe5;-><init>(Ldefpackage/fx3;JLdefpackage/ix3;Ldefpackage/xu3;Ldefpackage/ix3;Ldefpackage/ix3;Ldefpackage/jx3;Ldefpackage/jx3;Ldefpackage/jx3;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v5, v12, v0}, Ldefpackage/gb;->W(Ldefpackage/xu3;ILdefpackage/wf1;)V

    .line 192
    .line 193
    .line 194
    cmp-long v0, v2, v18

    .line 195
    .line 196
    if-lez v0, :cond_4

    .line 197
    .line 198
    iget-boolean v0, v1, Ldefpackage/fx3;->n:Z

    .line 199
    .line 200
    if-eqz v0, :cond_3

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_3
    const-string v0, "bad zip: zip64 extra required but absent"

    .line 204
    .line 205
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return-object v11

    .line 209
    :cond_4
    :goto_2
    int-to-long v0, v13

    .line 210
    invoke-virtual {v5, v0, v1}, Ldefpackage/xu3;->q(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sget-object v1, Ldefpackage/ge3;->o:Ljava/lang/String;

    .line 215
    .line 216
    const-string v1, "/"

    .line 217
    .line 218
    invoke-static {v1}, Ldefpackage/tv1;->z(Ljava/lang/String;)Ldefpackage/ge3;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {v2, v14}, Ldefpackage/ge3;->d(Ljava/lang/String;)Ldefpackage/ge3;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    invoke-static {v14, v1, v15}, Ldefpackage/xm4;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    new-instance v12, Ldefpackage/ne5;

    .line 231
    .line 232
    iget-wide v1, v6, Ldefpackage/ix3;->n:J

    .line 233
    .line 234
    iget-wide v3, v4, Ldefpackage/ix3;->n:J

    .line 235
    .line 236
    iget-wide v5, v7, Ldefpackage/ix3;->n:J

    .line 237
    .line 238
    iget-object v7, v8, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 239
    .line 240
    move-object/from16 v27, v7

    .line 241
    .line 242
    check-cast v27, Ljava/lang/Long;

    .line 243
    .line 244
    iget-object v7, v9, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 245
    .line 246
    move-object/from16 v28, v7

    .line 247
    .line 248
    check-cast v28, Ljava/lang/Long;

    .line 249
    .line 250
    iget-object v7, v10, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 251
    .line 252
    move-object/from16 v29, v7

    .line 253
    .line 254
    check-cast v29, Ljava/lang/Long;

    .line 255
    .line 256
    const v30, 0xe000

    .line 257
    .line 258
    .line 259
    move-object v15, v0

    .line 260
    move-wide/from16 v18, v1

    .line 261
    .line 262
    move-wide/from16 v20, v3

    .line 263
    .line 264
    move-wide/from16 v23, v5

    .line 265
    .line 266
    invoke-direct/range {v12 .. v30}, Ldefpackage/ne5;-><init>(Ldefpackage/ge3;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 267
    .line 268
    .line 269
    return-object v12

    .line 270
    :cond_5
    const-string v0, "bad zip: filename contains 0x00"

    .line 271
    .line 272
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-object v11

    .line 276
    :cond_6
    invoke-static {v2}, Ldefpackage/gb;->B(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    const-string v1, "unsupported zip: general purpose bit flag="

    .line 281
    .line 282
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-object v11

    .line 290
    :cond_7
    new-instance v2, Ljava/io/IOException;

    .line 291
    .line 292
    invoke-static {v1}, Ldefpackage/gb;->B(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-static {v0}, Ldefpackage/gb;->B(I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    new-instance v3, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    const-string v4, "bad zip: expected "

    .line 303
    .line 304
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v1, " but was "

    .line 311
    .line 312
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw v2
.end method

.method public static final W(Ldefpackage/xu3;ILdefpackage/wf1;)V
    .locals 11

    .line 1
    iget-object v0, p0, Ldefpackage/xu3;->o:Ldefpackage/tv;

    .line 2
    .line 3
    int-to-long v1, p1

    .line 4
    :goto_0
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    cmp-long p1, v1, v3

    .line 7
    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    const-wide/16 v5, 0x4

    .line 11
    .line 12
    cmp-long p1, v1, v5

    .line 13
    .line 14
    if-ltz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/xu3;->n()S

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const v7, 0xffff

    .line 21
    .line 22
    .line 23
    and-int/2addr p1, v7

    .line 24
    invoke-virtual {p0}, Ldefpackage/xu3;->n()S

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    int-to-long v7, v7

    .line 29
    const-wide/32 v9, 0xffff

    .line 30
    .line 31
    .line 32
    and-long/2addr v7, v9

    .line 33
    sub-long/2addr v1, v5

    .line 34
    cmp-long v5, v1, v7

    .line 35
    .line 36
    if-ltz v5, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v7, v8}, Ldefpackage/xu3;->P(J)V

    .line 39
    .line 40
    .line 41
    iget-wide v5, v0, Ldefpackage/tv;->o:J

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    invoke-interface {p2, v9, v10}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    iget-wide v9, v0, Ldefpackage/tv;->o:J

    .line 55
    .line 56
    add-long/2addr v9, v7

    .line 57
    sub-long/2addr v9, v5

    .line 58
    cmp-long v3, v9, v3

    .line 59
    .line 60
    if-ltz v3, :cond_1

    .line 61
    .line 62
    if-lez v3, :cond_0

    .line 63
    .line 64
    invoke-virtual {v0, v9, v10}, Ldefpackage/tv;->skip(J)V

    .line 65
    .line 66
    .line 67
    :cond_0
    sub-long/2addr v1, v7

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const-string p0, "unsupported zip: too many bytes processed for "

    .line 70
    .line 71
    invoke-static {p1, p0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    const-string p0, "bad zip: truncated value in extra field"

    .line 80
    .line 81
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    const-string p0, "bad zip: truncated header in extra field"

    .line 86
    .line 87
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void
.end method

.method public static final X(Ldefpackage/xu3;Ldefpackage/ne5;)Ldefpackage/ne5;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/xu3;->f()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const v3, 0x4034b50

    .line 10
    .line 11
    .line 12
    if-ne v2, v3, :cond_2

    .line 13
    .line 14
    const-wide/16 v2, 0x2

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3}, Ldefpackage/xu3;->skip(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ldefpackage/xu3;->n()S

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const v3, 0xffff

    .line 24
    .line 25
    .line 26
    and-int v4, v2, v3

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    const-wide/16 v6, 0x12

    .line 34
    .line 35
    invoke-virtual {v0, v6, v7}, Ldefpackage/xu3;->skip(J)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ldefpackage/xu3;->n()S

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-long v6, v2

    .line 43
    const-wide/32 v8, 0xffff

    .line 44
    .line 45
    .line 46
    and-long/2addr v6, v8

    .line 47
    invoke-virtual {v0}, Ldefpackage/xu3;->n()S

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    and-int/2addr v2, v3

    .line 52
    invoke-virtual {v0, v6, v7}, Ldefpackage/xu3;->skip(J)V

    .line 53
    .line 54
    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    int-to-long v1, v2

    .line 58
    invoke-virtual {v0, v1, v2}, Ldefpackage/xu3;->skip(J)V

    .line 59
    .line 60
    .line 61
    return-object v5

    .line 62
    :cond_0
    new-instance v3, Ldefpackage/jx3;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v4, Ldefpackage/jx3;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v5, Ldefpackage/jx3;

    .line 73
    .line 74
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v6, Ldefpackage/pe5;

    .line 78
    .line 79
    invoke-direct {v6, v0, v3, v4, v5}, Ldefpackage/pe5;-><init>(Ldefpackage/xu3;Ldefpackage/jx3;Ldefpackage/jx3;Ldefpackage/jx3;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v2, v6}, Ldefpackage/gb;->W(Ldefpackage/xu3;ILdefpackage/wf1;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, v3, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 86
    .line 87
    move-object/from16 v24, v0

    .line 88
    .line 89
    check-cast v24, Ljava/lang/Integer;

    .line 90
    .line 91
    iget-object v0, v4, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 92
    .line 93
    move-object/from16 v25, v0

    .line 94
    .line 95
    check-cast v25, Ljava/lang/Integer;

    .line 96
    .line 97
    iget-object v0, v5, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 98
    .line 99
    move-object/from16 v26, v0

    .line 100
    .line 101
    check-cast v26, Ljava/lang/Integer;

    .line 102
    .line 103
    new-instance v6, Ldefpackage/ne5;

    .line 104
    .line 105
    iget-object v7, v1, Ldefpackage/ne5;->a:Ldefpackage/ge3;

    .line 106
    .line 107
    iget-boolean v8, v1, Ldefpackage/ne5;->b:Z

    .line 108
    .line 109
    iget-object v9, v1, Ldefpackage/ne5;->c:Ljava/lang/String;

    .line 110
    .line 111
    iget-wide v10, v1, Ldefpackage/ne5;->d:J

    .line 112
    .line 113
    iget-wide v12, v1, Ldefpackage/ne5;->e:J

    .line 114
    .line 115
    iget-wide v14, v1, Ldefpackage/ne5;->f:J

    .line 116
    .line 117
    iget v0, v1, Ldefpackage/ne5;->g:I

    .line 118
    .line 119
    iget-wide v2, v1, Ldefpackage/ne5;->h:J

    .line 120
    .line 121
    iget v4, v1, Ldefpackage/ne5;->i:I

    .line 122
    .line 123
    iget v5, v1, Ldefpackage/ne5;->j:I

    .line 124
    .line 125
    move/from16 v16, v0

    .line 126
    .line 127
    iget-object v0, v1, Ldefpackage/ne5;->k:Ljava/lang/Long;

    .line 128
    .line 129
    move-object/from16 v21, v0

    .line 130
    .line 131
    iget-object v0, v1, Ldefpackage/ne5;->l:Ljava/lang/Long;

    .line 132
    .line 133
    iget-object v1, v1, Ldefpackage/ne5;->m:Ljava/lang/Long;

    .line 134
    .line 135
    move-object/from16 v22, v0

    .line 136
    .line 137
    move-object/from16 v23, v1

    .line 138
    .line 139
    move-wide/from16 v17, v2

    .line 140
    .line 141
    move/from16 v19, v4

    .line 142
    .line 143
    move/from16 v20, v5

    .line 144
    .line 145
    invoke-direct/range {v6 .. v26}, Ldefpackage/ne5;-><init>(Ldefpackage/ge3;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 146
    .line 147
    .line 148
    return-object v6

    .line 149
    :cond_1
    invoke-static {v4}, Ldefpackage/gb;->B(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v1, "unsupported zip: general purpose bit flag="

    .line 154
    .line 155
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object v5

    .line 163
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 164
    .line 165
    invoke-static {v3}, Ldefpackage/gb;->B(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v2}, Ldefpackage/gb;->B(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    new-instance v3, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v4, "bad zip: expected "

    .line 176
    .line 177
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, " but was "

    .line 184
    .line 185
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
.end method

.method public static Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :cond_0
    instance-of v2, p2, Ljava/lang/reflect/TypeVariable;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v2, :cond_9

    .line 7
    .line 8
    move-object v2, p2

    .line 9
    check-cast v2, Ljava/lang/reflect/TypeVariable;

    .line 10
    .line 11
    invoke-virtual {p3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ljava/lang/reflect/Type;

    .line 16
    .line 17
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    if-ne v4, v5, :cond_1

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_1
    return-object v4

    .line 25
    :cond_2
    invoke-virtual {p3, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    move-object v1, v2

    .line 31
    :cond_3
    invoke-interface {v2}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    instance-of v4, p2, Ljava/lang/Class;

    .line 36
    .line 37
    if-eqz v4, :cond_4

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Class;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    move-object p2, v0

    .line 43
    :goto_0
    if-nez p2, :cond_5

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_5
    invoke-static {p0, p1, p2}, Ldefpackage/gb;->A(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    instance-of v5, v4, Ljava/lang/reflect/ParameterizedType;

    .line 51
    .line 52
    if-eqz v5, :cond_8

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    array-length v5, p2

    .line 59
    :goto_1
    if-ge v3, v5, :cond_7

    .line 60
    .line 61
    aget-object v6, p2, v3

    .line 62
    .line 63
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_6

    .line 68
    .line 69
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 70
    .line 71
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    aget-object p2, p2, v3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_7
    invoke-static {}, Ldefpackage/tb4;->k()V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_8
    :goto_2
    move-object p2, v2

    .line 86
    :goto_3
    if-ne p2, v2, :cond_0

    .line 87
    .line 88
    goto/16 :goto_8

    .line 89
    .line 90
    :cond_9
    instance-of v0, p2, Ljava/lang/Class;

    .line 91
    .line 92
    if-eqz v0, :cond_b

    .line 93
    .line 94
    move-object v0, p2

    .line 95
    check-cast v0, Ljava/lang/Class;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_b

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-static {p0, p1, p2, p3}, Ldefpackage/gb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p2, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_a

    .line 116
    .line 117
    move-object p2, v0

    .line 118
    goto/16 :goto_8

    .line 119
    .line 120
    :cond_a
    new-instance p1, Ldefpackage/a;

    .line 121
    .line 122
    invoke-direct {p1, v3, p0}, Ldefpackage/a;-><init>(ILjava/lang/reflect/Type;)V

    .line 123
    .line 124
    .line 125
    :goto_4
    move-object p2, p1

    .line 126
    goto/16 :goto_8

    .line 127
    .line 128
    :cond_b
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    .line 129
    .line 130
    if-eqz v0, :cond_d

    .line 131
    .line 132
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    .line 133
    .line 134
    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {p0, p1, v0, p3}, Ldefpackage/gb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {v0, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_c

    .line 147
    .line 148
    goto/16 :goto_8

    .line 149
    .line 150
    :cond_c
    new-instance p1, Ldefpackage/a;

    .line 151
    .line 152
    invoke-direct {p1, v3, p0}, Ldefpackage/a;-><init>(ILjava/lang/reflect/Type;)V

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_d
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 157
    .line 158
    const/4 v2, 0x1

    .line 159
    if-eqz v0, :cond_11

    .line 160
    .line 161
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 162
    .line 163
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {p0, p1, v0, p3}, Ldefpackage/gb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-static {v4, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    xor-int/2addr v0, v2

    .line 176
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    array-length v6, v5

    .line 181
    :goto_5
    if-ge v3, v6, :cond_10

    .line 182
    .line 183
    aget-object v7, v5, v3

    .line 184
    .line 185
    invoke-static {p0, p1, v7, p3}, Ldefpackage/gb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    aget-object v8, v5, v3

    .line 190
    .line 191
    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-nez v8, :cond_f

    .line 196
    .line 197
    if-nez v0, :cond_e

    .line 198
    .line 199
    invoke-virtual {v5}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    move-object v5, v0

    .line 204
    check-cast v5, [Ljava/lang/reflect/Type;

    .line 205
    .line 206
    move v0, v2

    .line 207
    :cond_e
    aput-object v7, v5, v3

    .line 208
    .line 209
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_10
    if-eqz v0, :cond_15

    .line 213
    .line 214
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    new-instance p1, Ldefpackage/b;

    .line 219
    .line 220
    invoke-direct {p1, v4, p0, v5}, Ldefpackage/b;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_11
    instance-of v0, p2, Ljava/lang/reflect/WildcardType;

    .line 225
    .line 226
    if-eqz v0, :cond_15

    .line 227
    .line 228
    check-cast p2, Ljava/lang/reflect/WildcardType;

    .line 229
    .line 230
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    array-length v5, v0

    .line 239
    if-ne v5, v2, :cond_13

    .line 240
    .line 241
    aget-object v4, v0, v3

    .line 242
    .line 243
    invoke-static {p0, p1, v4, p3}, Ldefpackage/gb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    aget-object p1, v0, v3

    .line 248
    .line 249
    if-eq p0, p1, :cond_15

    .line 250
    .line 251
    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    .line 252
    .line 253
    if-eqz p1, :cond_12

    .line 254
    .line 255
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 256
    .line 257
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    goto :goto_6

    .line 262
    :cond_12
    new-array p1, v2, [Ljava/lang/reflect/Type;

    .line 263
    .line 264
    aput-object p0, p1, v3

    .line 265
    .line 266
    move-object p0, p1

    .line 267
    :goto_6
    new-instance p2, Ldefpackage/c;

    .line 268
    .line 269
    new-array p1, v2, [Ljava/lang/reflect/Type;

    .line 270
    .line 271
    const-class v0, Ljava/lang/Object;

    .line 272
    .line 273
    aput-object v0, p1, v3

    .line 274
    .line 275
    invoke-direct {p2, p1, p0, v3}, Ldefpackage/c;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;I)V

    .line 276
    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_13
    array-length v0, v4

    .line 280
    if-ne v0, v2, :cond_15

    .line 281
    .line 282
    aget-object v0, v4, v3

    .line 283
    .line 284
    invoke-static {p0, p1, v0, p3}, Ldefpackage/gb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    aget-object p1, v4, v3

    .line 289
    .line 290
    if-eq p0, p1, :cond_15

    .line 291
    .line 292
    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    .line 293
    .line 294
    if-eqz p1, :cond_14

    .line 295
    .line 296
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 297
    .line 298
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    goto :goto_7

    .line 303
    :cond_14
    new-array p1, v2, [Ljava/lang/reflect/Type;

    .line 304
    .line 305
    aput-object p0, p1, v3

    .line 306
    .line 307
    move-object p0, p1

    .line 308
    :goto_7
    new-instance p2, Ldefpackage/c;

    .line 309
    .line 310
    sget-object p1, Ldefpackage/gb;->a:[Ljava/lang/reflect/Type;

    .line 311
    .line 312
    invoke-direct {p2, p0, p1, v3}, Ldefpackage/c;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;I)V

    .line 313
    .line 314
    .line 315
    :cond_15
    :goto_8
    if-eqz v1, :cond_16

    .line 316
    .line 317
    invoke-virtual {p3, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    :cond_16
    return-object p2
.end method

.method public static final Z(Ldefpackage/gu4;Ldefpackage/wf1;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/e64;->s:Ldefpackage/vd0;

    .line 2
    .line 3
    invoke-interface {v0}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ldefpackage/au0;->t(Ldefpackage/ne0;)Ldefpackage/ao0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, Ldefpackage/gu4;->t:J

    .line 12
    .line 13
    iget-object v3, p0, Ldefpackage/c0;->r:Ldefpackage/ne0;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, p0, v3}, Ldefpackage/ao0;->F(JLdefpackage/gu4;Ldefpackage/ne0;)Ldefpackage/as0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ldefpackage/es0;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Ldefpackage/es0;-><init>(Ldefpackage/as0;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-static {p0, v0, v1}, Ldefpackage/gb;->K(Ldefpackage/s22;ZLdefpackage/u22;)Ldefpackage/as0;

    .line 26
    .line 27
    .line 28
    :try_start_0
    instance-of v0, p1, Ldefpackage/jp;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-static {p1, p0, p0}, Ldefpackage/ya4;->Q(Ldefpackage/wf1;Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x2

    .line 40
    invoke-static {v0, p1}, Ldefpackage/jz4;->j(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, p0, p0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    goto :goto_1

    .line 48
    :goto_0
    new-instance v0, Ldefpackage/a70;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v0, p1, v1}, Ldefpackage/a70;-><init>(Ljava/lang/Throwable;Z)V

    .line 52
    .line 53
    .line 54
    move-object p1, v0

    .line 55
    :goto_1
    sget-object v0, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 56
    .line 57
    if-ne p1, v0, :cond_1

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_1
    invoke-virtual {p0, p1}, Ldefpackage/a32;->S(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v2, Ldefpackage/zz1;->e:Ldefpackage/f01;

    .line 65
    .line 66
    if-ne v1, v2, :cond_2

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    instance-of v0, v1, Ldefpackage/a70;

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    check-cast v1, Ldefpackage/a70;

    .line 74
    .line 75
    iget-object v0, v1, Ldefpackage/a70;->a:Ljava/lang/Throwable;

    .line 76
    .line 77
    instance-of v1, v0, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    move-object v1, v0

    .line 82
    check-cast v1, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 83
    .line 84
    iget-object v1, v1, Lkotlinx/coroutines/TimeoutCancellationException;->n:Ldefpackage/s22;

    .line 85
    .line 86
    if-ne v1, p0, :cond_4

    .line 87
    .line 88
    instance-of p0, p1, Ldefpackage/a70;

    .line 89
    .line 90
    if-nez p0, :cond_3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    check-cast p1, Ldefpackage/a70;

    .line 94
    .line 95
    iget-object p0, p1, Ldefpackage/a70;->a:Ljava/lang/Throwable;

    .line 96
    .line 97
    throw p0

    .line 98
    :cond_4
    throw v0

    .line 99
    :cond_5
    invoke-static {v1}, Ldefpackage/zz1;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_2
    move-object v0, p1

    .line 104
    :goto_3
    return-object v0
.end method

.method public static a()Ldefpackage/t22;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/t22;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/t22;-><init>(Ldefpackage/s22;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static a0(Ljava/util/ArrayList;Ldefpackage/ku3;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-static {p0}, Ldefpackage/q40;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    :goto_0
    if-lez v1, :cond_0

    .line 15
    .line 16
    add-int/lit8 v2, v1, 0x1

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Ldefpackage/ku3;->a(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v1, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0, v2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    add-int/lit8 v1, v1, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-object p0
.end method

.method public static final b([FFF[F)V
    .locals 0

    .line 1
    invoke-static {p3}, Ldefpackage/ya4;->G([F)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3, p1, p2}, Ldefpackage/ya4;->N([FFF)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p3}, Ldefpackage/gb;->U([F[F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static b0(Ldefpackage/j02;I)Ldefpackage/h02;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget v0, p0, Ldefpackage/h02;->n:I

    .line 16
    .line 17
    iget v1, p0, Ldefpackage/h02;->o:I

    .line 18
    .line 19
    iget p0, p0, Ldefpackage/h02;->p:I

    .line 20
    .line 21
    if-lez p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    neg-int p1, p1

    .line 25
    :goto_1
    new-instance p0, Ldefpackage/h02;

    .line 26
    .line 27
    invoke-direct {p0, v0, v1, p1}, Ldefpackage/h02;-><init>(III)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v0, "Step must be positive, was: "

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v0, 0x2e

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0
.end method

.method public static final c(Ldefpackage/v3;Ldefpackage/i94;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ldefpackage/xl;->b(Ldefpackage/i94;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object p1, p1, Ldefpackage/i94;->d:Ldefpackage/e94;

    .line 8
    .line 9
    sget-object v0, Ldefpackage/d94;->i:Ldefpackage/p94;

    .line 10
    .line 11
    iget-object p1, p1, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    :cond_0
    check-cast p1, Ldefpackage/w2;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    new-instance v0, Ldefpackage/o3;

    .line 25
    .line 26
    const v1, 0x102003d

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, Ldefpackage/w2;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v0, v1, p1}, Ldefpackage/o3;-><init>(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ldefpackage/v3;->b(Ldefpackage/o3;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public static c0()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 2
    .line 3
    const-string v1, "Index overflow has happened."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public static varargs d([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v1, Ldefpackage/hi;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, Ldefpackage/hi;-><init>([Ljava/lang/Object;Z)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static d0(Ldefpackage/qn4;Ldefpackage/yn4;Ldefpackage/wc0;)V
    .locals 12

    .line 1
    iget-wide v0, p1, Ldefpackage/yn4;->b:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    move v4, v5

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p0, v0, v1}, Ldefpackage/qn4;->e(J)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v6, -0x1

    .line 20
    if-ne v4, v6, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ldefpackage/qn4;->n()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    :cond_1
    if-lez v4, :cond_2

    .line 27
    .line 28
    add-int/lit8 v6, v4, -0x1

    .line 29
    .line 30
    invoke-interface {p0, v6}, Ldefpackage/qn4;->k(I)J

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    cmp-long v6, v6, v0

    .line 35
    .line 36
    if-nez v6, :cond_2

    .line 37
    .line 38
    add-int/lit8 v4, v4, -0x1

    .line 39
    .line 40
    :cond_2
    :goto_0
    cmp-long v2, v0, v2

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-interface {p0}, Ldefpackage/qn4;->n()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-ge v4, v2, :cond_3

    .line 49
    .line 50
    invoke-interface {p0, v0, v1}, Ldefpackage/qn4;->m(J)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    invoke-interface {p0, v4}, Ldefpackage/qn4;->k(I)J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-nez v6, :cond_3

    .line 63
    .line 64
    iget-wide v7, p1, Ldefpackage/yn4;->b:J

    .line 65
    .line 66
    cmp-long v6, v7, v2

    .line 67
    .line 68
    if-gez v6, :cond_3

    .line 69
    .line 70
    new-instance v6, Ldefpackage/lg0;

    .line 71
    .line 72
    sub-long v9, v2, v7

    .line 73
    .line 74
    invoke-direct/range {v6 .. v11}, Ldefpackage/lg0;-><init>(JJLjava/util/List;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p2, v6}, Ldefpackage/wc0;->accept(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move v2, v5

    .line 83
    :goto_1
    move v3, v4

    .line 84
    :goto_2
    invoke-interface {p0}, Ldefpackage/qn4;->n()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-ge v3, v6, :cond_4

    .line 89
    .line 90
    invoke-static {p0, v3, p2}, Ldefpackage/gb;->S(Ldefpackage/qn4;ILdefpackage/wc0;)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    iget-boolean p1, p1, Ldefpackage/yn4;->a:Z

    .line 97
    .line 98
    if-eqz p1, :cond_7

    .line 99
    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    add-int/lit8 v4, v4, -0x1

    .line 103
    .line 104
    :cond_5
    :goto_3
    if-ge v5, v4, :cond_6

    .line 105
    .line 106
    invoke-static {p0, v5, p2}, Ldefpackage/gb;->S(Ldefpackage/qn4;ILdefpackage/wc0;)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v5, v5, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    if-eqz v2, :cond_7

    .line 113
    .line 114
    new-instance v6, Ldefpackage/lg0;

    .line 115
    .line 116
    invoke-interface {p0, v0, v1}, Ldefpackage/qn4;->m(J)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    invoke-interface {p0, v4}, Ldefpackage/qn4;->k(I)J

    .line 121
    .line 122
    .line 123
    move-result-wide v7

    .line 124
    invoke-interface {p0, v4}, Ldefpackage/qn4;->k(I)J

    .line 125
    .line 126
    .line 127
    move-result-wide p0

    .line 128
    sub-long v9, v0, p0

    .line 129
    .line 130
    invoke-direct/range {v6 .. v11}, Ldefpackage/lg0;-><init>(JJLjava/util/List;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p2, v6}, Ldefpackage/wc0;->accept(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_7
    return-void
.end method

.method public static e(Ljava/util/ArrayList;Ljava/lang/Comparable;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, ")."

    .line 14
    .line 15
    if-ltz v0, :cond_4

    .line 16
    .line 17
    if-gt v0, v1, :cond_3

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    :goto_0
    if-gt v2, v0, :cond_2

    .line 22
    .line 23
    add-int v1, v2, v0

    .line 24
    .line 25
    ushr-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/Comparable;

    .line 32
    .line 33
    invoke-static {v3, p1}, Ldefpackage/fu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-gez v3, :cond_0

    .line 38
    .line 39
    add-int/lit8 v2, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    if-lez v3, :cond_1

    .line 43
    .line 44
    add-int/lit8 v0, v1, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return v1

    .line 48
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    neg-int p0, v2

    .line 51
    return p0

    .line 52
    :cond_3
    const-string p0, "toIndex ("

    .line 53
    .line 54
    const-string p1, ") is greater than size ("

    .line 55
    .line 56
    invoke-static {p0, p1, v0, v1, v3}, Ldefpackage/b11;->n(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Ldefpackage/kf2;->h(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return v2

    .line 64
    :cond_4
    const-string p0, ") is greater than toIndex ("

    .line 65
    .line 66
    const-string p1, "fromIndex ("

    .line 67
    .line 68
    invoke-static {p1, p0, v2, v0, v3}, Ldefpackage/b11;->n(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return v2
.end method

.method public static e0(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static f(Ldefpackage/qb2;)Ldefpackage/qb2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/qb2;->g()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ldefpackage/qb2;->p:Z

    .line 6
    .line 7
    iget v0, p0, Ldefpackage/qb2;->o:I

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ldefpackage/qb2;->q:Ldefpackage/qb2;

    .line 13
    .line 14
    return-object p0
.end method

.method public static final g(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;
    .locals 22

    .line 1
    sget-object v0, Ldefpackage/ge3;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "/"

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/tv1;->z(Ljava/lang/String;)Ldefpackage/ge3;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v1, Ldefpackage/ne5;

    .line 10
    .line 11
    const/16 v18, 0x0

    .line 12
    .line 13
    const v19, 0xfffc

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    const-wide/16 v7, 0x0

    .line 21
    .line 22
    const-wide/16 v9, 0x0

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const-wide/16 v12, 0x0

    .line 26
    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    invoke-direct/range {v1 .. v19}, Ldefpackage/ne5;-><init>(Ldefpackage/ge3;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Ldefpackage/kd3;

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    filled-new-array {v0}, [Ldefpackage/kd3;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-static {v2}, Ldefpackage/lg2;->W(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v0}, Ldefpackage/lg2;->Y(Ljava/util/HashMap;[Ldefpackage/kd3;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ldefpackage/jb2;

    .line 59
    .line 60
    const/16 v2, 0x9

    .line 61
    .line 62
    invoke-direct {v0, v2}, Ldefpackage/jb2;-><init>(I)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v2, p0

    .line 66
    .line 67
    invoke-static {v2, v0}, Ldefpackage/q40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Ldefpackage/ne5;

    .line 86
    .line 87
    iget-object v3, v2, Ldefpackage/ne5;->a:Ldefpackage/ge3;

    .line 88
    .line 89
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Ldefpackage/ne5;

    .line 94
    .line 95
    if-nez v3, :cond_0

    .line 96
    .line 97
    :goto_1
    iget-object v2, v2, Ldefpackage/ne5;->a:Ldefpackage/ge3;

    .line 98
    .line 99
    invoke-virtual {v2}, Ldefpackage/ge3;->b()Ldefpackage/ge3;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-nez v4, :cond_1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Ldefpackage/ne5;

    .line 111
    .line 112
    if-eqz v3, :cond_2

    .line 113
    .line 114
    iget-object v3, v3, Ldefpackage/ne5;->q:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    new-instance v3, Ldefpackage/ne5;

    .line 121
    .line 122
    const/16 v20, 0x0

    .line 123
    .line 124
    const v21, 0xfffc

    .line 125
    .line 126
    .line 127
    const/4 v5, 0x1

    .line 128
    const/4 v6, 0x0

    .line 129
    const-wide/16 v7, 0x0

    .line 130
    .line 131
    const-wide/16 v9, 0x0

    .line 132
    .line 133
    const-wide/16 v11, 0x0

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const-wide/16 v14, 0x0

    .line 137
    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    const/16 v18, 0x0

    .line 143
    .line 144
    const/16 v19, 0x0

    .line 145
    .line 146
    invoke-direct/range {v3 .. v21}, Ldefpackage/ne5;-><init>(Ldefpackage/ge3;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    iget-object v4, v3, Ldefpackage/ne5;->q:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-object v2, v3

    .line 158
    goto :goto_1

    .line 159
    :cond_3
    return-object v1
.end method

.method public static g0(II)Ldefpackage/j02;
    .locals 2

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-gt p1, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ldefpackage/j02;->q:Ldefpackage/j02;

    .line 6
    .line 7
    sget-object p0, Ldefpackage/j02;->q:Ldefpackage/j02;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ldefpackage/j02;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    sub-int/2addr p1, v1

    .line 14
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/h02;-><init>(III)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static h(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p0, Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Ldefpackage/a;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Ldefpackage/gb;->h(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, v1, p0}, Ldefpackage/a;-><init>(ILjava/lang/reflect/Type;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    return-object p0

    .line 29
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 34
    .line 35
    new-instance v0, Ldefpackage/b;

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, v1, v2, p0}, Ldefpackage/b;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 58
    .line 59
    new-instance v0, Ldefpackage/a;

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {v0, v1, p0}, Ldefpackage/a;-><init>(ILjava/lang/reflect/Type;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 74
    .line 75
    new-instance v0, Ldefpackage/c;

    .line 76
    .line 77
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v0, v2, p0, v1}, Ldefpackage/c;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;I)V

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_4
    return-object p0
.end method

.method public static final h0(Ldefpackage/i94;ILdefpackage/i64;)V
    .locals 9

    .line 1
    new-instance v0, Ldefpackage/f13;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v1, v1, [Ldefpackage/i94;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v1, v1}, Ldefpackage/i94;->i(ZZ)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    iget v2, v0, Ldefpackage/f13;->p:I

    .line 16
    .line 17
    invoke-virtual {v0, p0, v2}, Ldefpackage/f13;->d(Ljava/util/List;I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_1
    iget p0, v0, Ldefpackage/f13;->p:I

    .line 21
    .line 22
    if-eqz p0, :cond_7

    .line 23
    .line 24
    add-int/lit8 p0, p0, -0x1

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ldefpackage/i94;

    .line 31
    .line 32
    invoke-static {p0}, Ldefpackage/wr1;->H(Ldefpackage/i94;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iget-object v3, p0, Ldefpackage/i94;->d:Ldefpackage/e94;

    .line 37
    .line 38
    iget-object v4, v3, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    sget-object v2, Ldefpackage/n94;->j:Ldefpackage/p94;

    .line 43
    .line 44
    invoke-virtual {v4, v2}, Ldefpackage/w03;->c(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p0}, Ldefpackage/i94;->d()Ldefpackage/f63;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_6

    .line 56
    .line 57
    const/4 v5, 0x1

    .line 58
    invoke-static {v2, v5}, Ldefpackage/wr1;->d(Ldefpackage/q62;Z)Ldefpackage/wv3;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-static {v6}, Ldefpackage/rr2;->Q(Ldefpackage/wv3;)Ldefpackage/k02;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    iget v7, v6, Ldefpackage/k02;->a:I

    .line 67
    .line 68
    iget v8, v6, Ldefpackage/k02;->c:I

    .line 69
    .line 70
    if-ge v7, v8, :cond_0

    .line 71
    .line 72
    iget v7, v6, Ldefpackage/k02;->b:I

    .line 73
    .line 74
    iget v8, v6, Ldefpackage/k02;->d:I

    .line 75
    .line 76
    if-lt v7, v8, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    sget-object v7, Ldefpackage/d94;->e:Ldefpackage/p94;

    .line 80
    .line 81
    iget-object v3, v3, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 82
    .line 83
    invoke-virtual {v3, v7}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const/4 v7, 0x0

    .line 88
    if-nez v3, :cond_3

    .line 89
    .line 90
    move-object v3, v7

    .line 91
    :cond_3
    check-cast v3, Ldefpackage/wf1;

    .line 92
    .line 93
    sget-object v8, Ldefpackage/n94;->v:Ldefpackage/p94;

    .line 94
    .line 95
    invoke-virtual {v4, v8}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    if-nez v4, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move-object v7, v4

    .line 103
    :goto_2
    check-cast v7, Ldefpackage/h64;

    .line 104
    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    if-eqz v7, :cond_5

    .line 108
    .line 109
    iget-object v3, v7, Ldefpackage/h64;->b:Ldefpackage/v82;

    .line 110
    .line 111
    invoke-virtual {v3}, Ldefpackage/v82;->invoke()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    const/4 v4, 0x0

    .line 122
    cmpl-float v3, v3, v4

    .line 123
    .line 124
    if-lez v3, :cond_5

    .line 125
    .line 126
    add-int/2addr v5, p1

    .line 127
    new-instance v3, Ldefpackage/j64;

    .line 128
    .line 129
    invoke-direct {v3, p0, v5, v6, v2}, Ldefpackage/j64;-><init>(Ldefpackage/i94;ILdefpackage/k02;Ldefpackage/f63;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, v3}, Ldefpackage/i64;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-static {p0, v5, p2}, Ldefpackage/gb;->h0(Ldefpackage/i94;ILdefpackage/i64;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    invoke-virtual {p0, v1, v1}, Ldefpackage/i94;->i(ZZ)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_6
    const-string p0, "Expected semantics node to have a coordinator."

    .line 146
    .line 147
    invoke-static {p0}, Ldefpackage/xa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    throw p0

    .line 152
    :cond_7
    return-void
.end method

.method public static i(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    :goto_1
    invoke-static {p0}, Ldefpackage/vr1;->d(Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static final i0(JLdefpackage/r;Ldefpackage/ha0;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Ldefpackage/mx0;->n:Ldefpackage/om0;

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v2, p0, v0

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-lez v2, :cond_0

    .line 9
    .line 10
    move v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    :goto_0
    const/4 v4, 0x0

    .line 14
    if-ne v2, v3, :cond_3

    .line 15
    .line 16
    const-wide/32 v5, 0xf423f

    .line 17
    .line 18
    .line 19
    sget-object v2, Ldefpackage/ox0;->o:Ldefpackage/ox0;

    .line 20
    .line 21
    invoke-static {v5, v6, v2}, Ldefpackage/e35;->W(JLdefpackage/ox0;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    invoke-static {p0, p1, v5, v6}, Ldefpackage/mx0;->b(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    long-to-int v2, p0

    .line 30
    and-int/2addr v2, v3

    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    sget-wide v5, Ldefpackage/mx0;->o:J

    .line 34
    .line 35
    cmp-long v2, p0, v5

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    sget-wide v5, Ldefpackage/mx0;->p:J

    .line 40
    .line 41
    cmp-long v2, p0, v5

    .line 42
    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    shr-long/2addr p0, v3

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :goto_1
    sget-object v2, Ldefpackage/ox0;->p:Ldefpackage/ox0;

    .line 49
    .line 50
    invoke-static {p0, p1, v2}, Ldefpackage/mx0;->c(JLdefpackage/ox0;)J

    .line 51
    .line 52
    .line 53
    move-result-wide p0

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    if-nez v2, :cond_5

    .line 56
    .line 57
    move-wide p0, v0

    .line 58
    :goto_2
    cmp-long v0, p0, v0

    .line 59
    .line 60
    if-lez v0, :cond_4

    .line 61
    .line 62
    new-instance v0, Ldefpackage/gu4;

    .line 63
    .line 64
    invoke-direct {v0, p0, p1, p3}, Ldefpackage/gu4;-><init>(JLdefpackage/wd0;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, p2}, Ldefpackage/gb;->Z(Ldefpackage/gu4;Ldefpackage/wf1;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_4
    new-instance p0, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 73
    .line 74
    const-string p1, "Timed out immediately"

    .line 75
    .line 76
    invoke-direct {p0, p1, v4}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;Ldefpackage/gu4;)V

    .line 77
    .line 78
    .line 79
    throw p0

    .line 80
    :cond_5
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 81
    .line 82
    .line 83
    return-object v4
.end method

.method public static j(FF)F
    .locals 1

    .line 1
    cmpl-float v0, p0, p1

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    return p0
.end method

.method public static final j0(JLdefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Ldefpackage/hu4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ldefpackage/hu4;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/hu4;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldefpackage/hu4;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/hu4;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ldefpackage/wd0;-><init>(Ldefpackage/vd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ldefpackage/hu4;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/hu4;->p:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Ldefpackage/hu4;->n:Ldefpackage/jx3;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p3}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-object p3

    .line 41
    :catch_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p3}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v4, 0x0

    .line 53
    .line 54
    cmp-long p3, p0, v4

    .line 55
    .line 56
    if-gtz p3, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    new-instance p3, Ldefpackage/jx3;

    .line 60
    .line 61
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iput-object p3, v0, Ldefpackage/hu4;->n:Ldefpackage/jx3;

    .line 65
    .line 66
    iput v3, v0, Ldefpackage/hu4;->p:I

    .line 67
    .line 68
    new-instance v1, Ldefpackage/gu4;

    .line 69
    .line 70
    invoke-direct {v1, p0, p1, v0}, Ldefpackage/gu4;-><init>(JLdefpackage/wd0;)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p3, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {v1, p2}, Ldefpackage/gb;->Z(Ldefpackage/gu4;Ldefpackage/wf1;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 79
    sget-object p1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 80
    .line 81
    if-ne p0, p1, :cond_4

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_4
    return-object p0

    .line 85
    :catch_1
    move-exception p1

    .line 86
    move-object p0, p3

    .line 87
    :goto_1
    iget-object p2, p1, Lkotlinx/coroutines/TimeoutCancellationException;->n:Ldefpackage/s22;

    .line 88
    .line 89
    iget-object p0, p0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 90
    .line 91
    if-ne p2, p0, :cond_5

    .line 92
    .line 93
    :goto_2
    return-object v2

    .line 94
    :cond_5
    throw p1
.end method

.method public static k(DDD)D
    .locals 1

    .line 1
    cmpl-double v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-double v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmpl-double p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p4, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x2e

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static l(FFF)F
    .locals 2

    .line 1
    cmpl-float v0, p1, p2

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-float v0, p0, p1

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    cmpl-float p1, p0, p2

    .line 11
    .line 12
    if-lez p1, :cond_1

    .line 13
    .line 14
    return p2

    .line 15
    :cond_1
    return p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p1, 0x2e

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static m(III)I
    .locals 2

    .line 1
    if-gt p1, p2, :cond_2

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    if-le p0, p2, :cond_1

    .line 7
    .line 8
    return p2

    .line 9
    :cond_1
    return p0

    .line 10
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p2, " is less than minimum "

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x2e

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static n(JJJ)J
    .locals 1

    .line 1
    cmp-long v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmp-long v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmp-long p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p4, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x2e

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static final o(Landroid/content/Context;)Ldefpackage/ia1;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/ia1;

    .line 2
    .line 3
    new-instance v1, Ldefpackage/pa;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2}, Ldefpackage/pa;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v3, 0x1f

    .line 15
    .line 16
    if-lt v2, v3, :cond_0

    .line 17
    .line 18
    sget-object v2, Ldefpackage/hb1;->a:Ldefpackage/hb1;

    .line 19
    .line 20
    invoke-virtual {v2, p0}, Ldefpackage/hb1;->a(Landroid/content/Context;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    :goto_0
    new-instance v2, Ldefpackage/zb;

    .line 27
    .line 28
    invoke-direct {v2, p0}, Ldefpackage/zb;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, Ldefpackage/ia1;-><init>(Ldefpackage/pa;Ldefpackage/zb;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public static p(Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/b3;
    .locals 3

    .line 1
    const-string v0, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL"

    .line 2
    .line 3
    const-string v1, "androidx.credentials.TYPE_RESTORE_CREDENTIAL"

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    sparse-switch v2, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :sswitch_0
    const-string v0, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_0
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_0 .. :try_end_0} :catch_5

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    :try_start_1
    const-string v0, "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ldefpackage/dq0;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-direct {v1, v0, v2, p1}, Ldefpackage/dq0;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :catch_0
    :try_start_2
    new-instance v0, Landroidx/credentials/internal/FrameworkClassParsingException;

    .line 42
    .line 43
    invoke-direct {v0}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :sswitch_1
    const-string v0, "android.credentials.TYPE_PASSWORD_CREDENTIAL"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0
    :try_end_2
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_2 .. :try_end_2} :catch_5

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    :try_start_3
    const-string v0, "androidx.credentials.BUNDLE_KEY_ID"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "androidx.credentials.BUNDLE_KEY_PASSWORD"

    .line 62
    .line 63
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v2, Ldefpackage/dq0;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x1

    .line 76
    invoke-direct {v2, v1, v0, p1}, Ldefpackage/dq0;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :catch_1
    :try_start_4
    new-instance v0, Landroidx/credentials/internal/FrameworkClassParsingException;

    .line 81
    .line 82
    invoke-direct {v0}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :sswitch_2
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    const-string v0, "androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE"

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    new-instance v2, Ldefpackage/dq0;

    .line 101
    .line 102
    invoke-direct {v2, v1, p1}, Ldefpackage/b3;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 106
    .line 107
    .line 108
    move-result v1
    :try_end_4
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_4 .. :try_end_4} :catch_5

    .line 109
    if-eqz v1, :cond_0

    .line 110
    .line 111
    :try_start_5
    new-instance v1, Lorg/json/JSONObject;

    .line 112
    .line 113
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 114
    .line 115
    .line 116
    return-object v2

    .line 117
    :catch_2
    :cond_0
    :try_start_6
    const-string v0, "authenticationResponseJson must not be empty, and must be a valid JSON"

    .line 118
    .line 119
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 120
    .line 121
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_1
    new-instance v0, Landroidx/credentials/exceptions/NoCredentialException;

    .line 126
    .line 127
    const-string v1, "The device does not contain a restore credential."

    .line 128
    .line 129
    invoke-direct {v0, v1}, Landroidx/credentials/exceptions/NoCredentialException;-><init>(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :sswitch_3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1
    :try_end_6
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_6 .. :try_end_6} :catch_5

    .line 137
    if-eqz v1, :cond_3

    .line 138
    .line 139
    :try_start_7
    const-string v1, "androidx.credentials.BUNDLE_KEY_REQUEST_JSON"

    .line 140
    .line 141
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    new-instance v2, Ldefpackage/dq0;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-direct {v2, v0, p1}, Ldefpackage/b3;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 154
    .line 155
    .line 156
    move-result v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 157
    if-eqz v0, :cond_2

    .line 158
    .line 159
    :try_start_8
    new-instance v0, Lorg/json/JSONObject;

    .line 160
    .line 161
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 162
    .line 163
    .line 164
    return-object v2

    .line 165
    :catch_3
    :cond_2
    :try_start_9
    const-string v0, "credentialJson must not be empty, and must be a valid JSON"

    .line 166
    .line 167
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    .line 173
    :catch_4
    :try_start_a
    new-instance v0, Landroidx/credentials/internal/FrameworkClassParsingException;

    .line 174
    .line 175
    invoke-direct {v0}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    .line 176
    .line 177
    .line 178
    throw v0

    .line 179
    :cond_3
    :goto_0
    new-instance v0, Landroidx/credentials/internal/FrameworkClassParsingException;

    .line 180
    .line 181
    invoke-direct {v0}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    .line 182
    .line 183
    .line 184
    throw v0
    :try_end_a
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_a .. :try_end_a} :catch_5

    .line 185
    :catch_5
    new-instance v0, Ldefpackage/tg0;

    .line 186
    .line 187
    invoke-direct {v0, p0, p1}, Ldefpackage/tg0;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 188
    .line 189
    .line 190
    return-object v0

    .line 191
    :sswitch_data_0
    .sparse-switch
        -0x640a7654 -> :sswitch_3
        -0x3ff0a08a -> :sswitch_2
        -0x20663139 -> :sswitch_1
        -0x5aa2881 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final q(Ldefpackage/gk1;Ldefpackage/b45;)V
    .locals 7

    .line 1
    iget-object p1, p1, Ldefpackage/b45;->w:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_3

    .line 9
    .line 10
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ldefpackage/d45;

    .line 15
    .line 16
    instance-of v3, v2, Ldefpackage/f45;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    new-instance v3, Ldefpackage/he3;

    .line 22
    .line 23
    invoke-direct {v3}, Ldefpackage/he3;-><init>()V

    .line 24
    .line 25
    .line 26
    check-cast v2, Ldefpackage/f45;

    .line 27
    .line 28
    iget-object v5, v2, Ldefpackage/f45;->o:Ljava/util/List;

    .line 29
    .line 30
    iput-object v5, v3, Ldefpackage/he3;->d:Ljava/util/List;

    .line 31
    .line 32
    iput-boolean v4, v3, Ldefpackage/he3;->n:Z

    .line 33
    .line 34
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 35
    .line 36
    .line 37
    iget v5, v2, Ldefpackage/f45;->p:I

    .line 38
    .line 39
    iget-object v6, v3, Ldefpackage/he3;->s:Ldefpackage/nc;

    .line 40
    .line 41
    iget-object v6, v6, Ldefpackage/nc;->a:Landroid/graphics/Path;

    .line 42
    .line 43
    if-ne v5, v4, :cond_0

    .line 44
    .line 45
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 49
    .line 50
    :goto_1
    invoke-virtual {v6, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 57
    .line 58
    .line 59
    iget-object v5, v2, Ldefpackage/f45;->q:Ldefpackage/uo;

    .line 60
    .line 61
    iput-object v5, v3, Ldefpackage/he3;->b:Ldefpackage/uo;

    .line 62
    .line 63
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 64
    .line 65
    .line 66
    iget v5, v2, Ldefpackage/f45;->r:F

    .line 67
    .line 68
    iput v5, v3, Ldefpackage/he3;->c:F

    .line 69
    .line 70
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 71
    .line 72
    .line 73
    iget-object v5, v2, Ldefpackage/f45;->s:Ldefpackage/uo;

    .line 74
    .line 75
    iput-object v5, v3, Ldefpackage/he3;->g:Ldefpackage/uo;

    .line 76
    .line 77
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 78
    .line 79
    .line 80
    iget v5, v2, Ldefpackage/f45;->t:F

    .line 81
    .line 82
    iput v5, v3, Ldefpackage/he3;->e:F

    .line 83
    .line 84
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 85
    .line 86
    .line 87
    iget v5, v2, Ldefpackage/f45;->u:F

    .line 88
    .line 89
    iput v5, v3, Ldefpackage/he3;->f:F

    .line 90
    .line 91
    iput-boolean v4, v3, Ldefpackage/he3;->o:Z

    .line 92
    .line 93
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 94
    .line 95
    .line 96
    iget v5, v2, Ldefpackage/f45;->v:I

    .line 97
    .line 98
    iput v5, v3, Ldefpackage/he3;->h:I

    .line 99
    .line 100
    iput-boolean v4, v3, Ldefpackage/he3;->o:Z

    .line 101
    .line 102
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 103
    .line 104
    .line 105
    iget v5, v2, Ldefpackage/f45;->w:I

    .line 106
    .line 107
    iput v5, v3, Ldefpackage/he3;->i:I

    .line 108
    .line 109
    iput-boolean v4, v3, Ldefpackage/he3;->o:Z

    .line 110
    .line 111
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 112
    .line 113
    .line 114
    iget v5, v2, Ldefpackage/f45;->x:F

    .line 115
    .line 116
    iput v5, v3, Ldefpackage/he3;->j:F

    .line 117
    .line 118
    iput-boolean v4, v3, Ldefpackage/he3;->o:Z

    .line 119
    .line 120
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 121
    .line 122
    .line 123
    iget v5, v2, Ldefpackage/f45;->y:F

    .line 124
    .line 125
    iput v5, v3, Ldefpackage/he3;->k:F

    .line 126
    .line 127
    iput-boolean v4, v3, Ldefpackage/he3;->p:Z

    .line 128
    .line 129
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 130
    .line 131
    .line 132
    iget v5, v2, Ldefpackage/f45;->z:F

    .line 133
    .line 134
    iput v5, v3, Ldefpackage/he3;->l:F

    .line 135
    .line 136
    iput-boolean v4, v3, Ldefpackage/he3;->p:Z

    .line 137
    .line 138
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 139
    .line 140
    .line 141
    iget v2, v2, Ldefpackage/f45;->A:F

    .line 142
    .line 143
    iput v2, v3, Ldefpackage/he3;->m:F

    .line 144
    .line 145
    iput-boolean v4, v3, Ldefpackage/he3;->p:Z

    .line 146
    .line 147
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v1, v3}, Ldefpackage/gk1;->e(ILdefpackage/i35;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_1
    instance-of v3, v2, Ldefpackage/b45;

    .line 155
    .line 156
    if-eqz v3, :cond_2

    .line 157
    .line 158
    new-instance v3, Ldefpackage/gk1;

    .line 159
    .line 160
    invoke-direct {v3}, Ldefpackage/gk1;-><init>()V

    .line 161
    .line 162
    .line 163
    check-cast v2, Ldefpackage/b45;

    .line 164
    .line 165
    iget-object v5, v2, Ldefpackage/b45;->n:Ljava/lang/String;

    .line 166
    .line 167
    iput-object v5, v3, Ldefpackage/gk1;->k:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 170
    .line 171
    .line 172
    iget v5, v2, Ldefpackage/b45;->o:F

    .line 173
    .line 174
    iput v5, v3, Ldefpackage/gk1;->l:F

    .line 175
    .line 176
    iput-boolean v4, v3, Ldefpackage/gk1;->s:Z

    .line 177
    .line 178
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 179
    .line 180
    .line 181
    iget v5, v2, Ldefpackage/b45;->r:F

    .line 182
    .line 183
    iput v5, v3, Ldefpackage/gk1;->o:F

    .line 184
    .line 185
    iput-boolean v4, v3, Ldefpackage/gk1;->s:Z

    .line 186
    .line 187
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 188
    .line 189
    .line 190
    iget v5, v2, Ldefpackage/b45;->s:F

    .line 191
    .line 192
    iput v5, v3, Ldefpackage/gk1;->p:F

    .line 193
    .line 194
    iput-boolean v4, v3, Ldefpackage/gk1;->s:Z

    .line 195
    .line 196
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 197
    .line 198
    .line 199
    iget v5, v2, Ldefpackage/b45;->t:F

    .line 200
    .line 201
    iput v5, v3, Ldefpackage/gk1;->q:F

    .line 202
    .line 203
    iput-boolean v4, v3, Ldefpackage/gk1;->s:Z

    .line 204
    .line 205
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 206
    .line 207
    .line 208
    iget v5, v2, Ldefpackage/b45;->u:F

    .line 209
    .line 210
    iput v5, v3, Ldefpackage/gk1;->r:F

    .line 211
    .line 212
    iput-boolean v4, v3, Ldefpackage/gk1;->s:Z

    .line 213
    .line 214
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 215
    .line 216
    .line 217
    iget v5, v2, Ldefpackage/b45;->p:F

    .line 218
    .line 219
    iput v5, v3, Ldefpackage/gk1;->m:F

    .line 220
    .line 221
    iput-boolean v4, v3, Ldefpackage/gk1;->s:Z

    .line 222
    .line 223
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 224
    .line 225
    .line 226
    iget v5, v2, Ldefpackage/b45;->q:F

    .line 227
    .line 228
    iput v5, v3, Ldefpackage/gk1;->n:F

    .line 229
    .line 230
    iput-boolean v4, v3, Ldefpackage/gk1;->s:Z

    .line 231
    .line 232
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 233
    .line 234
    .line 235
    iget-object v5, v2, Ldefpackage/b45;->v:Ljava/util/List;

    .line 236
    .line 237
    iput-object v5, v3, Ldefpackage/gk1;->f:Ljava/util/List;

    .line 238
    .line 239
    iput-boolean v4, v3, Ldefpackage/gk1;->g:Z

    .line 240
    .line 241
    invoke-virtual {v3}, Ldefpackage/i35;->c()V

    .line 242
    .line 243
    .line 244
    invoke-static {v3, v2}, Ldefpackage/gb;->q(Ldefpackage/gk1;Ldefpackage/b45;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v1, v3}, Ldefpackage/gk1;->e(ILdefpackage/i35;)V

    .line 248
    .line 249
    .line 250
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_3
    return-void
.end method

.method public static r()Ldefpackage/qb2;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/qb2;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/qb2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static s([BII)Landroid/graphics/Bitmap;
    .locals 10

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 12
    .line 13
    invoke-static {p0, v1, p1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 17
    .line 18
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 19
    .line 20
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 25
    .line 26
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 27
    .line 28
    :goto_0
    if-le v3, p2, :cond_1

    .line 29
    .line 30
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 31
    .line 32
    mul-int/lit8 v4, v4, 0x2

    .line 33
    .line 34
    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 35
    .line 36
    div-int/lit8 v3, v3, 0x2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    :cond_1
    invoke-static {p0, v1, p1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 47
    .line 48
    :cond_2
    if-eqz v3, :cond_5

    .line 49
    .line 50
    new-instance p1, Ljava/io/ByteArrayInputStream;

    .line 51
    .line 52
    invoke-direct {p1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 53
    .line 54
    .line 55
    :try_start_0
    new-instance p0, Ldefpackage/f31;

    .line 56
    .line 57
    invoke-direct {p0, p1}, Ldefpackage/f31;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 61
    .line 62
    .line 63
    const-string p1, "Orientation"

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ldefpackage/f31;->c(Ljava/lang/String;)Ldefpackage/b31;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-nez p1, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    :try_start_1
    iget-object p0, p0, Ldefpackage/f31;->f:Ljava/nio/ByteOrder;

    .line 73
    .line 74
    invoke-virtual {p1, p0}, Ldefpackage/b31;->e(Ljava/nio/ByteOrder;)I

    .line 75
    .line 76
    .line 77
    move-result v2
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    :catch_0
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :pswitch_0
    const/16 v1, 0x5a

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :pswitch_1
    const/16 v1, 0x10e

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :pswitch_2
    const/16 v1, 0xb4

    .line 89
    .line 90
    :goto_2
    if-eqz v1, :cond_4

    .line 91
    .line 92
    new-instance v8, Landroid/graphics/Matrix;

    .line 93
    .line 94
    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 95
    .line 96
    .line 97
    int-to-float p0, v1

    .line 98
    invoke-virtual {v8, p0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    const/4 v9, 0x0

    .line 110
    const/4 v4, 0x0

    .line 111
    const/4 v5, 0x0

    .line 112
    invoke-static/range {v3 .. v9}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_4
    return-object v3

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    move-object p0, v0

    .line 120
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :catchall_1
    move-exception v0

    .line 125
    move-object p1, v0

    .line 126
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    throw p0

    .line 130
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string p1, "Could not decode image data"

    .line 136
    .line 137
    invoke-static {p0, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    throw p0

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static final t(II[F[F)F
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    mul-int/2addr p0, v0

    .line 3
    aget v1, p2, p0

    .line 4
    .line 5
    aget v2, p3, p1

    .line 6
    .line 7
    mul-float/2addr v1, v2

    .line 8
    add-int/lit8 v2, p0, 0x1

    .line 9
    .line 10
    aget v2, p2, v2

    .line 11
    .line 12
    add-int/2addr v0, p1

    .line 13
    aget v0, p3, v0

    .line 14
    .line 15
    mul-float/2addr v2, v0

    .line 16
    add-float/2addr v2, v1

    .line 17
    add-int/lit8 v0, p0, 0x2

    .line 18
    .line 19
    aget v0, p2, v0

    .line 20
    .line 21
    const/16 v1, 0x8

    .line 22
    .line 23
    add-int/2addr v1, p1

    .line 24
    aget v1, p3, v1

    .line 25
    .line 26
    mul-float/2addr v0, v1

    .line 27
    add-float/2addr v0, v2

    .line 28
    add-int/lit8 p0, p0, 0x3

    .line 29
    .line 30
    aget p0, p2, p0

    .line 31
    .line 32
    const/16 p2, 0xc

    .line 33
    .line 34
    add-int/2addr p2, p1

    .line 35
    aget p1, p3, p2

    .line 36
    .line 37
    mul-float/2addr p0, p1

    .line 38
    add-float/2addr p0, v0

    .line 39
    return p0
.end method

.method public static final u(Ldefpackage/ne0;)V
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/fz0;->h0:Ldefpackage/fz0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/s22;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ldefpackage/s22;->b()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p0}, Ldefpackage/s22;->q()Ljava/util/concurrent/CancellationException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0

    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public static v(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of v1, p0, Ljava/lang/reflect/ParameterizedType;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    instance-of v1, p1, Ljava/lang/reflect/ParameterizedType;

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 25
    .line 26
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    return v0

    .line 71
    :cond_3
    return v2

    .line 72
    :cond_4
    instance-of v1, p0, Ljava/lang/reflect/GenericArrayType;

    .line 73
    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    .line 77
    .line 78
    if-nez v0, :cond_5

    .line 79
    .line 80
    return v2

    .line 81
    :cond_5
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 82
    .line 83
    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p0, p1}, Ldefpackage/gb;->v(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    return p0

    .line 98
    :cond_6
    instance-of v1, p0, Ljava/lang/reflect/WildcardType;

    .line 99
    .line 100
    if-eqz v1, :cond_9

    .line 101
    .line 102
    instance-of v1, p1, Ljava/lang/reflect/WildcardType;

    .line 103
    .line 104
    if-nez v1, :cond_7

    .line 105
    .line 106
    return v2

    .line 107
    :cond_7
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 108
    .line 109
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_8

    .line 138
    .line 139
    return v0

    .line 140
    :cond_8
    return v2

    .line 141
    :cond_9
    instance-of v1, p0, Ljava/lang/reflect/TypeVariable;

    .line 142
    .line 143
    if-eqz v1, :cond_b

    .line 144
    .line 145
    instance-of v1, p1, Ljava/lang/reflect/TypeVariable;

    .line 146
    .line 147
    if-nez v1, :cond_a

    .line 148
    .line 149
    return v2

    .line 150
    :cond_a
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 151
    .line 152
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    if-ne v1, v3, :cond_b

    .line 163
    .line 164
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    if-eqz p0, :cond_b

    .line 177
    .line 178
    return v0

    .line 179
    :cond_b
    return v2
.end method

.method public static w(Ldefpackage/ci0;Ljava/lang/String;[BLjava/util/Map;)Ldefpackage/qm2;
    .locals 17

    .line 1
    new-instance v1, Ldefpackage/yl4;

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    invoke-direct {v1, v0}, Ldefpackage/yl4;-><init>(Ldefpackage/ci0;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const-string v0, "The uri must be set."

    .line 15
    .line 16
    invoke-static {v3, v0}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v5, Ldefpackage/ii0;

    .line 20
    .line 21
    move-object v2, v5

    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    const/4 v6, 0x2

    .line 25
    const-wide/16 v9, 0x0

    .line 26
    .line 27
    const-wide/16 v11, -0x1

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v14, 0x1

    .line 31
    move-object/from16 v7, p2

    .line 32
    .line 33
    move-object/from16 v8, p3

    .line 34
    .line 35
    invoke-direct/range {v2 .. v14}, Ldefpackage/ii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    move-object v14, v2

    .line 40
    move v15, v3

    .line 41
    :goto_0
    :try_start_0
    new-instance v4, Ldefpackage/gi0;

    .line 42
    .line 43
    invoke-direct {v4, v1, v14}, Ldefpackage/gi0;-><init>(Ldefpackage/ci0;Ldefpackage/ii0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 44
    .line 45
    .line 46
    :try_start_1
    invoke-static {v4}, Ldefpackage/xw;->b(Ljava/io/InputStream;)[B

    .line 47
    .line 48
    .line 49
    move-result-object v0
    :try_end_1
    .catch Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 50
    move-object v5, v4

    .line 51
    :try_start_2
    new-instance v4, Ldefpackage/ed2;

    .line 52
    .line 53
    iget-object v6, v1, Ldefpackage/yl4;->p:Landroid/net/Uri;

    .line 54
    .line 55
    iget-object v7, v1, Ldefpackage/yl4;->q:Ljava/util/Map;

    .line 56
    .line 57
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v8

    .line 61
    array-length v10, v0
    :try_end_2
    .catch Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    int-to-long v12, v10

    .line 63
    const-wide/16 v10, 0x0

    .line 64
    .line 65
    move-object/from16 v16, v5

    .line 66
    .line 67
    move-object v5, v2

    .line 68
    move-object/from16 v2, v16

    .line 69
    .line 70
    :try_start_3
    invoke-direct/range {v4 .. v13}, Ldefpackage/ed2;-><init>(Ldefpackage/ii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 71
    .line 72
    .line 73
    new-instance v6, Ldefpackage/qr2;

    .line 74
    .line 75
    const/16 v7, 0xc

    .line 76
    .line 77
    invoke-direct {v6, v7, v0}, Ldefpackage/qr2;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object v4, v6, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 81
    .line 82
    new-instance v0, Ldefpackage/qm2;

    .line 83
    .line 84
    invoke-direct {v0, v6}, Ldefpackage/qm2;-><init>(Ldefpackage/qr2;)V
    :try_end_3
    .catch Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 85
    .line 86
    .line 87
    :try_start_4
    invoke-static {v2}, Ldefpackage/f35;->h(Ljava/io/Closeable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :catch_0
    move-exception v0

    .line 92
    :goto_1
    move-object v10, v0

    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto :goto_3

    .line 97
    :catch_1
    move-exception v0

    .line 98
    goto :goto_2

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    move-object/from16 v16, v5

    .line 101
    .line 102
    move-object v5, v2

    .line 103
    move-object/from16 v2, v16

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :catch_2
    move-exception v0

    .line 107
    move-object/from16 v16, v5

    .line 108
    .line 109
    move-object v5, v2

    .line 110
    move-object/from16 v2, v16

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catchall_2
    move-exception v0

    .line 114
    move-object v5, v2

    .line 115
    move-object v2, v4

    .line 116
    goto :goto_3

    .line 117
    :catch_3
    move-exception v0

    .line 118
    move-object v5, v2

    .line 119
    move-object v2, v4

    .line 120
    :goto_2
    :try_start_5
    iget v4, v0, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;->p:I

    .line 121
    .line 122
    const/16 v6, 0x133

    .line 123
    .line 124
    const/4 v7, 0x0

    .line 125
    if-eq v4, v6, :cond_0

    .line 126
    .line 127
    const/16 v6, 0x134

    .line 128
    .line 129
    if-ne v4, v6, :cond_1

    .line 130
    .line 131
    :cond_0
    const/4 v4, 0x5

    .line 132
    if-ge v15, v4, :cond_1

    .line 133
    .line 134
    iget-object v4, v0, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;->q:Ljava/util/Map;

    .line 135
    .line 136
    if-eqz v4, :cond_1

    .line 137
    .line 138
    const-string v6, "Location"

    .line 139
    .line 140
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Ljava/util/List;

    .line 145
    .line 146
    if-eqz v4, :cond_1

    .line 147
    .line 148
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-nez v6, :cond_1

    .line 153
    .line 154
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    move-object v7, v4

    .line 159
    check-cast v7, Ljava/lang/String;

    .line 160
    .line 161
    :cond_1
    if-eqz v7, :cond_2

    .line 162
    .line 163
    add-int/lit8 v15, v15, 0x1

    .line 164
    .line 165
    invoke-virtual {v14}, Ldefpackage/ii0;->a()Ldefpackage/hi0;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    iput-object v4, v0, Ldefpackage/hi0;->a:Landroid/net/Uri;

    .line 174
    .line 175
    invoke-virtual {v0}, Ldefpackage/hi0;->a()Ldefpackage/ii0;

    .line 176
    .line 177
    .line 178
    move-result-object v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 179
    :try_start_6
    invoke-static {v2}, Ldefpackage/f35;->h(Ljava/io/Closeable;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 180
    .line 181
    .line 182
    move-object v2, v5

    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_2
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 186
    :goto_3
    :try_start_8
    invoke-static {v2}, Ldefpackage/f35;->h(Ljava/io/Closeable;)V

    .line 187
    .line 188
    .line 189
    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 190
    :catch_4
    move-exception v0

    .line 191
    move-object v5, v2

    .line 192
    goto :goto_1

    .line 193
    :goto_4
    new-instance v4, Landroidx/media3/exoplayer/drm/MediaDrmCallbackException;

    .line 194
    .line 195
    iget-object v6, v1, Ldefpackage/yl4;->p:Landroid/net/Uri;

    .line 196
    .line 197
    iget-object v0, v1, Ldefpackage/yl4;->n:Ldefpackage/ci0;

    .line 198
    .line 199
    invoke-interface {v0}, Ldefpackage/ci0;->j()Ljava/util/Map;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    iget-wide v8, v1, Ldefpackage/yl4;->o:J

    .line 204
    .line 205
    invoke-direct/range {v4 .. v10}, Landroidx/media3/exoplayer/drm/MediaDrmCallbackException;-><init>(Ldefpackage/ii0;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Exception;)V

    .line 206
    .line 207
    .line 208
    throw v4
.end method

.method public static final x(Landroid/view/View;)Ldefpackage/v23;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/k5;->A:Ldefpackage/k5;

    .line 5
    .line 6
    invoke-static {v0, p0}, Ldefpackage/fa4;->c0(Ldefpackage/if1;Ljava/lang/Object;)Ldefpackage/aa4;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Ldefpackage/k5;->B:Ldefpackage/k5;

    .line 11
    .line 12
    new-instance v2, Ldefpackage/tq4;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v2, v0, v1, v3}, Ldefpackage/tq4;-><init>(Ljava/lang/Object;Ldefpackage/if1;I)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ldefpackage/o54;

    .line 19
    .line 20
    const/16 v1, 0xd

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ldefpackage/o54;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ldefpackage/h71;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, v2, v3, v0}, Ldefpackage/h71;-><init>(Ldefpackage/aa4;ZLdefpackage/if1;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ldefpackage/g71;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ldefpackage/g71;-><init>(Ldefpackage/h71;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ldefpackage/g71;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    move-object v0, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v0}, Ldefpackage/g71;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    check-cast v0, Ldefpackage/v23;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_1
    const-string v0, "View "

    .line 55
    .line 56
    const-string v1, " does not have a NavController set"

    .line 57
    .line 58
    invoke-static {p0, v1, v0}, Ldefpackage/nz2;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v2
.end method

.method public static y(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Landroidx/appcompat/widget/ActionMenuView;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    check-cast v1, Landroidx/appcompat/widget/ActionMenuView;

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static final z(Ldefpackage/f82;IJLdefpackage/nc3;JLdefpackage/hb3;Ldefpackage/fs;Ldefpackage/gs;Ldefpackage/r62;ZILdefpackage/i03;)Ldefpackage/xi2;
    .locals 12

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v1, p13

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ldefpackage/nc3;->c(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v6

    .line 9
    invoke-virtual {v1, p1}, Ldefpackage/e02;->b(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move-object v3, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual/range {p0 .. p1}, Ldefpackage/f82;->a(I)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    :goto_0
    if-ge v3, v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ldefpackage/pi2;

    .line 40
    .line 41
    invoke-interface {v4, p2, p3}, Ldefpackage/pi2;->r(J)Ldefpackage/jg3;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v1, p1, v2}, Ldefpackage/i03;->i(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v3, v2

    .line 55
    :goto_1
    new-instance v0, Ldefpackage/xi2;

    .line 56
    .line 57
    move v1, p1

    .line 58
    move-wide/from16 v4, p5

    .line 59
    .line 60
    move-object/from16 v7, p7

    .line 61
    .line 62
    move-object/from16 v8, p8

    .line 63
    .line 64
    move-object/from16 v9, p9

    .line 65
    .line 66
    move-object/from16 v10, p10

    .line 67
    .line 68
    move/from16 v11, p11

    .line 69
    .line 70
    move/from16 v2, p12

    .line 71
    .line 72
    invoke-direct/range {v0 .. v11}, Ldefpackage/xi2;-><init>(IILjava/util/List;JLjava/lang/Object;Ldefpackage/hb3;Ldefpackage/fs;Ldefpackage/gs;Ldefpackage/r62;Z)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method


# virtual methods
.method public abstract I()Ldefpackage/zk2;
.end method

.method public abstract f0(Ldefpackage/np2;)V
.end method
