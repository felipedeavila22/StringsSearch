package br.edu.udesc.basicsaboutstrings;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FrutaPorPreco implements Comparator<Fruta> {

	public int compare(Fruta fruta1, Fruta fruta2) {
		if (fruta1 == fruta2)
			return 0;
		if (fruta1 == null)
			return -99;
		if (fruta1.getClass() != fruta2.getClass())
			return -99;
		int compare = (int) (fruta1.getPreco() - fruta2.getPreco());
		return compare;
	}

	public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T, U> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0, Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingDouble(
			ToDoubleFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsFirst(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsLast(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Fruta> reversed() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Fruta> thenComparing(Comparator<? super Fruta> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U extends Comparable<? super U>> Comparator<Fruta> thenComparing(
			Function<? super Fruta, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U> Comparator<Fruta> thenComparing(
			Function<? super Fruta, ? extends U> arg0,
			Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Fruta> thenComparingDouble(
			ToDoubleFunction<? super Fruta> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Fruta> thenComparingInt(ToIntFunction<? super Fruta> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Fruta> thenComparingLong(
			ToLongFunction<? super Fruta> arg0) {
		// TODO Auto-generated method stub
		return null;
	}



}
